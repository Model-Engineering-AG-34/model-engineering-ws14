/**
 */
package forms.util;

import forms.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see forms.FormsPackage
 * @generated
 */
public class FormsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FormsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FormsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormsSwitch<Adapter> modelSwitch =
		new FormsSwitch<Adapter>() {
			@Override
			public Adapter caseEntityModel(EntityModel object) {
				return createEntityModelAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseEnumerationType(EnumerationType object) {
				return createEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseFormModel(FormModel object) {
				return createFormModelAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter casePageElement(PageElement object) {
				return createPageElementAdapter();
			}
			@Override
			public Adapter caseAttributePageElement(AttributePageElement object) {
				return createAttributePageElementAdapter();
			}
			@Override
			public Adapter caseRelationshipPageElement(RelationshipPageElement object) {
				return createRelationshipPageElementAdapter();
			}
			@Override
			public Adapter caseTextFieldAttributePageElement(TextFieldAttributePageElement object) {
				return createTextFieldAttributePageElementAdapter();
			}
			@Override
			public Adapter caseTextareaAttributePageElement(TextareaAttributePageElement object) {
				return createTextareaAttributePageElementAdapter();
			}
			@Override
			public Adapter caseSelectionAttributePageElement(SelectionAttributePageElement object) {
				return createSelectionAttributePageElementAdapter();
			}
			@Override
			public Adapter caseDateSelectionAttributePageElement(DateSelectionAttributePageElement object) {
				return createDateSelectionAttributePageElementAdapter();
			}
			@Override
			public Adapter caseTimeSelectionAttributePageElement(TimeSelectionAttributePageElement object) {
				return createTimeSelectionAttributePageElementAdapter();
			}
			@Override
			public Adapter caseListRelationshipPageElement(ListRelationshipPageElement object) {
				return createListRelationshipPageElementAdapter();
			}
			@Override
			public Adapter caseTableRelationshipPageElement(TableRelationshipPageElement object) {
				return createTableRelationshipPageElementAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseAttributeValueCondition(AttributeValueCondition object) {
				return createAttributeValueConditionAdapter();
			}
			@Override
			public Adapter caseCompositeCondition(CompositeCondition object) {
				return createCompositeConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link forms.EntityModel <em>Entity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.EntityModel
	 * @generated
	 */
	public Adapter createEntityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.EnumerationType
	 * @generated
	 */
	public Adapter createEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.FormModel <em>Form Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.FormModel
	 * @generated
	 */
	public Adapter createFormModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.PageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.PageElement
	 * @generated
	 */
	public Adapter createPageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.AttributePageElement <em>Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.AttributePageElement
	 * @generated
	 */
	public Adapter createAttributePageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.RelationshipPageElement <em>Relationship Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.RelationshipPageElement
	 * @generated
	 */
	public Adapter createRelationshipPageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.TextFieldAttributePageElement <em>Text Field Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.TextFieldAttributePageElement
	 * @generated
	 */
	public Adapter createTextFieldAttributePageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.TextareaAttributePageElement <em>Textarea Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.TextareaAttributePageElement
	 * @generated
	 */
	public Adapter createTextareaAttributePageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.SelectionAttributePageElement <em>Selection Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.SelectionAttributePageElement
	 * @generated
	 */
	public Adapter createSelectionAttributePageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.DateSelectionAttributePageElement <em>Date Selection Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.DateSelectionAttributePageElement
	 * @generated
	 */
	public Adapter createDateSelectionAttributePageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.TimeSelectionAttributePageElement <em>Time Selection Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.TimeSelectionAttributePageElement
	 * @generated
	 */
	public Adapter createTimeSelectionAttributePageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.ListRelationshipPageElement <em>List Relationship Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.ListRelationshipPageElement
	 * @generated
	 */
	public Adapter createListRelationshipPageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.TableRelationshipPageElement <em>Table Relationship Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.TableRelationshipPageElement
	 * @generated
	 */
	public Adapter createTableRelationshipPageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.AttributeValueCondition <em>Attribute Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.AttributeValueCondition
	 * @generated
	 */
	public Adapter createAttributeValueConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forms.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forms.CompositeCondition
	 * @generated
	 */
	public Adapter createCompositeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FormsAdapterFactory
