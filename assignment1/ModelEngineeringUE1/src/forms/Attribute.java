/**
 */
package forms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link forms.Attribute#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link forms.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link forms.Attribute#getEnumerationType <em>Enumeration Type</em>}</li>
 *   <li>{@link forms.Attribute#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkNone'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot checkNone='(self.type = AttributeType::None) <> (self.enumerationType = null)'"
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see forms.FormsPackage#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forms.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see forms.FormsPackage#getAttribute_Mandatory()
	 * @model required="true"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link forms.Attribute#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link forms.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see forms.AttributeType
	 * @see #setType(AttributeType)
	 * @see forms.FormsPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link forms.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see forms.AttributeType
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Enumeration Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Type</em>' reference.
	 * @see #setEnumerationType(EnumerationType)
	 * @see forms.FormsPackage#getAttribute_EnumerationType()
	 * @model
	 * @generated
	 */
	EnumerationType getEnumerationType();

	/**
	 * Sets the value of the '{@link forms.Attribute#getEnumerationType <em>Enumeration Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Type</em>' reference.
	 * @see #getEnumerationType()
	 * @generated
	 */
	void setEnumerationType(EnumerationType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link forms.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see forms.FormsPackage#getAttribute_Entity()
	 * @see forms.Entity#getAttributes
	 * @model opposite="attributes" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link forms.Attribute#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Attribute
