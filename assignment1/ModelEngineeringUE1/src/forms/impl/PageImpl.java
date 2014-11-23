/**
 */
package forms.impl;

import forms.Condition;
import forms.Form;
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
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link forms.impl.PageImpl#getPageElements <em>Page Elements</em>}</li>
 *   <li>{@link forms.impl.PageImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link forms.impl.PageImpl#getForm <em>Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPageElements() <em>Page Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PageElement> pageElements;

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
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageElement> getPageElements() {
		if (pageElements == null) {
			pageElements = new EObjectContainmentWithInverseEList<PageElement>(PageElement.class, this, FormsPackage.PAGE__PAGE_ELEMENTS, FormsPackage.PAGE_ELEMENT__PAGE);
		}
		return pageElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentWithInverseEList<Condition>(Condition.class, this, FormsPackage.PAGE__CONDITIONS, FormsPackage.CONDITION__PAGE);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getForm() {
		if (eContainerFeatureID() != FormsPackage.PAGE__FORM) return null;
		return (Form)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(Form newForm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newForm, FormsPackage.PAGE__FORM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Form newForm) {
		if (newForm != eInternalContainer() || (eContainerFeatureID() != FormsPackage.PAGE__FORM && newForm != null)) {
			if (EcoreUtil.isAncestor(this, newForm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, FormsPackage.FORM__PAGES, Form.class, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.PAGE__FORM, newForm, newForm));
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
			case FormsPackage.PAGE__PAGE_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPageElements()).basicAdd(otherEnd, msgs);
			case FormsPackage.PAGE__CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditions()).basicAdd(otherEnd, msgs);
			case FormsPackage.PAGE__FORM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetForm((Form)otherEnd, msgs);
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
			case FormsPackage.PAGE__PAGE_ELEMENTS:
				return ((InternalEList<?>)getPageElements()).basicRemove(otherEnd, msgs);
			case FormsPackage.PAGE__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case FormsPackage.PAGE__FORM:
				return basicSetForm(null, msgs);
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
			case FormsPackage.PAGE__FORM:
				return eInternalContainer().eInverseRemove(this, FormsPackage.FORM__PAGES, Form.class, msgs);
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
			case FormsPackage.PAGE__TITLE:
				return getTitle();
			case FormsPackage.PAGE__PAGE_ELEMENTS:
				return getPageElements();
			case FormsPackage.PAGE__CONDITIONS:
				return getConditions();
			case FormsPackage.PAGE__FORM:
				return getForm();
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
			case FormsPackage.PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case FormsPackage.PAGE__PAGE_ELEMENTS:
				getPageElements().clear();
				getPageElements().addAll((Collection<? extends PageElement>)newValue);
				return;
			case FormsPackage.PAGE__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case FormsPackage.PAGE__FORM:
				setForm((Form)newValue);
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
			case FormsPackage.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FormsPackage.PAGE__PAGE_ELEMENTS:
				getPageElements().clear();
				return;
			case FormsPackage.PAGE__CONDITIONS:
				getConditions().clear();
				return;
			case FormsPackage.PAGE__FORM:
				setForm((Form)null);
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
			case FormsPackage.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FormsPackage.PAGE__PAGE_ELEMENTS:
				return pageElements != null && !pageElements.isEmpty();
			case FormsPackage.PAGE__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case FormsPackage.PAGE__FORM:
				return getForm() != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PageImpl
