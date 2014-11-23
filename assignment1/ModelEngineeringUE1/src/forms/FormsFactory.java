/**
 */
package forms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see forms.FormsPackage
 * @generated
 */
public interface FormsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormsFactory eINSTANCE = forms.impl.FormsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entity Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Model</em>'.
	 * @generated
	 */
	EntityModel createEntityModel();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Type</em>'.
	 * @generated
	 */
	EnumerationType createEnumerationType();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	EnumerationLiteral createEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Form Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Model</em>'.
	 * @generated
	 */
	FormModel createFormModel();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Text Field Attribute Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Field Attribute Page Element</em>'.
	 * @generated
	 */
	TextFieldAttributePageElement createTextFieldAttributePageElement();

	/**
	 * Returns a new object of class '<em>Textarea Attribute Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textarea Attribute Page Element</em>'.
	 * @generated
	 */
	TextareaAttributePageElement createTextareaAttributePageElement();

	/**
	 * Returns a new object of class '<em>Selection Attribute Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Attribute Page Element</em>'.
	 * @generated
	 */
	SelectionAttributePageElement createSelectionAttributePageElement();

	/**
	 * Returns a new object of class '<em>Date Selection Attribute Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Selection Attribute Page Element</em>'.
	 * @generated
	 */
	DateSelectionAttributePageElement createDateSelectionAttributePageElement();

	/**
	 * Returns a new object of class '<em>Time Selection Attribute Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Selection Attribute Page Element</em>'.
	 * @generated
	 */
	TimeSelectionAttributePageElement createTimeSelectionAttributePageElement();

	/**
	 * Returns a new object of class '<em>List Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Relationship Page Element</em>'.
	 * @generated
	 */
	ListRelationshipPageElement createListRelationshipPageElement();

	/**
	 * Returns a new object of class '<em>Table Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Relationship Page Element</em>'.
	 * @generated
	 */
	TableRelationshipPageElement createTableRelationshipPageElement();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Attribute Value Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Condition</em>'.
	 * @generated
	 */
	AttributeValueCondition createAttributeValueCondition();

	/**
	 * Returns a new object of class '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Condition</em>'.
	 * @generated
	 */
	CompositeCondition createCompositeCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FormsPackage getFormsPackage();

} //FormsFactory
