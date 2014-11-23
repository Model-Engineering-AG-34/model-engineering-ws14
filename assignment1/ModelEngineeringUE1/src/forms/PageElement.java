/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.PageElement#getLabel <em>Label</em>}</li>
 *   <li>{@link forms.PageElement#getElementID <em>Element ID</em>}</li>
 *   <li>{@link forms.PageElement#getConditions <em>Conditions</em>}</li>
 *   <li>{@link forms.PageElement#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getPageElement()
 * @model abstract="true"
 * @generated
 */
public interface PageElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see forms.FormsPackage#getPageElement_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link forms.PageElement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element ID</em>' attribute.
	 * @see #setElementID(String)
	 * @see forms.FormsPackage#getPageElement_ElementID()
	 * @model required="true"
	 * @generated
	 */
	String getElementID();

	/**
	 * Sets the value of the '{@link forms.PageElement#getElementID <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element ID</em>' attribute.
	 * @see #getElementID()
	 * @generated
	 */
	void setElementID(String value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link forms.Condition}.
	 * It is bidirectional and its opposite is '{@link forms.Condition#getPageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see forms.FormsPackage#getPageElement_Conditions()
	 * @see forms.Condition#getPageElement
	 * @model opposite="pageElement" containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link forms.Page#getPageElements <em>Page Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' container reference.
	 * @see #setPage(Page)
	 * @see forms.FormsPackage#getPageElement_Page()
	 * @see forms.Page#getPageElements
	 * @model opposite="pageElements" transient="false"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link forms.PageElement#getPage <em>Page</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' container reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

} // PageElement
