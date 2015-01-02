package at.ac.tuwien.big.forms.htmlgen

import java.io.File
import at.ac.tuwien.big.forms.FormModel
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import java.util.List
import at.ac.tuwien.big.forms.TextField
import at.ac.tuwien.big.forms.Table
import at.ac.tuwien.big.forms.CompositeCondition
import at.ac.tuwien.big.forms.AttributeValueCondition
import at.ac.tuwien.big.forms.Condition
import at.ac.tuwien.big.forms.Page
import at.ac.tuwien.big.forms.PageElement
import at.ac.tuwien.big.forms.Form
import at.ac.tuwien.big.forms.AttributePageElement
import at.ac.tuwien.big.forms.Column
import at.ac.tuwien.big.forms.DateSelectionField
import at.ac.tuwien.big.forms.TimeSelectionField
import at.ac.tuwien.big.forms.TextArea
import at.ac.tuwien.big.forms.SelectionField
import at.ac.tuwien.big.forms.AttributeType
import at.ac.tuwien.big.forms.RelationshipPageElement

class Form2HTMLGenerator implements IGenerator {

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val listOfModels = resource.resourceSet.resources
		var formModel = null as FormModel
		for(model : listOfModels){
			if(model.contents.get(0) instanceof FormModel)
				formModel = model.contents.get(0) as FormModel
		}
		val name = new File('output.html');
	
