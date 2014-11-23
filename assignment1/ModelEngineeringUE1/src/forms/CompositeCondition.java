/**
 */
package forms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.CompositeCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link forms.CompositeCondition#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getCompositeCondition()
 * @model
 * @generated
 */
public interface CompositeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link forms.CompositeConditionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see forms.CompositeConditionOperator
	 * @see #setOperator(CompositeConditionOperator)
	 * @see forms.FormsPackage#getCompositeCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	CompositeConditionOperator getOperator();

	/**
	 * Sets the value of the '{@link forms.CompositeCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see forms.CompositeConditionOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(CompositeConditionOperator value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link forms.Condition}.
	 * It is bidirectional and its opposite is '{@link forms.Condition#getParentCondtion <em>Parent Condtion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see forms.FormsPackage#getCompositeCondition_Conditions()
	 * @see forms.Condition#getParentCondtion
	 * @model opposite="parentCondtion" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Condition> getConditions();

} // CompositeCondition
