/**
 */
package forms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.Condition#getConditionID <em>Condition ID</em>}</li>
 *   <li>{@link forms.Condition#getType <em>Type</em>}</li>
 *   <li>{@link forms.Condition#getPage <em>Page</em>}</li>
 *   <li>{@link forms.Condition#getPageElement <em>Page Element</em>}</li>
 *   <li>{@link forms.Condition#getParentCondtion <em>Parent Condtion</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition ID</em>' attribute.
	 * @see #setConditionID(String)
	 * @see forms.FormsPackage#getCondition_ConditionID()
	 * @model required="true"
	 * @generated
	 */
	String getConditionID();

	/**
	 * Sets the value of the '{@link forms.Condition#getConditionID <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition ID</em>' attribute.
	 * @see #getConditionID()
	 * @generated
	 */
	void setConditionID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link forms.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see forms.ConditionType
	 * @see #setType(ConditionType)
	 * @see forms.FormsPackage#getCondition_Type()
	 * @model required="true"
	 * @generated
	 */
	ConditionType getType();

	/**
	 * Sets the value of the '{@link forms.Condition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see forms.ConditionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConditionType value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link forms.Page#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' container reference.
	 * @see #setPage(Page)
	 * @see forms.FormsPackage#getCondition_Page()
	 * @see forms.Page#getConditions
	 * @model opposite="conditions" transient="false"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link forms.Condition#getPage <em>Page</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' container reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

	/**
	 * Returns the value of the '<em><b>Page Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link forms.PageElement#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Element</em>' container reference.
	 * @see #setPageElement(PageElement)
	 * @see forms.FormsPackage#getCondition_PageElement()
	 * @see forms.PageElement#getConditions
	 * @model opposite="conditions" transient="false"
	 * @generated
	 */
	PageElement getPageElement();

	/**
	 * Sets the value of the '{@link forms.Condition#getPageElement <em>Page Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Element</em>' container reference.
	 * @see #getPageElement()
	 * @generated
	 */
	void setPageElement(PageElement value);

	/**
	 * Returns the value of the '<em><b>Parent Condtion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link forms.CompositeCondition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Condtion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Condtion</em>' container reference.
	 * @see #setParentCondtion(CompositeCondition)
	 * @see forms.FormsPackage#getCondition_ParentCondtion()
	 * @see forms.CompositeCondition#getConditions
	 * @model opposite="conditions" transient="false"
	 * @generated
	 */
	CompositeCondition getParentCondtion();

	/**
	 * Sets the value of the '{@link forms.Condition#getParentCondtion <em>Parent Condtion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Condtion</em>' container reference.
	 * @see #getParentCondtion()
	 * @generated
	 */
	void setParentCondtion(CompositeCondition value);

} // Condition
