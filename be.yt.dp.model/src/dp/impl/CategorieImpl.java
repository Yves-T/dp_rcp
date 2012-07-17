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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categorie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dp.impl.CategorieImpl#getStockitems <em>Stockitems</em>}</li>
 *   <li>{@link dp.impl.CategorieImpl#getNaam <em>Naam</em>}</li>
 *   <li>{@link dp.impl.CategorieImpl#getProdukten <em>Produkten</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategorieImpl extends EObjectImpl implements Categorie {
	/**
	 * The cached value of the '{@link #getStockitems() <em>Stockitems</em>}' containment reference list.
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
	 * The cached value of the '{@link #getProdukten() <em>Produkten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukten()
	 * @generated
	 * @ordered
	 */
	protected EList<Produkt> produkten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DpPackage.Literals.CATEGORIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StockItem> getStockitems() {
		if (stockitems == null) {
			stockitems = new EObjectContainmentWithInverseEList<StockItem>(StockItem.class, this, DpPackage.CATEGORIE__STOCKITEMS, DpPackage.STOCK_ITEM__CATEGORIE);
		}
		return stockitems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Produkt> getProdukten() {
		if (produkten == null) {
			produkten = new EObjectContainmentWithInverseEList<Produkt>(Produkt.class, this, DpPackage.CATEGORIE__PRODUKTEN, DpPackage.PRODUKT__CATEGORIES);
		}
		return produkten;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.CATEGORIE__NAAM, oldNaam, naam));
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
			case DpPackage.CATEGORIE__STOCKITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStockitems()).basicAdd(otherEnd, msgs);
			case DpPackage.CATEGORIE__PRODUKTEN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProdukten()).basicAdd(otherEnd, msgs);
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
			case DpPackage.CATEGORIE__STOCKITEMS:
				return ((InternalEList<?>)getStockitems()).basicRemove(otherEnd, msgs);
			case DpPackage.CATEGORIE__PRODUKTEN:
				return ((InternalEList<?>)getProdukten()).basicRemove(otherEnd, msgs);
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
			case DpPackage.CATEGORIE__STOCKITEMS:
				return getStockitems();
			case DpPackage.CATEGORIE__NAAM:
				return getNaam();
			case DpPackage.CATEGORIE__PRODUKTEN:
				return getProdukten();
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
			case DpPackage.CATEGORIE__STOCKITEMS:
				getStockitems().clear();
				getStockitems().addAll((Collection<? extends StockItem>)newValue);
				return;
			case DpPackage.CATEGORIE__NAAM:
				setNaam((String)newValue);
				return;
			case DpPackage.CATEGORIE__PRODUKTEN:
				getProdukten().clear();
				getProdukten().addAll((Collection<? extends Produkt>)newValue);
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
			case DpPackage.CATEGORIE__STOCKITEMS:
				getStockitems().clear();
				return;
			case DpPackage.CATEGORIE__NAAM:
				setNaam(NAAM_EDEFAULT);
				return;
			case DpPackage.CATEGORIE__PRODUKTEN:
				getProdukten().clear();
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
			case DpPackage.CATEGORIE__STOCKITEMS:
				return stockitems != null && !stockitems.isEmpty();
			case DpPackage.CATEGORIE__NAAM:
				return NAAM_EDEFAULT == null ? naam != null : !NAAM_EDEFAULT.equals(naam);
			case DpPackage.CATEGORIE__PRODUKTEN:
				return produkten != null && !produkten.isEmpty();
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

} //CategorieImpl
