/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Entities
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.EntityModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link forms.EntityModel#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getEntityModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueEntityNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueEntityNames='self.entities->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)'"
 * @generated
 */
public interface EntityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link forms.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see forms.FormsPackage#getEntityModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link forms.EnumerationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see forms.FormsPackage#getEntityModel_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationType> getEnumerations();

} // EntityModel
