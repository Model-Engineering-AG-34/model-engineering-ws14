/**
 */
package forms.impl;

import forms.Condition;
import forms.FormsPackage;
import forms.Page;
import forms.PageElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.impl.PageElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link forms.impl.PageElementImpl#getElementID <em>Element ID</em>}</li>
 *   <li>{@link forms.impl.PageElementImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link forms.impl.PageElementImpl#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PageElementImpl extends MinimalEObjectImpl.Container implements PageElement {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected String elementID = ELEMENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.PAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.PAGE_ELEMENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementID() {
		return elementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementID(String newElementID) {
		String oldElementID = elementID;
		elementID = newElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.PAGE_ELEMENT__ELEMENT_ID, oldElementID, elementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentWithInverseEList<Condition>(Condition.class, this, FormsPackage.PAGE_ELEMENT__CONDITIONS, FormsPackage.CONDITION__PAGE_ELEMENT);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage() {
		if (eContainerFeatureID() != FormsPackage.PAGE_ELEMENT__PAGE) return null;
		return (Page)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(Page newPage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPage, FormsPackage.PAGE_ELEMENT__PAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Page newPage) {
		if (newPage != eInternalContainer() || (eContainerFeatureID() != FormsPackage.PAGE_ELEMENT__PAGE && newPage != null)) {
			if (EcoreUtil.isAncestor(this, newPage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, FormsPackage.PAGE__PAGE_ELEMENTS, Page.class, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.PAGE_ELEMENT__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.PAGE_ELEMENT__CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditions()).basicAdd(otherEnd, msgs);
			case FormsPackage.PAGE_ELEMENT__PAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPage((Page)otherEnd, msgs);
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
			case FormsPackage.PAGE_ELEMENT__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case FormsPackage.PAGE_ELEMENT__PAGE:
				return basicSetPage(null, msgs);
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
			case FormsPackage.PAGE_ELEMENT__PAGE:
				return eInternalContainer().eInverseRemove(this, FormsPackage.PAGE__PAGE_ELEMENTS, Page.class, msgs);
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
			case FormsPackage.PAGE_ELEMENT__LABEL:
				return getLabel();
			case FormsPackage.PAGE_ELEMENT__ELEMENT_ID:
				return getElementID();
			case FormsPackage.PAGE_ELEMENT__CONDITIONS:
				return getConditions();
			case FormsPackage.PAGE_ELEMENT__PAGE:
				return getPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormsPackage.PAGE_ELEMENT__LABEL:
				setLabel((String)newValue);
				return;
			case FormsPackage.PAGE_ELEMENT__ELEMENT_ID:
				setElementID((String)newValue);
				return;
			case FormsPackage.PAGE_ELEMENT__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case FormsPackage.PAGE_ELEMENT__PAGE:
				setPage((Page)newValue);
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
			case FormsPackage.PAGE_ELEMENT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormsPackage.PAGE_ELEMENT__ELEMENT_ID:
				setElementID(ELEMENT_ID_EDEFAULT);
				return;
			case FormsPackage.PAGE_ELEMENT__CONDITIONS:
				getConditions().clear();
				return;
			case FormsPackage.PAGE_ELEMENT__PAGE:
				setPage((Page)null);
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
			case FormsPackage.PAGE_ELEMENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FormsPackage.PAGE_ELEMENT__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementID != null : !ELEMENT_ID_EDEFAULT.equals(elementID);
			case FormsPackage.PAGE_ELEMENT__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case FormsPackage.PAGE_ELEMENT__PAGE:
				return getPage() != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", elementID: ");
		result.append(elementID);
		result.append(')');
		return result.toString();
	}

} //PageElementImpl
