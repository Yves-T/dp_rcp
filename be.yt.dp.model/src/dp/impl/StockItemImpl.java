/**
 */
package dp.impl;

import dp.Categorie;
import dp.DpPackage;
import dp.MyInterface;
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
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dp.impl.StockItemImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link dp.impl.StockItemImpl#getProdukt <em>Produkt</em>}</li>
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
	 * The cached value of the '{@link #getProdukt() <em>Produkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdukt()
	 * @generated
	 * @ordered
	 */
	protected Produkt produkt;

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
		if (eContainerFeatureID() != DpPackage.STOCK_ITEM__CATEGORIE) return null;
		return (Categorie)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategorie(Categorie newCategorie, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCategorie, DpPackage.STOCK_ITEM__CATEGORIE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(Categorie newCategorie) {
		if (newCategorie != eInternalContainer() || (eContainerFeatureID() != DpPackage.STOCK_ITEM__CATEGORIE && newCategorie != null)) {
			if (EcoreUtil.isAncestor(this, newCategorie))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCategorie != null)
				msgs = ((InternalEObject)newCategorie).eInverseAdd(this, DpPackage.CATEGORIE__STOCKITEMS, Categorie.class, msgs);
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
	public Produkt getProdukt() {
		if (produkt != null && produkt.eIsProxy()) {
			InternalEObject oldProdukt = (InternalEObject)produkt;
			produkt = (Produkt)eResolveProxy(oldProdukt);
			if (produkt != oldProdukt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DpPackage.STOCK_ITEM__PRODUKT, oldProdukt, produkt));
			}
		}
		return produkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produkt basicGetProdukt() {
		return produkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProdukt(Produkt newProdukt, NotificationChain msgs) {
		Produkt oldProdukt = produkt;
		produkt = newProdukt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__PRODUKT, oldProdukt, newProdukt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProdukt(Produkt newProdukt) {
		if (newProdukt != produkt) {
			NotificationChain msgs = null;
			if (produkt != null)
				msgs = ((InternalEObject)produkt).eInverseRemove(this, DpPackage.PRODUKT__STOCKITEMS, Produkt.class, msgs);
			if (newProdukt != null)
				msgs = ((InternalEObject)newProdukt).eInverseAdd(this, DpPackage.PRODUKT__STOCKITEMS, Produkt.class, msgs);
			msgs = basicSetProdukt(newProdukt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.STOCK_ITEM__PRODUKT, newProdukt, newProdukt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schuif getSchuif() {
		if (eContainerFeatureID() != DpPackage.STOCK_ITEM__SCHUIF) return null;
		return (Schuif)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchuif(Schuif newSchuif, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchuif, DpPackage.STOCK_ITEM__SCHUIF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchuif(Schuif newSchuif) {
		if (newSchuif != eInternalContainer() || (eContainerFeatureID() != DpPackage.STOCK_ITEM__SCHUIF && newSchuif != null)) {
			if (EcoreUtil.isAncestor(this, newSchuif))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
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
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCategorie((Categorie)otherEnd, msgs);
			case DpPackage.STOCK_ITEM__PRODUKT:
				if (produkt != null)
					msgs = ((InternalEObject)produkt).eInverseRemove(this, DpPackage.PRODUKT__STOCKITEMS, Produkt.class, msgs);
				return basicSetProdukt((Produkt)otherEnd, msgs);
			case DpPackage.STOCK_ITEM__SCHUIF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case DpPackage.STOCK_ITEM__PRODUKT:
				return basicSetProdukt(null, msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DpPackage.STOCK_ITEM__CATEGORIE:
				return eInternalContainer().eInverseRemove(this, DpPackage.CATEGORIE__STOCKITEMS, Categorie.class, msgs);
			case DpPackage.STOCK_ITEM__SCHUIF:
				return eInternalContainer().eInverseRemove(this, DpPackage.SCHUIF__STOCKITEM, Schuif.class, msgs);
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
			case DpPackage.STOCK_ITEM__CATEGORIE:
				return getCategorie();
			case DpPackage.STOCK_ITEM__PRODUKT:
				if (resolve) return getProdukt();
				return basicGetProdukt();
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
			case DpPackage.STOCK_ITEM__PRODUKT:
				setProdukt((Produkt)newValue);
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
			case DpPackage.STOCK_ITEM__PRODUKT:
				setProdukt((Produkt)null);
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
				return getCategorie() != null;
			case DpPackage.STOCK_ITEM__PRODUKT:
				return produkt != null;
			case DpPackage.STOCK_ITEM__SCHUIF:
				return getSchuif() != null;
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
