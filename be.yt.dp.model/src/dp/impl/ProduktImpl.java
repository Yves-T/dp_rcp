/**
 */
package dp.impl;

import dp.Categorie;
import dp.DpPackage;
import dp.Produkt;
import dp.StockItem;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dp.impl.ProduktImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link dp.impl.ProduktImpl#getStockitems <em>Stockitems</em>}</li>
 *   <li>{@link dp.impl.ProduktImpl#getNaam <em>Naam</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProduktImpl extends EObjectImpl implements Produkt {
	/**
	 * The cached value of the '{@link #getStockitems() <em>Stockitems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockitems()
	 * @generated
	 * @ordered
	 */
	protected EList<StockItem> stockitems;

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
		if (eContainerFeatureID() != DpPackage.PRODUKT__CATEGORIES) return null;
		return (Categorie)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategories(Categorie newCategories, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCategories, DpPackage.PRODUKT__CATEGORIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategories(Categorie newCategories) {
		if (newCategories != eInternalContainer() || (eContainerFeatureID() != DpPackage.PRODUKT__CATEGORIES && newCategories != null)) {
			if (EcoreUtil.isAncestor(this, newCategories))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCategories != null)
				msgs = ((InternalEObject)newCategories).eInverseAdd(this, DpPackage.CATEGORIE__PRODUKTEN, Categorie.class, msgs);
			msgs = basicSetCategories(newCategories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.PRODUKT__CATEGORIES, newCategories, newCategories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StockItem> getStockitems() {
		if (stockitems == null) {
			stockitems = new EObjectWithInverseResolvingEList<StockItem>(StockItem.class, this, DpPackage.PRODUKT__STOCKITEMS, DpPackage.STOCK_ITEM__PRODUKT);
		}
		return stockitems;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DpPackage.PRODUKT__CATEGORIES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCategories((Categorie)otherEnd, msgs);
			case DpPackage.PRODUKT__STOCKITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStockitems()).basicAdd(otherEnd, msgs);
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
			case DpPackage.PRODUKT__CATEGORIES:
				return basicSetCategories(null, msgs);
			case DpPackage.PRODUKT__STOCKITEMS:
				return ((InternalEList<?>)getStockitems()).basicRemove(otherEnd, msgs);
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
			case DpPackage.PRODUKT__CATEGORIES:
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
				return getCategories();
			case DpPackage.PRODUKT__STOCKITEMS:
				return getStockitems();
			case DpPackage.PRODUKT__NAAM:
				return getNaam();
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
			case DpPackage.PRODUKT__CATEGORIES:
				setCategories((Categorie)newValue);
				return;
			case DpPackage.PRODUKT__STOCKITEMS:
				getStockitems().clear();
				getStockitems().addAll((Collection<? extends StockItem>)newValue);
				return;
			case DpPackage.PRODUKT__NAAM:
				setNaam((String)newValue);
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
			case DpPackage.PRODUKT__STOCKITEMS:
				getStockitems().clear();
				return;
			case DpPackage.PRODUKT__NAAM:
				setNaam(NAAM_EDEFAULT);
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
				return getCategories() != null;
			case DpPackage.PRODUKT__STOCKITEMS:
				return stockitems != null && !stockitems.isEmpty();
			case DpPackage.PRODUKT__NAAM:
				return NAAM_EDEFAULT == null ? naam != null : !NAAM_EDEFAULT.equals(naam);
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
