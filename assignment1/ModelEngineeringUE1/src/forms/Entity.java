/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.Entity#getName <em>Name</em>}</li>
 *   <li>{@link forms.Entity#getId <em>Id</em>}</li>
 *   <li>{@link forms.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link forms.Entity#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link forms.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link forms.Entity#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='identifierIsMandatory identifierIsMember superTypeIsNotSelf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot identifierIsMandatory='self.id.mandatory = true' identifierIsMember='self.attributes -> includes(self.id) or self.superTypes.attributes -> includes(self.id)' superTypeIsNotSelf='self <> superType'"
 * @generated
 */
public interface Entity extends EObject {
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
	 * @see forms.FormsPackage#getEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forms.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' reference.
	 * @see #setId(Attribute)
	 * @see forms.FormsPackage#getEntity_Id()
	 * @model required="true"
	 * @generated
	 */
	Attribute getId();

	/**
	 * Sets the value of the '{@link forms.Entity#getId <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Attribute value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(Entity)
	 * @see forms.FormsPackage#getEntity_SuperType()
	 * @model
	 * @generated
	 */
	Entity getSuperType();

	/**
	 * Sets the value of the '{@link forms.Entity#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(Entity value);

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link forms.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see forms.FormsPackage#getEntity_SuperTypes()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self -> closure(superType)'"
	 * @generated
	 */
	EList<Entity> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link forms.Attribute}.
	 * It is bidirectional and its opposite is '{@link forms.Attribute#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see forms.FormsPackage#getEntity_Attributes()
	 * @see forms.Attribute#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link forms.Relationship}.
	 * It is bidirectional and its opposite is '{@link forms.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see forms.FormsPackage#getEntity_Relationships()
	 * @see forms.Relationship#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

} // Entity
