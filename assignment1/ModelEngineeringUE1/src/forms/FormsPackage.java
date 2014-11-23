/**
 */
package forms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see forms.FormsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FormsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "forms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://big.tuwien.ac.at/me";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "forms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormsPackage eINSTANCE = forms.impl.FormsPackageImpl.init();

	/**
	 * The meta object id for the '{@link forms.impl.EntityModelImpl <em>Entity Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.EntityModelImpl
	 * @see forms.impl.FormsPackageImpl#getEntityModel()
	 * @generated
	 */
	int ENTITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL__ENUMERATIONS = 1;

	/**
	 * The number of structural features of the '<em>Entity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.EntityImpl
	 * @see forms.impl.FormsPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUPER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUPER_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONSHIPS = 5;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.AttributeImpl
	 * @see forms.impl.FormsPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MANDATORY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Enumeration Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ENUMERATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ENTITY = 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.EnumerationTypeImpl
	 * @see forms.impl.FormsPackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__LITERALS = 1;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.EnumerationLiteralImpl
	 * @see forms.impl.FormsPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.RelationshipImpl
	 * @see forms.impl.FormsPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__LOWER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UPPER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 4;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OPPOSITE = 5;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.FormModelImpl <em>Form Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.FormModelImpl
	 * @see forms.impl.FormsPackageImpl#getFormModel()
	 * @generated
	 */
	int FORM_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Entity Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_MODEL__ENTITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_MODEL__FORMS = 1;

	/**
	 * The feature id for the '<em><b>Welcome Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_MODEL__WELCOME_FORM = 2;

	/**
	 * The number of structural features of the '<em>Form Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Form Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.FormImpl
	 * @see forms.impl.FormsPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PAGES = 4;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.PageImpl
	 * @see forms.impl.FormsPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Page Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FORM = 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.PageElementImpl <em>Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.PageElementImpl
	 * @see forms.impl.FormsPackageImpl#getPageElement()
	 * @generated
	 */
	int PAGE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__ELEMENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__PAGE = 3;

	/**
	 * The number of structural features of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.AttributePageElementImpl <em>Attribute Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.AttributePageElementImpl
	 * @see forms.impl.FormsPackageImpl#getAttributePageElement()
	 * @generated
	 */
	int ATTRIBUTE_PAGE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__LABEL = PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID = PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__CONDITIONS = PAGE_ELEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__PAGE = PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.impl.RelationshipPageElementImpl <em>Relationship Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.RelationshipPageElementImpl
	 * @see forms.impl.FormsPackageImpl#getRelationshipPageElement()
	 * @generated
	 */
	int RELATIONSHIP_PAGE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__LABEL = PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID = PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__CONDITIONS = PAGE_ELEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__PAGE = PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.impl.TextFieldAttributePageElementImpl <em>Text Field Attribute Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.TextFieldAttributePageElementImpl
	 * @see forms.impl.FormsPackageImpl#getTextFieldAttributePageElement()
	 * @generated
	 */
	int TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT__CONDITIONS = ATTRIBUTE_PAGE_ELEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT__PAGE = ATTRIBUTE_PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT__FORMAT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Field Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Field Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.impl.TextareaAttributePageElementImpl <em>Textarea Attribute Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.TextareaAttributePageElementImpl
	 * @see forms.impl.FormsPackageImpl#getTextareaAttributePageElement()
	 * @generated
	 */
	int TEXTAREA_ATTRIBUTE_PAGE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_ATTRIBUTE_PAGE_ELEMENT__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_ATTRIBUTE_PAGE_ELEMENT__CONDITIONS = ATTRIBUTE_PAGE_ELEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_ATTRIBUTE_PAGE_ELEMENT__PAGE = ATTRIBUTE_PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Textarea Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Textarea Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.impl.SelectionAttributePageElementImpl <em>Selection Attribute Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.SelectionAttributePageElementImpl
	 * @see forms.impl.FormsPackageImpl#getSelectionAttributePageElement()
	 * @generated
	 */
	int SELECTION_ATTRIBUTE_PAGE_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ATTRIBUTE_PAGE_ELEMENT__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ATTRIBUTE_PAGE_ELEMENT__CONDITIONS = ATTRIBUTE_PAGE_ELEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ATTRIBUTE_PAGE_ELEMENT__PAGE = ATTRIBUTE_PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Selection Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.impl.DateSelectionAttributePageElementImpl <em>Date Selection Attribute Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.DateSelectionAttributePageElementImpl
	 * @see forms.impl.FormsPackageImpl#getDateSelectionAttributePageElement()
	 * @generated
	 */
	int DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT__CONDITIONS = ATTRIBUTE_PAGE_ELEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT__PAGE = ATTRIBUTE_PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Date Selection Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Selection Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.impl.TimeSelectionAttributePageElementImpl <em>Time Selection Attribute Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.TimeSelectionAttributePageElementImpl
	 * @see forms.impl.FormsPackageImpl#getTimeSelectionAttributePageElement()
	 * @generated
	 */
	int TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT__CONDITIONS = ATTRIBUTE_PAGE_ELEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT__PAGE = ATTRIBUTE_PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Time Selection Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Selection Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.impl.ListRelationshipPageElementImpl <em>List Relationship Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.ListRelationshipPageElementImpl
	 * @see forms.impl.FormsPackageImpl#getListRelationshipPageElement()
	 * @generated
	 */
	int LIST_RELATIONSHIP_PAGE_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RELATIONSHIP_PAGE_ELEMENT__LABEL = RELATIONSHIP_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID = RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RELATIONSHIP_PAGE_ELEMENT__CONDITIONS = RELATIONSHIP_PAGE_ELEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RELATIONSHIP_PAGE_ELEMENT__PAGE = RELATIONSHIP_PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP = RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM = RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM;

	/**
	 * The number of structural features of the '<em>List Relationship Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT = RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Relationship Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT = RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.impl.TableRelationshipPageElementImpl <em>Table Relationship Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.TableRelationshipPageElementImpl
	 * @see forms.impl.FormsPackageImpl#getTableRelationshipPageElement()
	 * @generated
	 */
	int TABLE_RELATIONSHIP_PAGE_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RELATIONSHIP_PAGE_ELEMENT__LABEL = RELATIONSHIP_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID = RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RELATIONSHIP_PAGE_ELEMENT__CONDITIONS = RELATIONSHIP_PAGE_ELEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RELATIONSHIP_PAGE_ELEMENT__PAGE = RELATIONSHIP_PAGE_ELEMENT__PAGE;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP = RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM = RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RELATIONSHIP_PAGE_ELEMENT__COLUMNS = RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Relationship Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT = RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Relationship Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT = RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.ColumnImpl
	 * @see forms.impl.FormsPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 19;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.ConditionImpl
	 * @see forms.impl.FormsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 20;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PAGE = 2;

	/**
	 * The feature id for the '<em><b>Page Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PAGE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Parent Condtion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PARENT_CONDTION = 4;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.impl.AttributeValueConditionImpl <em>Attribute Value Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.AttributeValueConditionImpl
	 * @see forms.impl.FormsPackageImpl#getAttributeValueCondition()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_CONDITION = 21;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__CONDITION_ID = CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__TYPE = CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__PAGE = CONDITION__PAGE;

	/**
	 * The feature id for the '<em><b>Page Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__PAGE_ELEMENT = CONDITION__PAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Condtion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__PARENT_CONDTION = CONDITION__PARENT_CONDTION;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__TRIGGER = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.CompositeConditionImpl
	 * @see forms.impl.FormsPackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 22;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__CONDITION_ID = CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__TYPE = CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__PAGE = CONDITION__PAGE;

	/**
	 * The feature id for the '<em><b>Page Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__PAGE_ELEMENT = CONDITION__PAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Condtion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__PARENT_CONDTION = CONDITION__PARENT_CONDTION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__OPERATOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__CONDITIONS = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.AttributeType
	 * @see forms.impl.FormsPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 23;

	/**
	 * The meta object id for the '{@link forms.ConditionType <em>Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.ConditionType
	 * @see forms.impl.FormsPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 24;

	/**
	 * The meta object id for the '{@link forms.CompositeConditionOperator <em>Composite Condition Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.CompositeConditionOperator
	 * @see forms.impl.FormsPackageImpl#getCompositeConditionOperator()
	 * @generated
	 */
	int COMPOSITE_CONDITION_OPERATOR = 25;


	/**
	 * Returns the meta object for class '{@link forms.EntityModel <em>Entity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Model</em>'.
	 * @see forms.EntityModel
	 * @generated
	 */
	EClass getEntityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.EntityModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see forms.EntityModel#getEntities()
	 * @see #getEntityModel()
	 * @generated
	 */
	EReference getEntityModel_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.EntityModel#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see forms.EntityModel#getEnumerations()
	 * @see #getEntityModel()
	 * @generated
	 */
	EReference getEntityModel_Enumerations();

	/**
	 * Returns the meta object for class '{@link forms.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see forms.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link forms.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the reference '{@link forms.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id</em>'.
	 * @see forms.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Id();

	/**
	 * Returns the meta object for the reference '{@link forms.Entity#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see forms.Entity#getSuperType()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SuperType();

	/**
	 * Returns the meta object for the reference list '{@link forms.Entity#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see forms.Entity#getSuperTypes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see forms.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.Entity#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see forms.Entity#getRelationships()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relationships();

	/**
	 * Returns the meta object for class '{@link forms.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see forms.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link forms.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link forms.Attribute#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see forms.Attribute#isMandatory()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link forms.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see forms.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the reference '{@link forms.Attribute#getEnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration Type</em>'.
	 * @see forms.Attribute#getEnumerationType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_EnumerationType();

	/**
	 * Returns the meta object for the container reference '{@link forms.Attribute#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see forms.Attribute#getEntity()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Entity();

	/**
	 * Returns the meta object for class '{@link forms.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see forms.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the attribute '{@link forms.EnumerationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.EnumerationType#getName()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.EnumerationType#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see forms.EnumerationType#getLiterals()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_Literals();

	/**
	 * Returns the meta object for class '{@link forms.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see forms.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link forms.EnumerationLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.EnumerationLiteral#getName()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EAttribute getEnumerationLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link forms.EnumerationLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see forms.EnumerationLiteral#getValue()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EAttribute getEnumerationLiteral_Value();

	/**
	 * Returns the meta object for class '{@link forms.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see forms.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link forms.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name();

	/**
	 * Returns the meta object for the attribute '{@link forms.Relationship#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see forms.Relationship#getLowerBound()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link forms.Relationship#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see forms.Relationship#getUpperBound()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_UpperBound();

	/**
	 * Returns the meta object for the container reference '{@link forms.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see forms.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link forms.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see forms.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link forms.Relationship#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see forms.Relationship#getOpposite()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Opposite();

	/**
	 * Returns the meta object for class '{@link forms.FormModel <em>Form Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Model</em>'.
	 * @see forms.FormModel
	 * @generated
	 */
	EClass getFormModel();

	/**
	 * Returns the meta object for the containment reference '{@link forms.FormModel#getEntityModel <em>Entity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Model</em>'.
	 * @see forms.FormModel#getEntityModel()
	 * @see #getFormModel()
	 * @generated
	 */
	EReference getFormModel_EntityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.FormModel#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see forms.FormModel#getForms()
	 * @see #getFormModel()
	 * @generated
	 */
	EReference getFormModel_Forms();

	/**
	 * Returns the meta object for the reference '{@link forms.FormModel#getWelcomeForm <em>Welcome Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Welcome Form</em>'.
	 * @see forms.FormModel#getWelcomeForm()
	 * @see #getFormModel()
	 * @generated
	 */
	EReference getFormModel_WelcomeForm();

	/**
	 * Returns the meta object for class '{@link forms.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see forms.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link forms.Form#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.Form#getName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Name();

	/**
	 * Returns the meta object for the attribute '{@link forms.Form#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see forms.Form#getTitle()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Title();

	/**
	 * Returns the meta object for the attribute '{@link forms.Form#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see forms.Form#getDescription()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Description();

	/**
	 * Returns the meta object for the reference '{@link forms.Form#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see forms.Form#getEntity()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.Form#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see forms.Form#getPages()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Pages();

	/**
	 * Returns the meta object for class '{@link forms.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see forms.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link forms.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see forms.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.Page#getPageElements <em>Page Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Elements</em>'.
	 * @see forms.Page#getPageElements()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PageElements();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.Page#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see forms.Page#getConditions()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Conditions();

	/**
	 * Returns the meta object for the container reference '{@link forms.Page#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Form</em>'.
	 * @see forms.Page#getForm()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Form();

	/**
	 * Returns the meta object for class '{@link forms.PageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Element</em>'.
	 * @see forms.PageElement
	 * @generated
	 */
	EClass getPageElement();

	/**
	 * Returns the meta object for the attribute '{@link forms.PageElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see forms.PageElement#getLabel()
	 * @see #getPageElement()
	 * @generated
	 */
	EAttribute getPageElement_Label();

	/**
	 * Returns the meta object for the attribute '{@link forms.PageElement#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see forms.PageElement#getElementID()
	 * @see #getPageElement()
	 * @generated
	 */
	EAttribute getPageElement_ElementID();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.PageElement#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see forms.PageElement#getConditions()
	 * @see #getPageElement()
	 * @generated
	 */
	EReference getPageElement_Conditions();

	/**
	 * Returns the meta object for the container reference '{@link forms.PageElement#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see forms.PageElement#getPage()
	 * @see #getPageElement()
	 * @generated
	 */
	EReference getPageElement_Page();

	/**
	 * Returns the meta object for class '{@link forms.AttributePageElement <em>Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Page Element</em>'.
	 * @see forms.AttributePageElement
	 * @generated
	 */
	EClass getAttributePageElement();

	/**
	 * Returns the meta object for the reference '{@link forms.AttributePageElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see forms.AttributePageElement#getAttribute()
	 * @see #getAttributePageElement()
	 * @generated
	 */
	EReference getAttributePageElement_Attribute();

	/**
	 * Returns the meta object for class '{@link forms.RelationshipPageElement <em>Relationship Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Page Element</em>'.
	 * @see forms.RelationshipPageElement
	 * @generated
	 */
	EClass getRelationshipPageElement();

	/**
	 * Returns the meta object for the reference '{@link forms.RelationshipPageElement#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship</em>'.
	 * @see forms.RelationshipPageElement#getRelationship()
	 * @see #getRelationshipPageElement()
	 * @generated
	 */
	EReference getRelationshipPageElement_Relationship();

	/**
	 * Returns the meta object for the reference '{@link forms.RelationshipPageElement#getEditingForm <em>Editing Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Editing Form</em>'.
	 * @see forms.RelationshipPageElement#getEditingForm()
	 * @see #getRelationshipPageElement()
	 * @generated
	 */
	EReference getRelationshipPageElement_EditingForm();

	/**
	 * Returns the meta object for class '{@link forms.TextFieldAttributePageElement <em>Text Field Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field Attribute Page Element</em>'.
	 * @see forms.TextFieldAttributePageElement
	 * @generated
	 */
	EClass getTextFieldAttributePageElement();

	/**
	 * Returns the meta object for the attribute '{@link forms.TextFieldAttributePageElement#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see forms.TextFieldAttributePageElement#getFormat()
	 * @see #getTextFieldAttributePageElement()
	 * @generated
	 */
	EAttribute getTextFieldAttributePageElement_Format();

	/**
	 * Returns the meta object for class '{@link forms.TextareaAttributePageElement <em>Textarea Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textarea Attribute Page Element</em>'.
	 * @see forms.TextareaAttributePageElement
	 * @generated
	 */
	EClass getTextareaAttributePageElement();

	/**
	 * Returns the meta object for class '{@link forms.SelectionAttributePageElement <em>Selection Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Attribute Page Element</em>'.
	 * @see forms.SelectionAttributePageElement
	 * @generated
	 */
	EClass getSelectionAttributePageElement();

	/**
	 * Returns the meta object for class '{@link forms.DateSelectionAttributePageElement <em>Date Selection Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Selection Attribute Page Element</em>'.
	 * @see forms.DateSelectionAttributePageElement
	 * @generated
	 */
	EClass getDateSelectionAttributePageElement();

	/**
	 * Returns the meta object for class '{@link forms.TimeSelectionAttributePageElement <em>Time Selection Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Selection Attribute Page Element</em>'.
	 * @see forms.TimeSelectionAttributePageElement
	 * @generated
	 */
	EClass getTimeSelectionAttributePageElement();

	/**
	 * Returns the meta object for class '{@link forms.ListRelationshipPageElement <em>List Relationship Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Relationship Page Element</em>'.
	 * @see forms.ListRelationshipPageElement
	 * @generated
	 */
	EClass getListRelationshipPageElement();

	/**
	 * Returns the meta object for class '{@link forms.TableRelationshipPageElement <em>Table Relationship Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Relationship Page Element</em>'.
	 * @see forms.TableRelationshipPageElement
	 * @generated
	 */
	EClass getTableRelationshipPageElement();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.TableRelationshipPageElement#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see forms.TableRelationshipPageElement#getColumns()
	 * @see #getTableRelationshipPageElement()
	 * @generated
	 */
	EReference getTableRelationshipPageElement_Columns();

	/**
	 * Returns the meta object for class '{@link forms.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see forms.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference '{@link forms.Column#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see forms.Column#getAttribute()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Attribute();

	/**
	 * Returns the meta object for the container reference '{@link forms.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see forms.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Table();

	/**
	 * Returns the meta object for class '{@link forms.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see forms.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link forms.Condition#getConditionID <em>Condition ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition ID</em>'.
	 * @see forms.Condition#getConditionID()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_ConditionID();

	/**
	 * Returns the meta object for the attribute '{@link forms.Condition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see forms.Condition#getType()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Type();

	/**
	 * Returns the meta object for the container reference '{@link forms.Condition#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see forms.Condition#getPage()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Page();

	/**
	 * Returns the meta object for the container reference '{@link forms.Condition#getPageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page Element</em>'.
	 * @see forms.Condition#getPageElement()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_PageElement();

	/**
	 * Returns the meta object for the container reference '{@link forms.Condition#getParentCondtion <em>Parent Condtion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Condtion</em>'.
	 * @see forms.Condition#getParentCondtion()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ParentCondtion();

	/**
	 * Returns the meta object for class '{@link forms.AttributeValueCondition <em>Attribute Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Condition</em>'.
	 * @see forms.AttributeValueCondition
	 * @generated
	 */
	EClass getAttributeValueCondition();

	/**
	 * Returns the meta object for the reference '{@link forms.AttributeValueCondition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see forms.AttributeValueCondition#getTrigger()
	 * @see #getAttributeValueCondition()
	 * @generated
	 */
	EReference getAttributeValueCondition_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link forms.AttributeValueCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see forms.AttributeValueCondition#getValue()
	 * @see #getAttributeValueCondition()
	 * @generated
	 */
	EAttribute getAttributeValueCondition_Value();

	/**
	 * Returns the meta object for class '{@link forms.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see forms.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the attribute '{@link forms.CompositeCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see forms.CompositeCondition#getOperator()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EAttribute getCompositeCondition_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.CompositeCondition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see forms.CompositeCondition#getConditions()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Conditions();

	/**
	 * Returns the meta object for enum '{@link forms.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see forms.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link forms.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Type</em>'.
	 * @see forms.ConditionType
	 * @generated
	 */
	EEnum getConditionType();

	/**
	 * Returns the meta object for enum '{@link forms.CompositeConditionOperator <em>Composite Condition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composite Condition Operator</em>'.
	 * @see forms.CompositeConditionOperator
	 * @generated
	 */
	EEnum getCompositeConditionOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormsFactory getFormsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link forms.impl.EntityModelImpl <em>Entity Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.EntityModelImpl
		 * @see forms.impl.FormsPackageImpl#getEntityModel()
		 * @generated
		 */
		EClass ENTITY_MODEL = eINSTANCE.getEntityModel();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MODEL__ENTITIES = eINSTANCE.getEntityModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MODEL__ENUMERATIONS = eINSTANCE.getEntityModel_Enumerations();

		/**
		 * The meta object literal for the '{@link forms.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.EntityImpl
		 * @see forms.impl.FormsPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUPER_TYPES = eINSTANCE.getEntity_SuperTypes();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONSHIPS = eINSTANCE.getEntity_Relationships();

		/**
		 * The meta object literal for the '{@link forms.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.AttributeImpl
		 * @see forms.impl.FormsPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MANDATORY = eINSTANCE.getAttribute_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Enumeration Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ENUMERATION_TYPE = eINSTANCE.getAttribute_EnumerationType();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ENTITY = eINSTANCE.getAttribute_Entity();

		/**
		 * The meta object literal for the '{@link forms.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.EnumerationTypeImpl
		 * @see forms.impl.FormsPackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__NAME = eINSTANCE.getEnumerationType_Name();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__LITERALS = eINSTANCE.getEnumerationType_Literals();

		/**
		 * The meta object literal for the '{@link forms.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.EnumerationLiteralImpl
		 * @see forms.impl.FormsPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__NAME = eINSTANCE.getEnumerationLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__VALUE = eINSTANCE.getEnumerationLiteral_Value();

		/**
		 * The meta object literal for the '{@link forms.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.RelationshipImpl
		 * @see forms.impl.FormsPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__LOWER_BOUND = eINSTANCE.getRelationship_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__UPPER_BOUND = eINSTANCE.getRelationship_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__OPPOSITE = eINSTANCE.getRelationship_Opposite();

		/**
		 * The meta object literal for the '{@link forms.impl.FormModelImpl <em>Form Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.FormModelImpl
		 * @see forms.impl.FormsPackageImpl#getFormModel()
		 * @generated
		 */
		EClass FORM_MODEL = eINSTANCE.getFormModel();

		/**
		 * The meta object literal for the '<em><b>Entity Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_MODEL__ENTITY_MODEL = eINSTANCE.getFormModel_EntityModel();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_MODEL__FORMS = eINSTANCE.getFormModel_Forms();

		/**
		 * The meta object literal for the '<em><b>Welcome Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_MODEL__WELCOME_FORM = eINSTANCE.getFormModel_WelcomeForm();

		/**
		 * The meta object literal for the '{@link forms.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.FormImpl
		 * @see forms.impl.FormsPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NAME = eINSTANCE.getForm_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__TITLE = eINSTANCE.getForm_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__DESCRIPTION = eINSTANCE.getForm_Description();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ENTITY = eINSTANCE.getForm_Entity();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__PAGES = eINSTANCE.getForm_Pages();

		/**
		 * The meta object literal for the '{@link forms.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.PageImpl
		 * @see forms.impl.FormsPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Page Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGE_ELEMENTS = eINSTANCE.getPage_PageElements();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONDITIONS = eINSTANCE.getPage_Conditions();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__FORM = eINSTANCE.getPage_Form();

		/**
		 * The meta object literal for the '{@link forms.impl.PageElementImpl <em>Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.PageElementImpl
		 * @see forms.impl.FormsPackageImpl#getPageElement()
		 * @generated
		 */
		EClass PAGE_ELEMENT = eINSTANCE.getPageElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_ELEMENT__LABEL = eINSTANCE.getPageElement_Label();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_ELEMENT__ELEMENT_ID = eINSTANCE.getPageElement_ElementID();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_ELEMENT__CONDITIONS = eINSTANCE.getPageElement_Conditions();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_ELEMENT__PAGE = eINSTANCE.getPageElement_Page();

		/**
		 * The meta object literal for the '{@link forms.impl.AttributePageElementImpl <em>Attribute Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.AttributePageElementImpl
		 * @see forms.impl.FormsPackageImpl#getAttributePageElement()
		 * @generated
		 */
		EClass ATTRIBUTE_PAGE_ELEMENT = eINSTANCE.getAttributePageElement();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE = eINSTANCE.getAttributePageElement_Attribute();

		/**
		 * The meta object literal for the '{@link forms.impl.RelationshipPageElementImpl <em>Relationship Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.RelationshipPageElementImpl
		 * @see forms.impl.FormsPackageImpl#getRelationshipPageElement()
		 * @generated
		 */
		EClass RELATIONSHIP_PAGE_ELEMENT = eINSTANCE.getRelationshipPageElement();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP = eINSTANCE.getRelationshipPageElement_Relationship();

		/**
		 * The meta object literal for the '<em><b>Editing Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM = eINSTANCE.getRelationshipPageElement_EditingForm();

		/**
		 * The meta object literal for the '{@link forms.impl.TextFieldAttributePageElementImpl <em>Text Field Attribute Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.TextFieldAttributePageElementImpl
		 * @see forms.impl.FormsPackageImpl#getTextFieldAttributePageElement()
		 * @generated
		 */
		EClass TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT = eINSTANCE.getTextFieldAttributePageElement();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT__FORMAT = eINSTANCE.getTextFieldAttributePageElement_Format();

		/**
		 * The meta object literal for the '{@link forms.impl.TextareaAttributePageElementImpl <em>Textarea Attribute Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.TextareaAttributePageElementImpl
		 * @see forms.impl.FormsPackageImpl#getTextareaAttributePageElement()
		 * @generated
		 */
		EClass TEXTAREA_ATTRIBUTE_PAGE_ELEMENT = eINSTANCE.getTextareaAttributePageElement();

		/**
		 * The meta object literal for the '{@link forms.impl.SelectionAttributePageElementImpl <em>Selection Attribute Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.SelectionAttributePageElementImpl
		 * @see forms.impl.FormsPackageImpl#getSelectionAttributePageElement()
		 * @generated
		 */
		EClass SELECTION_ATTRIBUTE_PAGE_ELEMENT = eINSTANCE.getSelectionAttributePageElement();

		/**
		 * The meta object literal for the '{@link forms.impl.DateSelectionAttributePageElementImpl <em>Date Selection Attribute Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.DateSelectionAttributePageElementImpl
		 * @see forms.impl.FormsPackageImpl#getDateSelectionAttributePageElement()
		 * @generated
		 */
		EClass DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT = eINSTANCE.getDateSelectionAttributePageElement();

		/**
		 * The meta object literal for the '{@link forms.impl.TimeSelectionAttributePageElementImpl <em>Time Selection Attribute Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.TimeSelectionAttributePageElementImpl
		 * @see forms.impl.FormsPackageImpl#getTimeSelectionAttributePageElement()
		 * @generated
		 */
		EClass TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT = eINSTANCE.getTimeSelectionAttributePageElement();

		/**
		 * The meta object literal for the '{@link forms.impl.ListRelationshipPageElementImpl <em>List Relationship Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.ListRelationshipPageElementImpl
		 * @see forms.impl.FormsPackageImpl#getListRelationshipPageElement()
		 * @generated
		 */
		EClass LIST_RELATIONSHIP_PAGE_ELEMENT = eINSTANCE.getListRelationshipPageElement();

		/**
		 * The meta object literal for the '{@link forms.impl.TableRelationshipPageElementImpl <em>Table Relationship Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.TableRelationshipPageElementImpl
		 * @see forms.impl.FormsPackageImpl#getTableRelationshipPageElement()
		 * @generated
		 */
		EClass TABLE_RELATIONSHIP_PAGE_ELEMENT = eINSTANCE.getTableRelationshipPageElement();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_RELATIONSHIP_PAGE_ELEMENT__COLUMNS = eINSTANCE.getTableRelationshipPageElement_Columns();

		/**
		 * The meta object literal for the '{@link forms.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.ColumnImpl
		 * @see forms.impl.FormsPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__ATTRIBUTE = eINSTANCE.getColumn_Attribute();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TABLE = eINSTANCE.getColumn_Table();

		/**
		 * The meta object literal for the '{@link forms.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.ConditionImpl
		 * @see forms.impl.FormsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITION_ID = eINSTANCE.getCondition_ConditionID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__TYPE = eINSTANCE.getCondition_Type();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__PAGE = eINSTANCE.getCondition_Page();

		/**
		 * The meta object literal for the '<em><b>Page Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__PAGE_ELEMENT = eINSTANCE.getCondition_PageElement();

		/**
		 * The meta object literal for the '<em><b>Parent Condtion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__PARENT_CONDTION = eINSTANCE.getCondition_ParentCondtion();

		/**
		 * The meta object literal for the '{@link forms.impl.AttributeValueConditionImpl <em>Attribute Value Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.AttributeValueConditionImpl
		 * @see forms.impl.FormsPackageImpl#getAttributeValueCondition()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_CONDITION = eINSTANCE.getAttributeValueCondition();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_CONDITION__TRIGGER = eINSTANCE.getAttributeValueCondition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_CONDITION__VALUE = eINSTANCE.getAttributeValueCondition_Value();

		/**
		 * The meta object literal for the '{@link forms.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.CompositeConditionImpl
		 * @see forms.impl.FormsPackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITION__OPERATOR = eINSTANCE.getCompositeCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__CONDITIONS = eINSTANCE.getCompositeCondition_Conditions();

		/**
		 * The meta object literal for the '{@link forms.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.AttributeType
		 * @see forms.impl.FormsPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link forms.ConditionType <em>Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.ConditionType
		 * @see forms.impl.FormsPackageImpl#getConditionType()
		 * @generated
		 */
		EEnum CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '{@link forms.CompositeConditionOperator <em>Composite Condition Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.CompositeConditionOperator
		 * @see forms.impl.FormsPackageImpl#getCompositeConditionOperator()
		 * @generated
		 */
		EEnum COMPOSITE_CONDITION_OPERATOR = eINSTANCE.getCompositeConditionOperator();

	}

} //FormsPackage
