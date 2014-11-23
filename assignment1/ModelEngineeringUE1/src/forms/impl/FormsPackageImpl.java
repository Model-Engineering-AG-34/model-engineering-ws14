/**
 */
package forms.impl;

import forms.Attribute;
import forms.AttributePageElement;
import forms.AttributeType;
import forms.AttributeValueCondition;
import forms.Column;
import forms.CompositeCondition;
import forms.CompositeConditionOperator;
import forms.Condition;
import forms.ConditionType;
import forms.DateSelectionAttributePageElement;
import forms.Entity;
import forms.EntityModel;
import forms.EnumerationLiteral;
import forms.EnumerationType;
import forms.Form;
import forms.FormModel;
import forms.FormsFactory;
import forms.FormsPackage;
import forms.ListRelationshipPageElement;
import forms.Page;
import forms.PageElement;
import forms.Relationship;
import forms.RelationshipPageElement;
import forms.SelectionAttributePageElement;
import forms.TableRelationshipPageElement;
import forms.TextFieldAttributePageElement;
import forms.TextareaAttributePageElement;
import forms.TimeSelectionAttributePageElement;

import forms.util.FormsValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormsPackageImpl extends EPackageImpl implements FormsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributePageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipPageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFieldAttributePageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textareaAttributePageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionAttributePageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateSelectionAttributePageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSelectionAttributePageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listRelationshipPageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRelationshipPageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositeConditionOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see forms.FormsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FormsPackageImpl() {
		super(eNS_URI, FormsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FormsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FormsPackage init() {
		if (isInited) return (FormsPackage)EPackage.Registry.INSTANCE.getEPackage(FormsPackage.eNS_URI);

		// Obtain or create and register package
		FormsPackageImpl theFormsPackage = (FormsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FormsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FormsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFormsPackage.createPackageContents();

		// Initialize created meta-data
		theFormsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFormsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FormsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFormsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FormsPackage.eNS_URI, theFormsPackage);
		return theFormsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityModel() {
		return entityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityModel_Entities() {
		return (EReference)entityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityModel_Enumerations() {
		return (EReference)entityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Id() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_SuperType() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_SuperTypes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Attributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationships() {
		return (EReference)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Mandatory() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_EnumerationType() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Entity() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType() {
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Name() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationType_Literals() {
		return (EReference)enumerationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationLiteral_Name() {
		return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationLiteral_Value() {
		return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Name() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_LowerBound() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_UpperBound() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Opposite() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormModel() {
		return formModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormModel_EntityModel() {
		return (EReference)formModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormModel_Forms() {
		return (EReference)formModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormModel_WelcomeForm() {
		return (EReference)formModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Name() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Title() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Description() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Entity() {
		return (EReference)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Pages() {
		return (EReference)formEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Title() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_PageElements() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Conditions() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Form() {
		return (EReference)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageElement() {
		return pageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageElement_Label() {
		return (EAttribute)pageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageElement_ElementID() {
		return (EAttribute)pageElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageElement_Conditions() {
		return (EReference)pageElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageElement_Page() {
		return (EReference)pageElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributePageElement() {
		return attributePageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributePageElement_Attribute() {
		return (EReference)attributePageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipPageElement() {
		return relationshipPageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipPageElement_Relationship() {
		return (EReference)relationshipPageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipPageElement_EditingForm() {
		return (EReference)relationshipPageElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextFieldAttributePageElement() {
		return textFieldAttributePageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextFieldAttributePageElement_Format() {
		return (EAttribute)textFieldAttributePageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextareaAttributePageElement() {
		return textareaAttributePageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionAttributePageElement() {
		return selectionAttributePageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateSelectionAttributePageElement() {
		return dateSelectionAttributePageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSelectionAttributePageElement() {
		return timeSelectionAttributePageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListRelationshipPageElement() {
		return listRelationshipPageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableRelationshipPageElement() {
		return tableRelationshipPageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableRelationshipPageElement_Columns() {
		return (EReference)tableRelationshipPageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Attribute() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Table() {
		return (EReference)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_ConditionID() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Type() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Page() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_PageElement() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ParentCondtion() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueCondition() {
		return attributeValueConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueCondition_Trigger() {
		return (EReference)attributeValueConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueCondition_Value() {
		return (EAttribute)attributeValueConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCondition() {
		return compositeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeCondition_Operator() {
		return (EAttribute)compositeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_Conditions() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionType() {
		return conditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositeConditionOperator() {
		return compositeConditionOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsFactory getFormsFactory() {
		return (FormsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		entityModelEClass = createEClass(ENTITY_MODEL);
		createEReference(entityModelEClass, ENTITY_MODEL__ENTITIES);
		createEReference(entityModelEClass, ENTITY_MODEL__ENUMERATIONS);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEReference(entityEClass, ENTITY__ID);
		createEReference(entityEClass, ENTITY__SUPER_TYPE);
		createEReference(entityEClass, ENTITY__SUPER_TYPES);
		createEReference(entityEClass, ENTITY__ATTRIBUTES);
		createEReference(entityEClass, ENTITY__RELATIONSHIPS);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__MANDATORY);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEReference(attributeEClass, ATTRIBUTE__ENUMERATION_TYPE);
		createEReference(attributeEClass, ATTRIBUTE__ENTITY);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__NAME);
		createEReference(enumerationTypeEClass, ENUMERATION_TYPE__LITERALS);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__NAME);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__VALUE);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__NAME);
		createEAttribute(relationshipEClass, RELATIONSHIP__LOWER_BOUND);
		createEAttribute(relationshipEClass, RELATIONSHIP__UPPER_BOUND);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEReference(relationshipEClass, RELATIONSHIP__OPPOSITE);

		formModelEClass = createEClass(FORM_MODEL);
		createEReference(formModelEClass, FORM_MODEL__ENTITY_MODEL);
		createEReference(formModelEClass, FORM_MODEL__FORMS);
		createEReference(formModelEClass, FORM_MODEL__WELCOME_FORM);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__NAME);
		createEAttribute(formEClass, FORM__TITLE);
		createEAttribute(formEClass, FORM__DESCRIPTION);
		createEReference(formEClass, FORM__ENTITY);
		createEReference(formEClass, FORM__PAGES);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__TITLE);
		createEReference(pageEClass, PAGE__PAGE_ELEMENTS);
		createEReference(pageEClass, PAGE__CONDITIONS);
		createEReference(pageEClass, PAGE__FORM);

		pageElementEClass = createEClass(PAGE_ELEMENT);
		createEAttribute(pageElementEClass, PAGE_ELEMENT__LABEL);
		createEAttribute(pageElementEClass, PAGE_ELEMENT__ELEMENT_ID);
		createEReference(pageElementEClass, PAGE_ELEMENT__CONDITIONS);
		createEReference(pageElementEClass, PAGE_ELEMENT__PAGE);

		attributePageElementEClass = createEClass(ATTRIBUTE_PAGE_ELEMENT);
		createEReference(attributePageElementEClass, ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE);

		relationshipPageElementEClass = createEClass(RELATIONSHIP_PAGE_ELEMENT);
		createEReference(relationshipPageElementEClass, RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP);
		createEReference(relationshipPageElementEClass, RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM);

		textFieldAttributePageElementEClass = createEClass(TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT);
		createEAttribute(textFieldAttributePageElementEClass, TEXT_FIELD_ATTRIBUTE_PAGE_ELEMENT__FORMAT);

		textareaAttributePageElementEClass = createEClass(TEXTAREA_ATTRIBUTE_PAGE_ELEMENT);

		selectionAttributePageElementEClass = createEClass(SELECTION_ATTRIBUTE_PAGE_ELEMENT);

		dateSelectionAttributePageElementEClass = createEClass(DATE_SELECTION_ATTRIBUTE_PAGE_ELEMENT);

		timeSelectionAttributePageElementEClass = createEClass(TIME_SELECTION_ATTRIBUTE_PAGE_ELEMENT);

		listRelationshipPageElementEClass = createEClass(LIST_RELATIONSHIP_PAGE_ELEMENT);

		tableRelationshipPageElementEClass = createEClass(TABLE_RELATIONSHIP_PAGE_ELEMENT);
		createEReference(tableRelationshipPageElementEClass, TABLE_RELATIONSHIP_PAGE_ELEMENT__COLUMNS);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__ATTRIBUTE);
		createEReference(columnEClass, COLUMN__TABLE);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__CONDITION_ID);
		createEAttribute(conditionEClass, CONDITION__TYPE);
		createEReference(conditionEClass, CONDITION__PAGE);
		createEReference(conditionEClass, CONDITION__PAGE_ELEMENT);
		createEReference(conditionEClass, CONDITION__PARENT_CONDTION);

		attributeValueConditionEClass = createEClass(ATTRIBUTE_VALUE_CONDITION);
		createEReference(attributeValueConditionEClass, ATTRIBUTE_VALUE_CONDITION__TRIGGER);
		createEAttribute(attributeValueConditionEClass, ATTRIBUTE_VALUE_CONDITION__VALUE);

		compositeConditionEClass = createEClass(COMPOSITE_CONDITION);
		createEAttribute(compositeConditionEClass, COMPOSITE_CONDITION__OPERATOR);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__CONDITIONS);

		// Create enums
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
		conditionTypeEEnum = createEEnum(CONDITION_TYPE);
		compositeConditionOperatorEEnum = createEEnum(COMPOSITE_CONDITION_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributePageElementEClass.getESuperTypes().add(this.getPageElement());
		relationshipPageElementEClass.getESuperTypes().add(this.getPageElement());
		textFieldAttributePageElementEClass.getESuperTypes().add(this.getAttributePageElement());
		textareaAttributePageElementEClass.getESuperTypes().add(this.getAttributePageElement());
		selectionAttributePageElementEClass.getESuperTypes().add(this.getAttributePageElement());
		dateSelectionAttributePageElementEClass.getESuperTypes().add(this.getAttributePageElement());
		timeSelectionAttributePageElementEClass.getESuperTypes().add(this.getAttributePageElement());
		listRelationshipPageElementEClass.getESuperTypes().add(this.getRelationshipPageElement());
		tableRelationshipPageElementEClass.getESuperTypes().add(this.getRelationshipPageElement());
		attributeValueConditionEClass.getESuperTypes().add(this.getCondition());
		compositeConditionEClass.getESuperTypes().add(this.getCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(entityModelEClass, EntityModel.class, "EntityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityModel_Entities(), this.getEntity(), null, "entities", null, 0, -1, EntityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityModel_Enumerations(), this.getEnumerationType(), null, "enumerations", null, 0, -1, EntityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Id(), this.getAttribute(), null, "id", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_SuperType(), this.getEntity(), null, "superType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_SuperTypes(), this.getEntity(), null, "superTypes", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Attributes(), this.getAttribute(), this.getAttribute_Entity(), "attributes", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationships(), this.getRelationship(), this.getRelationship_Source(), "relationships", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.getAttributeType(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_EnumerationType(), this.getEnumerationType(), null, "enumerationType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Entity(), this.getEntity(), this.getEntity_Attributes(), "entity", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationType_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationType_Literals(), this.getEnumerationLiteral(), null, "literals", null, 1, -1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationLiteral_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_Name(), ecorePackage.getEString(), "name", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_LowerBound(), ecorePackage.getEBigInteger(), "lowerBound", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_UpperBound(), ecorePackage.getEBigInteger(), "upperBound", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Source(), this.getEntity(), this.getEntity_Relationships(), "source", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getEntity(), null, "target", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Opposite(), this.getRelationship(), null, "opposite", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formModelEClass, FormModel.class, "FormModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormModel_EntityModel(), this.getEntityModel(), null, "entityModel", null, 1, 1, FormModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormModel_Forms(), this.getForm(), null, "forms", null, 1, -1, FormModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormModel_WelcomeForm(), this.getForm(), null, "welcomeForm", null, 1, 1, FormModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Name(), ecorePackage.getEString(), "name", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Title(), ecorePackage.getEString(), "title", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Description(), ecorePackage.getEString(), "description", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Entity(), this.getEntity(), null, "entity", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Pages(), this.getPage(), this.getPage_Form(), "pages", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Title(), ecorePackage.getEString(), "title", null, 1, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_PageElements(), this.getPageElement(), this.getPageElement_Page(), "pageElements", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Conditions(), this.getCondition(), this.getCondition_Page(), "conditions", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Form(), this.getForm(), this.getForm_Pages(), "form", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageElementEClass, PageElement.class, "PageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPageElement_Label(), ecorePackage.getEString(), "label", null, 1, 1, PageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageElement_ElementID(), ecorePackage.getEString(), "elementID", null, 1, 1, PageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageElement_Conditions(), this.getCondition(), this.getCondition_PageElement(), "conditions", null, 0, -1, PageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageElement_Page(), this.getPage(), this.getPage_PageElements(), "page", null, 0, 1, PageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributePageElementEClass, AttributePageElement.class, "AttributePageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributePageElement_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, AttributePageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipPageElementEClass, RelationshipPageElement.class, "RelationshipPageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipPageElement_Relationship(), this.getRelationship(), null, "relationship", null, 1, 1, RelationshipPageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipPageElement_EditingForm(), this.getForm(), null, "editingForm", null, 1, 1, RelationshipPageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textFieldAttributePageElementEClass, TextFieldAttributePageElement.class, "TextFieldAttributePageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextFieldAttributePageElement_Format(), ecorePackage.getEString(), "format", null, 1, 1, TextFieldAttributePageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textareaAttributePageElementEClass, TextareaAttributePageElement.class, "TextareaAttributePageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionAttributePageElementEClass, SelectionAttributePageElement.class, "SelectionAttributePageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateSelectionAttributePageElementEClass, DateSelectionAttributePageElement.class, "DateSelectionAttributePageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeSelectionAttributePageElementEClass, TimeSelectionAttributePageElement.class, "TimeSelectionAttributePageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listRelationshipPageElementEClass, ListRelationshipPageElement.class, "ListRelationshipPageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableRelationshipPageElementEClass, TableRelationshipPageElement.class, "TableRelationshipPageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRelationshipPageElement_Columns(), this.getColumn(), this.getColumn_Table(), "columns", null, 1, -1, TableRelationshipPageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_Table(), this.getTableRelationshipPageElement(), this.getTableRelationshipPageElement_Columns(), "table", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_ConditionID(), ecorePackage.getEString(), "conditionID", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Type(), this.getConditionType(), "type", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Page(), this.getPage(), this.getPage_Conditions(), "page", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_PageElement(), this.getPageElement(), this.getPageElement_Conditions(), "pageElement", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_ParentCondtion(), this.getCompositeCondition(), this.getCompositeCondition_Conditions(), "parentCondtion", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueConditionEClass, AttributeValueCondition.class, "AttributeValueCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueCondition_Trigger(), this.getAttributePageElement(), null, "trigger", null, 1, 1, AttributeValueCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeValueCondition_Value(), ecorePackage.getEString(), "value", null, 1, 1, AttributeValueCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeConditionEClass, CompositeCondition.class, "CompositeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeCondition_Operator(), this.getCompositeConditionOperator(), "operator", null, 1, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCondition_Conditions(), this.getCondition(), this.getCondition_ParentCondtion(), "conditions", null, 2, 2, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.NONE);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.INTEGER);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.STRING);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.TEXT);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.DATE);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.YEAR);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.TIME);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.BOOLEAN);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.EMAIL);

		initEEnum(conditionTypeEEnum, ConditionType.class, "ConditionType");
		addEEnumLiteral(conditionTypeEEnum, ConditionType.SHOW);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.HIDE);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.ENABLE);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.DISABLE);

		initEEnum(compositeConditionOperatorEEnum, CompositeConditionOperator.class, "CompositeConditionOperator");
		addEEnumLiteral(compositeConditionOperatorEEnum, CompositeConditionOperator.AND);
		addEEnumLiteral(compositeConditionOperatorEEnum, CompositeConditionOperator.OR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (entityModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueEntityNames"
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "constraints", "identifierIsMandatory identifierIsMember superTypeIsNotSelf"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkNone"
		   });	
		addAnnotation
		  (enumerationTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueLiteralNames"
		   });	
		addAnnotation
		  (relationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "upperBoundGreaterThanLowerBound oppositeRelastionshipIsValid"
		   });	
		addAnnotation
		  (attributePageElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "validAttributePageElement"
		   });	
		addAnnotation
		  (relationshipPageElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "validRelationshipPageElement validEditingForm"
		   });	
		addAnnotation
		  (selectionAttributePageElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "validSelectionType"
		   });	
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "constraints", "validColumn"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (entityModelEClass, 
		   source, 
		   new String[] {
			 "uniqueEntityNames", "self.entities->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)"
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "identifierIsMandatory", "self.id.mandatory = true",
			 "identifierIsMember", "self.attributes -> includes(self.id) or self.superTypes.attributes -> includes(self.id)",
			 "superTypeIsNotSelf", "self <> superType"
		   });	
		addAnnotation
		  (getEntity_SuperTypes(), 
		   source, 
		   new String[] {
			 "derivation", "self -> closure(superType)"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "checkNone", "(self.type = AttributeType::None) <> (self.enumerationType = null)"
		   });	
		addAnnotation
		  (enumerationTypeEClass, 
		   source, 
		   new String[] {
			 "uniqueLiteralNames", "self.literals->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)"
		   });	
		addAnnotation
		  (relationshipEClass, 
		   source, 
		   new String[] {
			 "upperBoundGreaterThanLowerBound", "self.lowerBound >= 0 and (self.lowerBound <= self.upperBound xor self.upperBound = -1)",
			 "oppositeRelastionshipIsValid", "self.opposite <> null implies self.opposite.opposite = self"
		   });	
		addAnnotation
		  (attributePageElementEClass, 
		   source, 
		   new String[] {
			 "validAttributePageElement", "(self.page.form.entity.attributes->union(self.page.form.entity.superTypes.attributes) -> includes(self.attribute))"
		   });	
		addAnnotation
		  (relationshipPageElementEClass, 
		   source, 
		   new String[] {
			 "validRelationshipPageElement", "(self.page.form.entity.relationships->union(self.page.form.entity.superTypes.relationships) -> includes(self.relationship))",
			 "validEditingForm", "self.editingForm.entity = self.relationship.target"
		   });	
		addAnnotation
		  (selectionAttributePageElementEClass, 
		   source, 
		   new String[] {
			 "validSelectionType", "self.attribute.type = AttributeType::Boolean or self.attribute.enumerationType <> null"
		   });	
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "validColumn", "(self.table.relationship.target.attributes -> union(self.table.relationship.target.superTypes.attributes)) -> includes(self.attribute)"
		   });
	}

} //FormsPackageImpl
