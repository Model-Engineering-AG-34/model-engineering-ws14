package at.ac.tuwien.big.forms.alloygen

import at.ac.tuwien.big.forms.Attribute
import at.ac.tuwien.big.forms.AttributeType
import at.ac.tuwien.big.forms.Entity
import at.ac.tuwien.big.forms.EntityModel
import at.ac.tuwien.big.forms.Enumeration
import at.ac.tuwien.big.forms.Relationship
import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class Form2AlloyGenerator implements IGenerator {

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		var entityModel = resource.contents.get(0) as EntityModel
		var name = new File(resource.URI.toFileString).name.replace(".forms", ".als");
	
		fsa.generateFile(name,
'''module ME14
«FOR element : entityModel.entityModelElements»
	«element.generateEntityModelElement()»
«ENDFOR»

fact {
«FOR element : entityModel.entityModelElements»
	«IF element instanceof Entity»
		«FOR feature : element.features»
			«IF feature instanceof Relationship»
				«feature.generateRelationshipConstraints(element)»
			«ENDIF»
		«ENDFOR»
	«ENDIF»
«ENDFOR»
}
'''
		)
	}
	
	def generateRelationshipConstraints(Relationship rel, Entity entity) {
'''
«IF rel.lowerBound != 1»
all v: «entity.name» | #v.«rel.name» >= «rel.lowerBound»
«ENDIF»
«IF rel.upperBound != -1»
«IF rel.lowerBound != 1»
	
«ENDIF»
all v: «entity.name» | #v.«rel.name» =< «rel.upperBound»
«ENDIF»
«IF rel.opposite != null»
all e1: «entity.name», e2: «rel.target.name» | (e1.«rel.name» in e2 implies e2.«rel.opposite.name» in e1) and (e2.«rel.opposite.name» in e1 implies e1.«rel.name» in e2)
«ENDIF»
'''
	}
	
	def dispatch generateEntityModelElement(Entity entity) {
'''sig «entity.name» {
«FOR feature : entity.features BEFORE '	' SEPARATOR ',\n'»
«feature.generateFeature()»
«ENDFOR»
}'''
	}
	
	def dispatch generateEntityModelElement(Enumeration enumeration) {
'''enum «enumeration.name» {
«FOR literal : enumeration.literals BEFORE '	' SEPARATOR ', ' »«literal.name»«ENDFOR»
}'''
	}
	
	def dispatch generateFeature(Attribute attr) {
		if (attr.type == AttributeType.NONE) {
'''		«attr.name»: «attr.mandatory.multiplicity» «attr.enumeration.name»'''
		} else {
'''		«attr.name»: «attr.mandatory.multiplicity» Int'''
		}
	}

	def getMultiplicity(boolean mandatory) {
		if (mandatory) {
			return "one";
		} else {
			return "lone";
		}
	}
	
	def dispatch generateFeature(Relationship rel) {
'''		«rel.name»: «rel.multiplicity» «rel.target.name»'''
	}
	
	def getMultiplicity(Relationship rel) {
		if (rel.lowerBound == 0) {
			if (rel.upperBound == 1) "lone"
			else if (rel.upperBound == -1) "set"
		} else if (rel.lowerBound == 1) {
			if (rel.upperBound == 1) "one"
			else if (rel.upperBound == -1) "some"
		} else {
			"set"
		}
	}
}