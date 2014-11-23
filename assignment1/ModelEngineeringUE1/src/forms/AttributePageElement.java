/**
 */
package forms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Page Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.AttributePageElement#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getAttributePageElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validAttributePageElement'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validAttributePageElement='(self.page.form.entity.attributes->union(self.page.form.entity.superTypes.attributes) -> includes(self.attribute))'"
 * @generated
 */
public interface AttributePageElement extends PageElement {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see forms.FormsPackage#getAttributePageElement_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link forms.AttributePageElement#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // AttributePageElement
