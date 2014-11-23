/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Relationship Page Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.TableRelationshipPageElement#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getTableRelationshipPageElement()
 * @model
 * @generated
 */
public interface TableRelationshipPageElement extends RelationshipPageElement {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link forms.Column}.
	 * It is bidirectional and its opposite is '{@link forms.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see forms.FormsPackage#getTableRelationshipPageElement_Columns()
	 * @see forms.Column#getTable
	 * @model opposite="table" containment="true" required="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // TableRelationshipPageElement
