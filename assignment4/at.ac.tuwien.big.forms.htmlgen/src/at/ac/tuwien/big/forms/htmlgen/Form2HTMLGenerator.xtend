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
«««					add HTML elements here
					</body>
				</html>'''	
		)
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
								form.addCompositeCondition('«page.condition.conditionID»', null, '«page.condition.type»');
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
								form.addRegularExpression('«element.elementID»', '«element.format»');
							«ENDIF»
							«IF element instanceof Table»
								form.addRelationshipPageElement ('«page.title»', 
								+'«element.elementID»', '«element.editingForm.title»', 
								+'table', '«element.relationship.lowerBound»', 
								+'«element.relationship.upperBound»');	
							«ENDIF»
							«IF element instanceof at.ac.tuwien.big.forms.List»
								form.addRelationshipPageElement ('«page.title»', 
								+'«element.elementID»', '«element.editingForm.title»', 
								+'list', '«element.relationship.lowerBound»', 
								+'«element.relationship.upperBound»');	
							«ENDIF»
							«IF page.condition!=null»
								«IF page.condition instanceof CompositeCondition»
									form.addCompositeCondition('«page.condition.conditionID»', null, '«page.condition.type»');
									«registerConditions((page.condition as CompositeCondition).composedConditions.get(0),page.condition as CompositeCondition,element)»
									«registerConditions((page.condition as CompositeCondition).composedConditions.get(1),page.condition as CompositeCondition,element)»
								«ENDIF»
								«IF page.condition instanceof AttributeValueCondition»
									form.addAttributeValueCondition('«page.condition.conditionID»', 
									null, '«element.elementID»', '«(page.condition as AttributeValueCondition).value»', 
									'«(page.condition as AttributeValueCondition).type»');
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
			form.addCompositeCondition('«cond.conditionID»', '«parentComposite.conditionID»', '«cond.type»');
			«registerConditions(cond.composedConditions.get(0),cond,containerPage)»
			«registerConditions(cond.composedConditions.get(1),cond,containerPage)»
		«ENDIF»
		«IF cond instanceof AttributeValueCondition»
			form.addAttributeValueCondition('«cond.conditionID»', 
			'«parentComposite.conditionID»', '«containerPage.title»', '«(cond as AttributeValueCondition).value»', 
			'«(cond as AttributeValueCondition).type»');
		«ENDIF»'''
	}
	
	def registerConditions(Condition cond,CompositeCondition parentComposite,PageElement containerPageElement){
		'''
		«IF cond instanceof CompositeCondition»
			form.addCompositeCondition('«cond.conditionID»', '«parentComposite.conditionID»', '«cond.type»');
			«registerConditions(cond.composedConditions.get(0),cond,containerPageElement)»
			«registerConditions(cond.composedConditions.get(1),cond,containerPageElement)»
		«ENDIF»
		«IF cond instanceof AttributeValueCondition»
			form.addAttributeValueCondition('«cond.conditionID»', 
			'«parentComposite.conditionID»', '«containerPageElement.elementID»', '«(cond as AttributeValueCondition).value»', 
			'«(cond as AttributeValueCondition).type»');
		«ENDIF»'''
	}
}