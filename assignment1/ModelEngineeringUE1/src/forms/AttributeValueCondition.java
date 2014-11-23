/**
 */
package forms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.AttributeValueCondition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link forms.AttributeValueCondition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getAttributeValueCondition()
 * @model
 * @generated
 */
public interface AttributeValueCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(AttributePageElement)
	 * @see forms.FormsPackage#getAttributeValueCondition_Trigger()
	 * @model required="true"
	 * @generated
	 */
	AttributePageElement getTrigger();

	/**
	 * Sets the value of the '{@link forms.AttributeValueCondition#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(AttributePageElement value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see forms.FormsPackage#getAttributeValueCondition_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link forms.AttributeValueCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // AttributeValueCondition
