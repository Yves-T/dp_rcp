/**
 */
package dp.impl;

import dp.Categorie;
import dp.DpPackage;
import dp.Produkt;
import dp.StockItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dp.impl.ProduktImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link dp.impl.ProduktImpl#getStockitem <em>Stockitem</em>}</li>
 *   <li>{@link dp.impl.ProduktImpl#getNaam <em>Naam</em>}</li>
 *   <li>{@link dp.impl.ProduktImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProduktImpl extends EObjectImpl implements Produkt {
	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected Categorie categories;

	/**
	 * The default value of the '{@link #getNaam() <em>Naam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaam()
	 * @generated
	 * @ordered
	 */
	protected static final String NAAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNaam() <em>Naam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaam()
	 * @generated
	 * @ordered
	 */
	protected String naam = NAAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProduktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DpPackage.Literals.PRODUKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie getCategories() {
		if (categories != null && categories.eIsProxy()) {
			InternalEObject oldCategories = (InternalEObject)categories;
			categories = (Categorie)eResolveProxy(oldCategories);
			if (categories != oldCategories) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DpPackage.PRODUKT__CATEGORIES, oldCategories, categories));
			}
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie basicGetCategories() {
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategories(Categorie newCategories) {
		Categorie oldCategories = categories;
		categories = newCategories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.PRODUKT__CATEGORIES, oldCategories, categories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockItem getStockitem() {
		if (eContainerFeatureID() != DpPackage.PRODUKT__STOCKITEM) return null;
		return (StockItem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockitem(StockItem newStockitem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStockitem, DpPackage.PRODUKT__STOCKITEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockitem(StockItem newStockitem) {
		if (newStockitem != eInternalContainer() || (eContainerFeatureID() != DpPackage.PRODUKT__STOCKITEM && newStockitem != null)) {
			if (EcoreUtil.isAncestor(this, newStockitem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStockitem != null)
				msgs = ((InternalEObject)newStockitem).eInverseAdd(this, DpPackage.STOCK_ITEM__PRODUKTEN, StockItem.class, msgs);
			msgs = basicSetStockitem(newStockitem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.PRODUKT__STOCKITEM, newStockitem, newStockitem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNaam() {
		return naam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNaam(String newNaam) {
		String oldNaam = naam;
		naam = newNaam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.PRODUKT__NAAM, oldNaam, naam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie getCategory() {
		if (eContainerFeatureID() != DpPackage.PRODUKT__CATEGORY) return null;
		return (Categorie)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Categorie newCategory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCategory, DpPackage.PRODUKT__CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Categorie newCategory) {
		if (newCategory != eInternalContainer() || (eContainerFeatureID() != DpPackage.PRODUKT__CATEGORY && newCategory != null)) {
			if (EcoreUtil.isAncestor(this, newCategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, DpPackage.CATEGORIE__PRODUKTEN, Categorie.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.PRODUKT__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DpPackage.PRODUKT__STOCKITEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStockitem((StockItem)otherEnd, msgs);
			case DpPackage.PRODUKT__CATEGORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCategory((Categorie)otherEnd, msgs);
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
			case DpPackage.PRODUKT__STOCKITEM:
				return basicSetStockitem(null, msgs);
			case DpPackage.PRODUKT__CATEGORY:
				return basicSetCategory(null, msgs);
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
			case DpPackage.PRODUKT__STOCKITEM:
				return eInternalContainer().eInverseRemove(this, DpPackage.STOCK_ITEM__PRODUKTEN, StockItem.class, msgs);
			case DpPackage.PRODUKT__CATEGORY:
				return eInternalContainer().eInverseRemove(this, DpPackage.CATEGORIE__PRODUKTEN, Categorie.class, msgs);
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
			case DpPackage.PRODUKT__CATEGORIES:
				if (resolve) return getCategories();
				return basicGetCategories();
			case DpPackage.PRODUKT__STOCKITEM:
				return getStockitem();
			case DpPackage.PRODUKT__NAAM:
				return getNaam();
			case DpPackage.PRODUKT__CATEGORY:
				return getCategory();
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
			case DpPackage.PRODUKT__CATEGORIES:
				setCategories((Categorie)newValue);
				return;
			case DpPackage.PRODUKT__STOCKITEM:
				setStockitem((StockItem)newValue);
				return;
			case DpPackage.PRODUKT__NAAM:
				setNaam((String)newValue);
				return;
			case DpPackage.PRODUKT__CATEGORY:
				setCategory((Categorie)newValue);
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
			case DpPackage.PRODUKT__CATEGORIES:
				setCategories((Categorie)null);
				return;
			case DpPackage.PRODUKT__STOCKITEM:
				setStockitem((StockItem)null);
				return;
			case DpPackage.PRODUKT__NAAM:
				setNaam(NAAM_EDEFAULT);
				return;
			case DpPackage.PRODUKT__CATEGORY:
				setCategory((Categorie)null);
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
			case DpPackage.PRODUKT__CATEGORIES:
				return categories != null;
			case DpPackage.PRODUKT__STOCKITEM:
				return getStockitem() != null;
			case DpPackage.PRODUKT__NAAM:
				return NAAM_EDEFAULT == null ? naam != null : !NAAM_EDEFAULT.equals(naam);
			case DpPackage.PRODUKT__CATEGORY:
				return getCategory() != null;
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
		result.append(" (naam: ");
		result.append(naam);
		result.append(')');
		return result.toString();
	}

} //ProduktImpl