		fsa.generateFile(
			name.toString,
			'''<!DOCTYPE html>
				<html lang="en">
				«generateHead(formModel)»
					<body>
						«generateForms(formModel)»		
					</body>
				</html>'''	
		)
	}
	
	def generateForms(FormModel formModel){
		'''«FOR form : formModel.forms»
			<div class="form" id="«form.name»">
				<form action="#" class="register">
					<h1>«form.title»</h1>
					<h2>«form.description»</h2>
					«generatePage(form)»
				</form>
			</div>
		«ENDFOR»'''							
	}
	
	def generatePage(Form form)
	{
		'''«FOR page : form.pages»
			<div class="page" id="«page.title»">
				<fieldset class="row1">
					<h3>«page.title»</h3>
					«generateElement(page)»
				</fieldset>
			</div>
			«ENDFOR»'''
	}
	def generateElement(Page page)
	{
		'''«FOR element:page.pageElements»
				«IF element instanceof AttributePageElement»
					«generateAttributeElement(element as AttributePageElement)»
				«ENDIF»
				«IF element instanceof RelationshipPageElement»
					«generateRelationshipElement(element as RelationshipPageElement)»
				«ENDIF»
			«ENDFOR»'''
	}
	def generateAttributeElement(AttributePageElement attrElement){
		'''«IF !(attrElement instanceof Column)»
			<p>
				<label for="«attrElement.elementID»">«attrElement.label»«IF attrElement.attribute.mandatory»<span>*</span>«ENDIF»</label>
				«generateField(attrElement)»
			</p>
			«ENDIF»
			'''
	}
	def generateRelationshipElement(RelationshipPageElement relElement){
		'''«IF relElement instanceof at.ac.tuwien.big.forms.List»
			<div class="list" id="«relElement.elementID»">
				<fieldset class="row1">
					<legend class="legend">«relElement.label» List</legend>
					<ul></ul>
				</fieldset>
			</div>
		«ENDIF»
		«IF relElement instanceof Table»
		<div class="table" id="«relElement.elementID»">
			<fieldset class="row1">
				<legend class="legend">«relElement.label» Table</legend>
				<table>
					<tr id=«relElement.elementID»_header>
					«FOR column: relElement.columns»	
						<th>«column.label»</th>
					«ENDFOR»
					</tr>
				</table>
			</fieldset>
		</div>
		«ENDIF»'''
	}
	
	def generateField(AttributePageElement attrElement)	{
		switch attrElement{
				TextField: '''<input type="text" id="«attrElement.elementID»" «IF attrElement.attribute.mandatory»class="mandatory"«ENDIF»/>'''
				DateSelectionField: '''<input type="date" id="«attrElement.elementID»" «IF attrElement.attribute.mandatory»class="mandatory"«ENDIF»/>'''
				TimeSelectionField: '''<input type="time" id="«attrElement.elementID»" «IF attrElement.attribute.mandatory»class="mandatory"«ENDIF»/>'''
				TextArea: '''<textarea id="«attrElement.elementID»" «IF attrElement.attribute.mandatory»class="mandatory"«ENDIF»></textarea>'''
				SelectionField: '''<select id="«attrElement.elementID»" name="«attrElement.attribute.name»" «IF attrElement.attribute.mandatory»class="mandatory"«ENDIF»>
					<option value="default"> </option>
					«IF attrElement.attribute.type == AttributeType.NONE»
						«FOR literal : attrElement.attribute.enumeration.literals»
							<option value="«literal.name»">«literal.value»</option>
						«ENDFOR»
					«ELSE»
						<option value="true">Yes</option>
						<option value="false">No</option>
					«ENDIF»
					</select>
					'''
		}
	}	
	def generateHead(FormModel formModel) {
		
		
		
		'''<head>
				<title>Form</title>
				<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
				<meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
				<link rel="stylesheet" type="text/css" href="../assets/form.css"/>
				<script src="../assets/jquery-1.10.2.min.js" type="text/javascript"></script>
				<script src="../assets/form.js" type="text/javascript"></script>
				<script type="text/javascript">
				$(document).ready(
				function(){	
				«FOR form: formModel.forms»
					«IF form.welcomeForm»				 
						form.addWelcomeForm('«form.title»');
					«ENDIF»
					«FOR page: form.pages»
						«IF page.condition!=null»
							«IF page.condition instanceof CompositeCondition»
								form.addCompositeCondition('«page.condition.conditionID»', null, '«(page.condition as CompositeCondition).compositionType»');
								«registerConditions((page.condition as CompositeCondition).composedConditions.get(0),page.condition as CompositeCondition,page)»
								«registerConditions((page.condition as CompositeCondition).composedConditions.get(1),page.condition as CompositeCondition,page)»
							«ENDIF»
							«IF page.condition instanceof AttributeValueCondition»
								form.addAttributeValueCondition('«page.condition.conditionID»', 
								null, '«page.title»', '«(page.condition as AttributeValueCondition).value»', 
								'«(page.condition as AttributeValueCondition).type»');
							«ENDIF»
						«ENDIF»
						«FOR element: page.pageElements»
							«IF element instanceof TextField»
								«IF element.format !=null && element.format!=''»
								form.addRegularExpression('«element.elementID»', '«element.format»');
								«ENDIF»
							«ENDIF»
							«IF element instanceof Table»
								form.addRelationshipPageElement ('«page.title»', '«element.elementID»', '«element.editingForm.title»','table', '«element.relationship.lowerBound»','«element.relationship.upperBound»');	
							«ENDIF»
							«IF element instanceof at.ac.tuwien.big.forms.List»
								form.addRelationshipPageElement ('«page.title»','«element.elementID»', '«element.editingForm.title»','list', '«element.relationship.lowerBound»','«element.relationship.upperBound»');	
							«ENDIF»
							«IF element.condition!=null»
								«IF element.condition instanceof CompositeCondition»
									form.addCompositeCondition('«element.condition.conditionID»', null, '«(element.condition as CompositeCondition).compositionType»');
									«registerConditions((element.condition as CompositeCondition).composedConditions.get(0),element.condition as CompositeCondition,element)»
									«registerConditions((element.condition as CompositeCondition).composedConditions.get(1),element.condition as CompositeCondition,element)»
								«ENDIF»
								«IF element.condition instanceof AttributeValueCondition»
									form.addAttributeValueCondition('«element.condition.conditionID»', 
									null, '«element.elementID»', '«(element.condition as AttributeValueCondition).value»', 
									'«(element.condition as AttributeValueCondition).type»');
								«ENDIF»
							«ENDIF»
						«ENDFOR»
					«ENDFOR»
				«ENDFOR»
				
				form.init();
				});
				</script>
			</head>'''
	}
	def registerConditions(Condition cond,CompositeCondition parentComposite,Page containerPage){
		'''
		«IF cond instanceof CompositeCondition»
			form.addCompositeCondition('«cond.conditionID»', '«parentComposite.conditionID»', '«(cond as CompositeCondition).compositionType»');
			«registerConditions(cond.composedConditions.get(0),cond,containerPage)»
			«registerConditions(cond.composedConditions.get(1),cond,containerPage)»
		«ENDIF»
		«IF cond instanceof AttributeValueCondition»
			form.addAttributeValueCondition('«cond.conditionID»', 
			«parentComposite.conditionID», '«containerPage.title»', '«(cond as AttributeValueCondition).value»', 
			'«(cond as AttributeValueCondition).type»');
		«ENDIF»'''
	}
	
	def registerConditions(Condition cond,CompositeCondition parentComposite,PageElement containerPageElement){
		'''
		«IF cond instanceof CompositeCondition»
			form.addCompositeCondition('«cond.conditionID»', '«parentComposite.conditionID»', '«(cond as CompositeCondition).compositionType»');
			«registerConditions(cond.composedConditions.get(0),cond,containerPageElement)»
			«registerConditions(cond.composedConditions.get(1),cond,containerPageElement)»
		«ENDIF»
		«IF cond instanceof AttributeValueCondition»
			form.addAttributeValueCondition('«cond.conditionID»', 
			«parentComposite.conditionID», '«containerPageElement.elementID»', '«(cond as AttributeValueCondition).value»', 
			'«(cond as AttributeValueCondition).type»');
		«ENDIF»'''
	}
}