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
 * An implementation of the model object '<em><b>Categorie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dp.impl.CategorieImpl#getStockitem <em>Stockitem</em>}</li>
 *   <li>{@link dp.impl.CategorieImpl#getProdukt <em>Produkt</em>}</li>
 *   <li>{@link dp.impl.CategorieImpl#getNaam <em>Naam</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategorieImpl extends EObjectImpl implements Categorie {
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
	public StockItem getStockitem() {
		if (eContainerFeatureID() != DpPackage.CATEGORIE__STOCKITEM) return null;
		return (StockItem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockitem(StockItem newStockitem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStockitem, DpPackage.CATEGORIE__STOCKITEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockitem(StockItem newStockitem) {
		if (newStockitem != eInternalContainer() || (eContainerFeatureID() != DpPackage.CATEGORIE__STOCKITEM && newStockitem != null)) {
			if (EcoreUtil.isAncestor(this, newStockitem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStockitem != null)
				msgs = ((InternalEObject)newStockitem).eInverseAdd(this, DpPackage.STOCK_ITEM__CATEGORIE, StockItem.class, msgs);
			msgs = basicSetStockitem(newStockitem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.CATEGORIE__STOCKITEM, newStockitem, newStockitem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produkt getProdukt() {
		if (eContainerFeatureID() != DpPackage.CATEGORIE__PRODUKT) return null;
		return (Produkt)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProdukt(Produkt newProdukt, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProdukt, DpPackage.CATEGORIE__PRODUKT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProdukt(Produkt newProdukt) {
		if (newProdukt != eInternalContainer() || (eContainerFeatureID() != DpPackage.CATEGORIE__PRODUKT && newProdukt != null)) {
			if (EcoreUtil.isAncestor(this, newProdukt))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProdukt != null)
				msgs = ((InternalEObject)newProdukt).eInverseAdd(this, DpPackage.PRODUKT__CATEGORIES, Produkt.class, msgs);
			msgs = basicSetProdukt(newProdukt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.CATEGORIE__PRODUKT, newProdukt, newProdukt));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DpPackage.CATEGORIE__STOCKITEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStockitem((StockItem)otherEnd, msgs);
			case DpPackage.CATEGORIE__PRODUKT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProdukt((Produkt)otherEnd, msgs);
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
			case DpPackage.CATEGORIE__STOCKITEM:
				return basicSetStockitem(null, msgs);
			case DpPackage.CATEGORIE__PRODUKT:
				return basicSetProdukt(null, msgs);
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
			case DpPackage.CATEGORIE__STOCKITEM:
				return eInternalContainer().eInverseRemove(this, DpPackage.STOCK_ITEM__CATEGORIE, StockItem.class, msgs);
			case DpPackage.CATEGORIE__PRODUKT:
				return eInternalContainer().eInverseRemove(this, DpPackage.PRODUKT__CATEGORIES, Produkt.class, msgs);
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
			case DpPackage.CATEGORIE__STOCKITEM:
				return getStockitem();
			case DpPackage.CATEGORIE__PRODUKT:
				return getProdukt();
			case DpPackage.CATEGORIE__NAAM:
				return getNaam();
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
			case DpPackage.CATEGORIE__STOCKITEM:
				setStockitem((StockItem)newValue);
				return;
			case DpPackage.CATEGORIE__PRODUKT:
				setProdukt((Produkt)newValue);
				return;
			case DpPackage.CATEGORIE__NAAM:
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
			case DpPackage.CATEGORIE__STOCKITEM:
				setStockitem((StockItem)null);
				return;
			case DpPackage.CATEGORIE__PRODUKT:
				setProdukt((Produkt)null);
				return;
			case DpPackage.CATEGORIE__NAAM:
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
			case DpPackage.CATEGORIE__STOCKITEM:
				return getStockitem() != null;
			case DpPackage.CATEGORIE__PRODUKT:
				return getProdukt() != null;
			case DpPackage.CATEGORIE__NAAM:
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

} //CategorieImpl
