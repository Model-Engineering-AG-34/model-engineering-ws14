/**
 */
package forms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.Column#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link forms.Column#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getColumn()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validColumn'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validColumn='(self.table.relationship.target.attributes -> union(self.table.relationship.target.superTypes.attributes)) -> includes(self.attribute)'"
 * @generated
 */
public interface Column extends EObject {
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
	 * @see forms.FormsPackage#getColumn_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link forms.Column#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link forms.TableRelationshipPageElement#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(TableRelationshipPageElement)
	 * @see forms.FormsPackage#getColumn_Table()
	 * @see forms.TableRelationshipPageElement#getColumns
	 * @model opposite="columns" transient="false"
	 * @generated
	 */
	TableRelationshipPageElement getTable();

	/**
	 * Sets the value of the '{@link forms.Column#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TableRelationshipPageElement value);

} // Column
