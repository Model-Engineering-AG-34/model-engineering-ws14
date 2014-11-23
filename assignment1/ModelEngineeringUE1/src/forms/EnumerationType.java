/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.EnumerationType#getName <em>Name</em>}</li>
 *   <li>{@link forms.EnumerationType#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getEnumerationType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueLiteralNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueLiteralNames='self.literals->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)'"
 * @generated
 */
public interface EnumerationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see forms.FormsPackage#getEnumerationType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forms.EnumerationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link forms.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see forms.FormsPackage#getEnumerationType_Literals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getLiterals();

} // EnumerationType
