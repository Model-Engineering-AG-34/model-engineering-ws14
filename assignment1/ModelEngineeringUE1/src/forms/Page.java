/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link forms.Page#getPageElements <em>Page Elements</em>}</li>
 *   <li>{@link forms.Page#getConditions <em>Conditions</em>}</li>
 *   <li>{@link forms.Page#getForm <em>Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see forms.FormsPackage#getPage_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link forms.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Page Elements</b></em>' containment reference list.
	 * The list contents are of type {@link forms.PageElement}.
	 * It is bidirectional and its opposite is '{@link forms.PageElement#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Elements</em>' containment reference list.
	 * @see forms.FormsPackage#getPage_PageElements()
	 * @see forms.PageElement#getPage
	 * @model opposite="page" containment="true"
	 * @generated
	 */
	EList<PageElement> getPageElements();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link forms.Condition}.
	 * It is bidirectional and its opposite is '{@link forms.Condition#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see forms.FormsPackage#getPage_Conditions()
	 * @see forms.Condition#getPage
	 * @model opposite="page" containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Form</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link forms.Form#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' container reference.
	 * @see #setForm(Form)
	 * @see forms.FormsPackage#getPage_Form()
	 * @see forms.Form#getPages
	 * @model opposite="pages" transient="false"
	 * @generated
	 */
	Form getForm();

	/**
	 * Sets the value of the '{@link forms.Page#getForm <em>Form</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' container reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Form value);

} // Page
