/**
 */
package forms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Page Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.RelationshipPageElement#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link forms.RelationshipPageElement#getEditingForm <em>Editing Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getRelationshipPageElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validRelationshipPageElement validEditingForm'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validRelationshipPageElement='(self.page.form.entity.relationships->union(self.page.form.entity.superTypes.relationships) -> includes(self.relationship))' validEditingForm='self.editingForm.entity = self.relationship.target'"
 * @generated
 */
public interface RelationshipPageElement extends PageElement {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(Relationship)
	 * @see forms.FormsPackage#getRelationshipPageElement_Relationship()
	 * @model required="true"
	 * @generated
	 */
	Relationship getRelationship();

	/**
	 * Sets the value of the '{@link forms.RelationshipPageElement#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Form</em>' reference.
	 * @see #setEditingForm(Form)
	 * @see forms.FormsPackage#getRelationshipPageElement_EditingForm()
	 * @model required="true"
	 * @generated
	 */
	Form getEditingForm();

	/**
	 * Sets the value of the '{@link forms.RelationshipPageElement#getEditingForm <em>Editing Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Form</em>' reference.
	 * @see #getEditingForm()
	 * @generated
	 */
	void setEditingForm(Form value);

} // RelationshipPageElement
