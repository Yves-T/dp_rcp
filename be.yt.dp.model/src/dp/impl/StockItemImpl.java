/**
 */
package dp.impl;

import dp.Categorie;
import dp.DpPackage;
import dp.Produkt;
import dp.Schuif;
import dp.StockItem;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dp.impl.StockItemImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link dp.impl.StockItemImpl#getProdukten <em>Produkten</em>}</li>
 *   <li>{@link dp.impl.StockItemImpl#getSchuif <em>Schuif</em>}</li>
 *   <li>{@link dp.impl.StockItemImpl#getAantal <em>Aantal</em>}</li>
 *   <li>{@link dp.impl.StockItemImpl#getDatum <em>Datum</em>}</li>
 *   <li>{@link dp.impl.StockItemImpl#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StockItemImpl extends EObjectImpl implements StockItem {
	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected Categorie categorie;

	/**
	 * The cached value of the '{@link #getProdukten() <em>Produkten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukten()
	 * @generated
	 * @ordered
	 */
	protected Produkt produkten;

	/**
	 * The cached value of the '{@link #getSchuif() <em>Schuif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchuif()
	 * @generated
	 * @ordered
	 */
	protected Schuif schuif;

	/**
	 * The default value of the '{@link #getAantal() <em>Aantal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAantal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AANTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAantal() <em>Aantal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAantal()
	 * @generated
	 * @ordered
	 */
	protected Integer aantal = AANTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected Date datum = DATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected String info = INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DpPackage.Literals.STOCK_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategorie(Categorie newCategorie, NotificationChain msgs) {
		Categorie oldCategorie = categorie;
		categorie = newCategorie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__CATEGORIE, oldCategorie, newCategorie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(Categorie newCategorie) {
		if (newCategorie != categorie) {
			NotificationChain msgs = null;
			if (categorie != null)
				msgs = ((InternalEObject)categorie).eInverseRemove(this, DpPackage.CATEGORIE__STOCKITEM, Categorie.class, msgs);
			if (newCategorie != null)
				msgs = ((InternalEObject)newCategorie).eInverseAdd(this, DpPackage.CATEGORIE__STOCKITEM, Categorie.class, msgs);
			msgs = basicSetCategorie(newCategorie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__CATEGORIE, newCategorie, newCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produkt getProdukten() {
		return produkten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProdukten(Produkt newProdukten, NotificationChain msgs) {
		Produkt oldProdukten = produkten;
		produkten = newProdukten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__PRODUKTEN, oldProdukten, newProdukten);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProdukten(Produkt newProdukten) {
		if (newProdukten != produkten) {
			NotificationChain msgs = null;
			if (produkten != null)
				msgs = ((InternalEObject)produkten).eInverseRemove(this, DpPackage.PRODUKT__STOCKITEM, Produkt.class, msgs);
			if (newProdukten != null)
				msgs = ((InternalEObject)newProdukten).eInverseAdd(this, DpPackage.PRODUKT__STOCKITEM, Produkt.class, msgs);
			msgs = basicSetProdukten(newProdukten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__PRODUKTEN, newProdukten, newProdukten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schuif getSchuif() {
		return schuif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchuif(Schuif newSchuif, NotificationChain msgs) {
		Schuif oldSchuif = schuif;
		schuif = newSchuif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__SCHUIF, oldSchuif, newSchuif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchuif(Schuif newSchuif) {
		if (newSchuif != schuif) {
			NotificationChain msgs = null;
			if (schuif != null)
				msgs = ((InternalEObject)schuif).eInverseRemove(this, DpPackage.SCHUIF__STOCKITEM, Schuif.class, msgs);
			if (newSchuif != null)
				msgs = ((InternalEObject)newSchuif).eInverseAdd(this, DpPackage.SCHUIF__STOCKITEM, Schuif.class, msgs);
			msgs = basicSetSchuif(newSchuif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__SCHUIF, newSchuif, newSchuif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAantal() {
		return aantal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAantal(Integer newAantal) {
		Integer oldAantal = aantal;
		aantal = newAantal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__AANTAL, oldAantal, aantal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatum() {
		return datum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatum(Date newDatum) {
		Date oldDatum = datum;
		datum = newDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__DATUM, oldDatum, datum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(String newInfo) {
		String oldInfo = info;
		info = newInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__INFO, oldInfo, info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DpPackage.STOCK_ITEM__CATEGORIE:
				if (categorie != null)
					msgs = ((InternalEObject)categorie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DpPackage.STOCK_ITEM__CATEGORIE, null, msgs);
				return basicSetCategorie((Categorie)otherEnd, msgs);
			case DpPackage.STOCK_ITEM__PRODUKTEN:
				if (produkten != null)
					msgs = ((InternalEObject)produkten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DpPackage.STOCK_ITEM__PRODUKTEN, null, msgs);
				return basicSetProdukten((Produkt)otherEnd, msgs);
			case DpPackage.STOCK_ITEM__SCHUIF:
				if (schuif != null)
					msgs = ((InternalEObject)schuif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DpPackage.STOCK_ITEM__SCHUIF, null, msgs);
				return basicSetSchuif((Schuif)otherEnd, msgs);
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
			case DpPackage.STOCK_ITEM__CATEGORIE:
				return basicSetCategorie(null, msgs);
			case DpPackage.STOCK_ITEM__PRODUKTEN:
				return basicSetProdukten(null, msgs);
			case DpPackage.STOCK_ITEM__SCHUIF:
				return basicSetSchuif(null, msgs);
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
			case DpPackage.STOCK_ITEM__CATEGORIE:
				return getCategorie();
			case DpPackage.STOCK_ITEM__PRODUKTEN:
				return getProdukten();
			case DpPackage.STOCK_ITEM__SCHUIF:
				return getSchuif();
			case DpPackage.STOCK_ITEM__AANTAL:
				return getAantal();
			case DpPackage.STOCK_ITEM__DATUM:
				return getDatum();
			case DpPackage.STOCK_ITEM__INFO:
				return getInfo();
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
			case DpPackage.STOCK_ITEM__CATEGORIE:
				setCategorie((Categorie)newValue);
				return;
			case DpPackage.STOCK_ITEM__PRODUKTEN:
				setProdukten((Produkt)newValue);
				return;
			case DpPackage.STOCK_ITEM__SCHUIF:
				setSchuif((Schuif)newValue);
				return;
			case DpPackage.STOCK_ITEM__AANTAL:
				setAantal((Integer)newValue);
				return;
			case DpPackage.STOCK_ITEM__DATUM:
				setDatum((Date)newValue);
				return;
			case DpPackage.STOCK_ITEM__INFO:
				setInfo((String)newValue);
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
			case DpPackage.STOCK_ITEM__CATEGORIE:
				setCategorie((Categorie)null);
				return;
			case DpPackage.STOCK_ITEM__PRODUKTEN:
				setProdukten((Produkt)null);
				return;
			case DpPackage.STOCK_ITEM__SCHUIF:
				setSchuif((Schuif)null);
				return;
			case DpPackage.STOCK_ITEM__AANTAL:
				setAantal(AANTAL_EDEFAULT);
				return;
			case DpPackage.STOCK_ITEM__DATUM:
				setDatum(DATUM_EDEFAULT);
				return;
			case DpPackage.STOCK_ITEM__INFO:
				setInfo(INFO_EDEFAULT);
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
			case DpPackage.STOCK_ITEM__CATEGORIE:
				return categorie != null;
			case DpPackage.STOCK_ITEM__PRODUKTEN:
				return produkten != null;
			case DpPackage.STOCK_ITEM__SCHUIF:
				return schuif != null;
			case DpPackage.STOCK_ITEM__AANTAL:
				return AANTAL_EDEFAULT == null ? aantal != null : !AANTAL_EDEFAULT.equals(aantal);
			case DpPackage.STOCK_ITEM__DATUM:
				return DATUM_EDEFAULT == null ? datum != null : !DATUM_EDEFAULT.equals(datum);
			case DpPackage.STOCK_ITEM__INFO:
				return INFO_EDEFAULT == null ? info != null : !INFO_EDEFAULT.equals(info);
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
		result.append(" (aantal: ");
		result.append(aantal);
		result.append(", datum: ");
		result.append(datum);
		result.append(", info: ");
		result.append(info);
		result.append(')');
		return result.toString();
	}

} //StockItemImpl
