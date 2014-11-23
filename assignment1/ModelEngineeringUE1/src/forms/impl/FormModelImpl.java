/**
 */
package forms.impl;

import forms.EntityModel;
import forms.Form;
import forms.FormModel;
import forms.FormsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.impl.FormModelImpl#getEntityModel <em>Entity Model</em>}</li>
 *   <li>{@link forms.impl.FormModelImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link forms.impl.FormModelImpl#getWelcomeForm <em>Welcome Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormModelImpl extends MinimalEObjectImpl.Container implements FormModel {
	/**
	 * The cached value of the '{@link #getEntityModel() <em>Entity Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityModel()
	 * @generated
	 * @ordered
	 */
	protected EntityModel entityModel;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * The cached value of the '{@link #getWelcomeForm() <em>Welcome Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeForm()
	 * @generated
	 * @ordered
	 */
	protected Form welcomeForm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FORM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityModel getEntityModel() {
		return entityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityModel(EntityModel newEntityModel, NotificationChain msgs) {
		EntityModel oldEntityModel = entityModel;
		entityModel = newEntityModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormsPackage.FORM_MODEL__ENTITY_MODEL, oldEntityModel, newEntityModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityModel(EntityModel newEntityModel) {
		if (newEntityModel != entityModel) {
			NotificationChain msgs = null;
			if (entityModel != null)
				msgs = ((InternalEObject)entityModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormsPackage.FORM_MODEL__ENTITY_MODEL, null, msgs);
			if (newEntityModel != null)
				msgs = ((InternalEObject)newEntityModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormsPackage.FORM_MODEL__ENTITY_MODEL, null, msgs);
			msgs = basicSetEntityModel(newEntityModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.FORM_MODEL__ENTITY_MODEL, newEntityModel, newEntityModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, FormsPackage.FORM_MODEL__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getWelcomeForm() {
		if (welcomeForm != null && welcomeForm.eIsProxy()) {
			InternalEObject oldWelcomeForm = (InternalEObject)welcomeForm;
			welcomeForm = (Form)eResolveProxy(oldWelcomeForm);
			if (welcomeForm != oldWelcomeForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormsPackage.FORM_MODEL__WELCOME_FORM, oldWelcomeForm, welcomeForm));
			}
		}
		return welcomeForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form basicGetWelcomeForm() {
		return welcomeForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcomeForm(Form newWelcomeForm) {
		Form oldWelcomeForm = welcomeForm;
		welcomeForm = newWelcomeForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.FORM_MODEL__WELCOME_FORM, oldWelcomeForm, welcomeForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.FORM_MODEL__ENTITY_MODEL:
				return basicSetEntityModel(null, msgs);
			case FormsPackage.FORM_MODEL__FORMS:
				return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormsPackage.FORM_MODEL__ENTITY_MODEL:
				return getEntityModel();
			case FormsPackage.FORM_MODEL__FORMS:
				return getForms();
			case FormsPackage.FORM_MODEL__WELCOME_FORM:
				if (resolve) return getWelcomeForm();
				return basicGetWelcomeForm();
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
			case FormsPackage.FORM_MODEL__ENTITY_MODEL:
				setEntityModel((EntityModel)newValue);
				return;
			case FormsPackage.FORM_MODEL__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
				return;
			case FormsPackage.FORM_MODEL__WELCOME_FORM:
				setWelcomeForm((Form)newValue);
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
			case FormsPackage.FORM_MODEL__ENTITY_MODEL:
				setEntityModel((EntityModel)null);
				return;
			case FormsPackage.FORM_MODEL__FORMS:
				getForms().clear();
				return;
			case FormsPackage.FORM_MODEL__WELCOME_FORM:
				setWelcomeForm((Form)null);
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
			case FormsPackage.FORM_MODEL__ENTITY_MODEL:
				return entityModel != null;
			case FormsPackage.FORM_MODEL__FORMS:
				return forms != null && !forms.isEmpty();
			case FormsPackage.FORM_MODEL__WELCOME_FORM:
				return welcomeForm != null;
		}
		return super.eIsSet(featureID);
	}

} //FormModelImpl
