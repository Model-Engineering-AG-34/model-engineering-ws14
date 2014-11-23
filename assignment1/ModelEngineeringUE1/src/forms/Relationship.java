/**
 */
package forms;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.Relationship#getName <em>Name</em>}</li>
 *   <li>{@link forms.Relationship#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link forms.Relationship#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link forms.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link forms.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link forms.Relationship#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='upperBoundGreaterThanLowerBound oppositeRelastionshipIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot upperBoundGreaterThanLowerBound='self.lowerBound >= 0 and (self.lowerBound <= self.upperBound xor self.upperBound = -1)' oppositeRelastionshipIsValid='self.opposite <> null implies self.opposite.opposite = self'"
 * @generated
 */
public interface Relationship extends EObject {
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
	 * @see forms.FormsPackage#getRelationship_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forms.Relationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(BigInteger)
	 * @see forms.FormsPackage#getRelationship_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getLowerBound();

	/**
	 * Sets the value of the '{@link forms.Relationship#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(BigInteger)
	 * @see forms.FormsPackage#getRelationship_UpperBound()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getUpperBound();

	/**
	 * Sets the value of the '{@link forms.Relationship#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link forms.Entity#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Entity)
	 * @see forms.FormsPackage#getRelationship_Source()
	 * @see forms.Entity#getRelationships
	 * @model opposite="relationships" transient="false"
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link forms.Relationship#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see forms.FormsPackage#getRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link forms.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Relationship)
	 * @see forms.FormsPackage#getRelationship_Opposite()
	 * @model
	 * @generated
	 */
	Relationship getOpposite();

	/**
	 * Sets the value of the '{@link forms.Relationship#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Relationship value);

} // Relationship
