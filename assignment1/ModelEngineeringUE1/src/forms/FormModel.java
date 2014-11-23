/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Forms
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.FormModel#getEntityModel <em>Entity Model</em>}</li>
 *   <li>{@link forms.FormModel#getForms <em>Forms</em>}</li>
 *   <li>{@link forms.FormModel#getWelcomeForm <em>Welcome Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getFormModel()
 * @model
 * @generated
 */
public interface FormModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Model</em>' containment reference.
	 * @see #setEntityModel(EntityModel)
	 * @see forms.FormsPackage#getFormModel_EntityModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntityModel getEntityModel();

	/**
	 * Sets the value of the '{@link forms.FormModel#getEntityModel <em>Entity Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Model</em>' containment reference.
	 * @see #getEntityModel()
	 * @generated
	 */
	void setEntityModel(EntityModel value);

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link forms.Form}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see forms.FormsPackage#getFormModel_Forms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Form> getForms();

	/**
	 * Returns the value of the '<em><b>Welcome Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome Form</em>' reference.
	 * @see #setWelcomeForm(Form)
	 * @see forms.FormsPackage#getFormModel_WelcomeForm()
	 * @model required="true"
	 * @generated
	 */
	Form getWelcomeForm();

	/**
	 * Sets the value of the '{@link forms.FormModel#getWelcomeForm <em>Welcome Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome Form</em>' reference.
	 * @see #getWelcomeForm()
	 * @generated
	 */
	void setWelcomeForm(Form value);

} // FormModel
