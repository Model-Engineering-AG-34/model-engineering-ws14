/**
 */
package forms.util;

import forms.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see forms.FormsPackage
 * @generated
 */
public class FormsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FormsValidator INSTANCE = new FormsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "forms";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FormsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FormsPackage.ENTITY_MODEL:
				return validateEntityModel((EntityModel)value, diagnostics, context);
			case FormsPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case FormsPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case FormsPackage.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case FormsPackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case FormsPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case FormsPackage.FORM_MODEL:
				return validateFormModel((FormModel)value, diagnostics, context);
			case FormsPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case FormsPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case FormsPackage.PAGE_ELEMENT:
				return validatePageElement((PageElement)value, diagnostics, context);
			case FormsPackage.ATTRIBUTE_PAGE_ELEMENT:
				return validateAttributePageElement((AttributePageElement)value, diagnostics, context);
			case FormsPackage.RELATIONSHIP_PAGE_ELEMENT:
				return validateRelationshipPageElement((RelationshipPageElement)value, diagnostics, context);
			case FormsPackage.TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT:
				return validateTextFieldAttributePageElement((TextFieldAttributePageElement)value, diagnostics, context);
			case FormsPackage.TEXTAREA_ATTRIBUTE_PAGE_ELEMENT:
				return validateTextareaAttributePageElement((TextareaAttributePageElement)value, diagnostics, context);
			case FormsPackage.SELECTION_ATTRIBUTE_PAGE_ELEMENT:
				return validateSelectionAttributePageElement((SelectionAttributePageElement)value, diagnostics, context);
			case FormsPackage.DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT:
				return validateDateSelectionAttributePageElement((DateSelectionAttributePageElement)value, diagnostics, context);
			case FormsPackage.TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT:
				return validateTimeSelectionAttributePageElement((TimeSelectionAttributePageElement)value, diagnostics, context);
			case FormsPackage.LIST_RELATIONSHIP_PAGE_ELEMENT:
				return validateListRelationshipPageElement((ListRelationshipPageElement)value, diagnostics, context);
			case FormsPackage.TABLE_RELATIONSHIP_PAGE_ELEMENT:
				return validateTableRelationshipPageElement((TableRelationshipPageElement)value, diagnostics, context);
			case FormsPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case FormsPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case FormsPackage.ATTRIBUTE_VALUE_CONDITION:
				return validateAttributeValueCondition((AttributeValueCondition)value, diagnostics, context);
			case FormsPackage.COMPOSITE_CONDITION:
				return validateCompositeCondition((CompositeCondition)value, diagnostics, context);
			case FormsPackage.ATTRIBUTE_TYPE:
				return validateAttributeType((AttributeType)value, diagnostics, context);
			case FormsPackage.CONDITION_TYPE:
				return validateConditionType((ConditionType)value, diagnostics, context);
			case FormsPackage.COMPOSITE_CONDITION_OPERATOR:
				return validateCompositeConditionOperator((CompositeConditionOperator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityModel(EntityModel entityModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entityModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entityModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entityModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entityModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entityModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entityModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entityModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entityModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entityModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntityModel_uniqueEntityNames(entityModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueEntityNames constraint of '<em>Entity Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY_MODEL__UNIQUE_ENTITY_NAMES__EEXPRESSION = "self.entities->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)";

	/**
	 * Validates the uniqueEntityNames constraint of '<em>Entity Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityModel_uniqueEntityNames(EntityModel entityModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ENTITY_MODEL,
				 entityModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueEntityNames",
				 ENTITY_MODEL__UNIQUE_ENTITY_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_identifierIsMandatory(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_identifierIsMember(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_superTypeIsNotSelf(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the identifierIsMandatory constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__IDENTIFIER_IS_MANDATORY__EEXPRESSION = "self.id.mandatory = true";

	/**
	 * Validates the identifierIsMandatory constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_identifierIsMandatory(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "identifierIsMandatory",
				 ENTITY__IDENTIFIER_IS_MANDATORY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the identifierIsMember constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__IDENTIFIER_IS_MEMBER__EEXPRESSION = "self.attributes -> includes(self.id) or self.superTypes.attributes -> includes(self.id)";

	/**
	 * Validates the identifierIsMember constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_identifierIsMember(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "identifierIsMember",
				 ENTITY__IDENTIFIER_IS_MEMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the superTypeIsNotSelf constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__SUPER_TYPE_IS_NOT_SELF__EEXPRESSION = "self <> superType";

	/**
	 * Validates the superTypeIsNotSelf constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_superTypeIsNotSelf(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "superTypeIsNotSelf",
				 ENTITY__SUPER_TYPE_IS_NOT_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_checkNone(attribute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkNone constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE__CHECK_NONE__EEXPRESSION = "(self.type = AttributeType::None) <> (self.enumerationType = null)";

	/**
	 * Validates the checkNone constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_checkNone(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ATTRIBUTE,
				 attribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkNone",
				 ATTRIBUTE__CHECK_NONE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType(EnumerationType enumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumerationType_uniqueLiteralNames(enumerationType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueLiteralNames constraint of '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENUMERATION_TYPE__UNIQUE_LITERAL_NAMES__EEXPRESSION = "self.literals->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)";

	/**
	 * Validates the uniqueLiteralNames constraint of '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType_uniqueLiteralNames(EnumerationType enumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ENUMERATION_TYPE,
				 enumerationType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueLiteralNames",
				 ENUMERATION_TYPE__UNIQUE_LITERAL_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationship_upperBoundGreaterThanLowerBound(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationship_oppositeRelastionshipIsValid(relationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the upperBoundGreaterThanLowerBound constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP__UPPER_BOUND_GREATER_THAN_LOWER_BOUND__EEXPRESSION = "self.lowerBound >= 0 and (self.lowerBound <= self.upperBound xor self.upperBound = -1)";

	/**
	 * Validates the upperBoundGreaterThanLowerBound constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_upperBoundGreaterThanLowerBound(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.RELATIONSHIP,
				 relationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "upperBoundGreaterThanLowerBound",
				 RELATIONSHIP__UPPER_BOUND_GREATER_THAN_LOWER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the oppositeRelastionshipIsValid constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP__OPPOSITE_RELASTIONSHIP_IS_VALID__EEXPRESSION = "self.opposite <> null implies self.opposite.opposite = self";

	/**
	 * Validates the oppositeRelastionshipIsValid constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_oppositeRelastionshipIsValid(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.RELATIONSHIP,
				 relationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "oppositeRelastionshipIsValid",
				 RELATIONSHIP__OPPOSITE_RELASTIONSHIP_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormModel(FormModel formModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(form, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(page, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageElement(PageElement pageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePageElement(AttributePageElement attributePageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributePageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributePageElement_validAttributePageElement(attributePageElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validAttributePageElement constraint of '<em>Attribute Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE_PAGE_ELEMENT__VALID_ATTRIBUTE_PAGE_ELEMENT__EEXPRESSION = "(self.page.form.entity.attributes->union(self.page.form.entity.superTypes.attributes) -> includes(self.attribute))";

	/**
	 * Validates the validAttributePageElement constraint of '<em>Attribute Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePageElement_validAttributePageElement(AttributePageElement attributePageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.ATTRIBUTE_PAGE_ELEMENT,
				 attributePageElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validAttributePageElement",
				 ATTRIBUTE_PAGE_ELEMENT__VALID_ATTRIBUTE_PAGE_ELEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipPageElement(RelationshipPageElement relationshipPageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationshipPageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_validRelationshipPageElement(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_validEditingForm(relationshipPageElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validRelationshipPageElement constraint of '<em>Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP_PAGE_ELEMENT__VALID_RELATIONSHIP_PAGE_ELEMENT__EEXPRESSION = "(self.page.form.entity.relationships->union(self.page.form.entity.superTypes.relationships) -> includes(self.relationship))";

	/**
	 * Validates the validRelationshipPageElement constraint of '<em>Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipPageElement_validRelationshipPageElement(RelationshipPageElement relationshipPageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.RELATIONSHIP_PAGE_ELEMENT,
				 relationshipPageElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validRelationshipPageElement",
				 RELATIONSHIP_PAGE_ELEMENT__VALID_RELATIONSHIP_PAGE_ELEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validEditingForm constraint of '<em>Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP_PAGE_ELEMENT__VALID_EDITING_FORM__EEXPRESSION = "self.editingForm.entity = self.relationship.target";

	/**
	 * Validates the validEditingForm constraint of '<em>Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipPageElement_validEditingForm(RelationshipPageElement relationshipPageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.RELATIONSHIP_PAGE_ELEMENT,
				 relationshipPageElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validEditingForm",
				 RELATIONSHIP_PAGE_ELEMENT__VALID_EDITING_FORM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextFieldAttributePageElement(TextFieldAttributePageElement textFieldAttributePageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textFieldAttributePageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textFieldAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textFieldAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textFieldAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textFieldAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textFieldAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textFieldAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textFieldAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textFieldAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributePageElement_validAttributePageElement(textFieldAttributePageElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextareaAttributePageElement(TextareaAttributePageElement textareaAttributePageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textareaAttributePageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textareaAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textareaAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textareaAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textareaAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textareaAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textareaAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textareaAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textareaAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributePageElement_validAttributePageElement(textareaAttributePageElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionAttributePageElement(SelectionAttributePageElement selectionAttributePageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionAttributePageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributePageElement_validAttributePageElement(selectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionAttributePageElement_validSelectionType(selectionAttributePageElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validSelectionType constraint of '<em>Selection Attribute Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_ATTRIBUTE_PAGE_ELEMENT__VALID_SELECTION_TYPE__EEXPRESSION = "self.attribute.type = AttributeType::Boolean or self.attribute.enumerationType <> null";

	/**
	 * Validates the validSelectionType constraint of '<em>Selection Attribute Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionAttributePageElement_validSelectionType(SelectionAttributePageElement selectionAttributePageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.SELECTION_ATTRIBUTE_PAGE_ELEMENT,
				 selectionAttributePageElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validSelectionType",
				 SELECTION_ATTRIBUTE_PAGE_ELEMENT__VALID_SELECTION_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateSelectionAttributePageElement(DateSelectionAttributePageElement dateSelectionAttributePageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateSelectionAttributePageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributePageElement_validAttributePageElement(dateSelectionAttributePageElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSelectionAttributePageElement(TimeSelectionAttributePageElement timeSelectionAttributePageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeSelectionAttributePageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeSelectionAttributePageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributePageElement_validAttributePageElement(timeSelectionAttributePageElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListRelationshipPageElement(ListRelationshipPageElement listRelationshipPageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listRelationshipPageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_validRelationshipPageElement(listRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_validEditingForm(listRelationshipPageElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableRelationshipPageElement(TableRelationshipPageElement tableRelationshipPageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tableRelationshipPageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tableRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tableRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tableRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tableRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tableRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tableRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tableRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tableRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_validRelationshipPageElement(tableRelationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_validEditingForm(tableRelationshipPageElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(column, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(column, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumn_validColumn(column, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validColumn constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__VALID_COLUMN__EEXPRESSION = "(self.table.relationship.target.attributes -> union(self.table.relationship.target.superTypes.attributes)) -> includes(self.attribute)";

	/**
	 * Validates the validColumn constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_validColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FormsPackage.Literals.COLUMN,
				 column,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validColumn",
				 COLUMN__VALID_COLUMN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueCondition(AttributeValueCondition attributeValueCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeValueCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeCondition(CompositeCondition compositeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeType(AttributeType attributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionType(ConditionType conditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeConditionOperator(CompositeConditionOperator compositeConditionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FormsValidator
