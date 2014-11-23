/**
 */
package forms.impl;

import forms.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormsFactoryImpl extends EFactoryImpl implements FormsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormsFactory init() {
		try {
			FormsFactory theFormsFactory = (FormsFactory)EPackage.Registry.INSTANCE.getEFactory(FormsPackage.eNS_URI);
			if (theFormsFactory != null) {
				return theFormsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FormsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FormsPackage.ENTITY_MODEL: return createEntityModel();
			case FormsPackage.ENTITY: return createEntity();
			case FormsPackage.ATTRIBUTE: return createAttribute();
			case FormsPackage.ENUMERATION_TYPE: return createEnumerationType();
			case FormsPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case FormsPackage.RELATIONSHIP: return createRelationship();
			case FormsPackage.FORM_MODEL: return createFormModel();
			case FormsPackage.FORM: return createForm();
			case FormsPackage.PAGE: return createPage();
			case FormsPackage.TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT: return createTextFieldAttributePageElement();
			case FormsPackage.TEXTAREA_ATTRIBUTE_PAGE_ELEMENT: return createTextareaAttributePageElement();
			case FormsPackage.SELECTION_ATTRIBUTE_PAGE_ELEMENT: return createSelectionAttributePageElement();
			case FormsPackage.DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT: return createDateSelectionAttributePageElement();
			case FormsPackage.TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT: return createTimeSelectionAttributePageElement();
			case FormsPackage.LIST_RELATIONSHIP_PAGE_ELEMENT: return createListRelationshipPageElement();
			case FormsPackage.TABLE_RELATIONSHIP_PAGE_ELEMENT: return createTableRelationshipPageElement();
			case FormsPackage.COLUMN: return createColumn();
			case FormsPackage.ATTRIBUTE_VALUE_CONDITION: return createAttributeValueCondition();
			case FormsPackage.COMPOSITE_CONDITION: return createCompositeCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FormsPackage.ATTRIBUTE_TYPE:
				return createAttributeTypeFromString(eDataType, initialValue);
			case FormsPackage.CONDITION_TYPE:
				return createConditionTypeFromString(eDataType, initialValue);
			case FormsPackage.COMPOSITE_CONDITION_OPERATOR:
				return createCompositeConditionOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FormsPackage.ATTRIBUTE_TYPE:
				return convertAttributeTypeToString(eDataType, instanceValue);
			case FormsPackage.CONDITION_TYPE:
				return convertConditionTypeToString(eDataType, instanceValue);
			case FormsPackage.COMPOSITE_CONDITION_OPERATOR:
				return convertCompositeConditionOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityModel createEntityModel() {
		EntityModelImpl entityModel = new EntityModelImpl();
		return entityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormModel createFormModel() {
		FormModelImpl formModel = new FormModelImpl();
		return formModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFieldAttributePageElement createTextFieldAttributePageElement() {
		TextFieldAttributePageElementImpl textFieldAttributePageElement = new TextFieldAttributePageElementImpl();
		return textFieldAttributePageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaAttributePageElement createTextareaAttributePageElement() {
		TextareaAttributePageElementImpl textareaAttributePageElement = new TextareaAttributePageElementImpl();
		return textareaAttributePageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionAttributePageElement createSelectionAttributePageElement() {
		SelectionAttributePageElementImpl selectionAttributePageElement = new SelectionAttributePageElementImpl();
		return selectionAttributePageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateSelectionAttributePageElement createDateSelectionAttributePageElement() {
		DateSelectionAttributePageElementImpl dateSelectionAttributePageElement = new DateSelectionAttributePageElementImpl();
		return dateSelectionAttributePageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSelectionAttributePageElement createTimeSelectionAttributePageElement() {
		TimeSelectionAttributePageElementImpl timeSelectionAttributePageElement = new TimeSelectionAttributePageElementImpl();
		return timeSelectionAttributePageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRelationshipPageElement createListRelationshipPageElement() {
		ListRelationshipPageElementImpl listRelationshipPageElement = new ListRelationshipPageElementImpl();
		return listRelationshipPageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRelationshipPageElement createTableRelationshipPageElement() {
		TableRelationshipPageElementImpl tableRelationshipPageElement = new TableRelationshipPageElementImpl();
		return tableRelationshipPageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueCondition createAttributeValueCondition() {
		AttributeValueConditionImpl attributeValueCondition = new AttributeValueConditionImpl();
		return attributeValueCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCondition createCompositeCondition() {
		CompositeConditionImpl compositeCondition = new CompositeConditionImpl();
		return compositeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType createConditionTypeFromString(EDataType eDataType, String initialValue) {
		ConditionType result = ConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConditionOperator createCompositeConditionOperatorFromString(EDataType eDataType, String initialValue) {
		CompositeConditionOperator result = CompositeConditionOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeConditionOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsPackage getFormsPackage() {
		return (FormsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FormsPackage getPackage() {
		return FormsPackage.eINSTANCE;
	}

} //FormsFactoryImpl
