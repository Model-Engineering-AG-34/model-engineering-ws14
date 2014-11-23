/**
 */
package forms.impl;

import forms.CompositeCondition;
import forms.Condition;
import forms.ConditionType;
import forms.FormsPackage;
import forms.Page;
import forms.PageElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.impl.ConditionImpl#getConditionID <em>Condition ID</em>}</li>
 *   <li>{@link forms.impl.ConditionImpl#getType <em>Type</em>}</li>
 *   <li>{@link forms.impl.ConditionImpl#getPage <em>Page</em>}</li>
 *   <li>{@link forms.impl.ConditionImpl#getPageElement <em>Page Element</em>}</li>
 *   <li>{@link forms.impl.ConditionImpl#getParentCondtion <em>Parent Condtion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The default value of the '{@link #getConditionID() <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionID() <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionID()
	 * @generated
	 * @ordered
	 */
	protected String conditionID = CONDITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConditionType TYPE_EDEFAULT = ConditionType.SHOW;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConditionType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionID() {
		return conditionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionID(String newConditionID) {
		String oldConditionID = conditionID;
		conditionID = newConditionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.CONDITION__CONDITION_ID, oldConditionID, conditionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConditionType newType) {
		ConditionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.CONDITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage() {
		if (eContainerFeatureID() != FormsPackage.CONDITION__PAGE) return null;
		return (Page)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(Page newPage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPage, FormsPackage.CONDITION__PAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Page newPage) {
		if (newPage != eInternalContainer() || (eContainerFeatureID() != FormsPackage.CONDITION__PAGE && newPage != null)) {
			if (EcoreUtil.isAncestor(this, newPage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, FormsPackage.PAGE__CONDITIONS, Page.class, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.CONDITION__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageElement getPageElement() {
		if (eContainerFeatureID() != FormsPackage.CONDITION__PAGE_ELEMENT) return null;
		return (PageElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageElement(PageElement newPageElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPageElement, FormsPackage.CONDITION__PAGE_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageElement(PageElement newPageElement) {
		if (newPageElement != eInternalContainer() || (eContainerFeatureID() != FormsPackage.CONDITION__PAGE_ELEMENT && newPageElement != null)) {
			if (EcoreUtil.isAncestor(this, newPageElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPageElement != null)
				msgs = ((InternalEObject)newPageElement).eInverseAdd(this, FormsPackage.PAGE_ELEMENT__CONDITIONS, PageElement.class, msgs);
			msgs = basicSetPageElement(newPageElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.CONDITION__PAGE_ELEMENT, newPageElement, newPageElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCondition getParentCondtion() {
		if (eContainerFeatureID() != FormsPackage.CONDITION__PARENT_CONDTION) return null;
		return (CompositeCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCondtion(CompositeCondition newParentCondtion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentCondtion, FormsPackage.CONDITION__PARENT_CONDTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCondtion(CompositeCondition newParentCondtion) {
		if (newParentCondtion != eInternalContainer() || (eContainerFeatureID() != FormsPackage.CONDITION__PARENT_CONDTION && newParentCondtion != null)) {
			if (EcoreUtil.isAncestor(this, newParentCondtion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentCondtion != null)
				msgs = ((InternalEObject)newParentCondtion).eInverseAdd(this, FormsPackage.COMPOSITE_CONDITION__CONDITIONS, CompositeCondition.class, msgs);
			msgs = basicSetParentCondtion(newParentCondtion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.CONDITION__PARENT_CONDTION, newParentCondtion, newParentCondtion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.CONDITION__PAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPage((Page)otherEnd, msgs);
			case FormsPackage.CONDITION__PAGE_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPageElement((PageElement)otherEnd, msgs);
			case FormsPackage.CONDITION__PARENT_CONDTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentCondtion((CompositeCondition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.CONDITION__PAGE:
				return basicSetPage(null, msgs);
			case FormsPackage.CONDITION__PAGE_ELEMENT:
				return basicSetPageElement(null, msgs);
			case FormsPackage.CONDITION__PARENT_CONDTION:
				return basicSetParentCondtion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FormsPackage.CONDITION__PAGE:
				return eInternalContainer().eInverseRemove(this, FormsPackage.PAGE__CONDITIONS, Page.class, msgs);
			case FormsPackage.CONDITION__PAGE_ELEMENT:
				return eInternalContainer().eInverseRemove(this, FormsPackage.PAGE_ELEMENT__CONDITIONS, PageElement.class, msgs);
			case FormsPackage.CONDITION__PARENT_CONDTION:
				return eInternalContainer().eInverseRemove(this, FormsPackage.COMPOSITE_CONDITION__CONDITIONS, CompositeCondition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormsPackage.CONDITION__CONDITION_ID:
				return getConditionID();
			case FormsPackage.CONDITION__TYPE:
				return getType();
			case FormsPackage.CONDITION__PAGE:
				return getPage();
			case FormsPackage.CONDITION__PAGE_ELEMENT:
				return getPageElement();
			case FormsPackage.CONDITION__PARENT_CONDTION:
				return getParentCondtion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormsPackage.CONDITION__CONDITION_ID:
				setConditionID((String)newValue);
				return;
			case FormsPackage.CONDITION__TYPE:
				setType((ConditionType)newValue);
				return;
			case FormsPackage.CONDITION__PAGE:
				setPage((Page)newValue);
				return;
			case FormsPackage.CONDITION__PAGE_ELEMENT:
				setPageElement((PageElement)newValue);
				return;
			case FormsPackage.CONDITION__PARENT_CONDTION:
				setParentCondtion((CompositeCondition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FormsPackage.CONDITION__CONDITION_ID:
				setConditionID(CONDITION_ID_EDEFAULT);
				return;
			case FormsPackage.CONDITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FormsPackage.CONDITION__PAGE:
				setPage((Page)null);
				return;
			case FormsPackage.CONDITION__PAGE_ELEMENT:
				setPageElement((PageElement)null);
				return;
			case FormsPackage.CONDITION__PARENT_CONDTION:
				setParentCondtion((CompositeCondition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FormsPackage.CONDITION__CONDITION_ID:
				return CONDITION_ID_EDEFAULT == null ? conditionID != null : !CONDITION_ID_EDEFAULT.equals(conditionID);
			case FormsPackage.CONDITION__TYPE:
				return type != TYPE_EDEFAULT;
			case FormsPackage.CONDITION__PAGE:
				return getPage() != null;
			case FormsPackage.CONDITION__PAGE_ELEMENT:
				return getPageElement() != null;
			case FormsPackage.CONDITION__PARENT_CONDTION:
				return getParentCondtion() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (conditionID: ");
		result.append(conditionID);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
