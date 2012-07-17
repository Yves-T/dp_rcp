/**
 */
package dp.impl;

import dp.Diepvries;
import dp.DpPackage;
import dp.Schuif;
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
 * An implementation of the model object '<em><b>Schuif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dp.impl.SchuifImpl#getDiepvries <em>Diepvries</em>}</li>
 *   <li>{@link dp.impl.SchuifImpl#getStockitem <em>Stockitem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchuifImpl extends EObjectImpl implements Schuif {
	/**
	 * The cached value of the '{@link #getStockitem() <em>Stockitem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockitem()
	 * @generated
	 * @ordered
	 */
	protected StockItem stockitem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchuifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DpPackage.Literals.SCHUIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diepvries getDiepvries() {
		if (eContainerFeatureID() != DpPackage.SCHUIF__DIEPVRIES) return null;
		return (Diepvries)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiepvries(Diepvries newDiepvries, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiepvries, DpPackage.SCHUIF__DIEPVRIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiepvries(Diepvries newDiepvries) {
		if (newDiepvries != eInternalContainer() || (eContainerFeatureID() != DpPackage.SCHUIF__DIEPVRIES && newDiepvries != null)) {
			if (EcoreUtil.isAncestor(this, newDiepvries))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiepvries != null)
				msgs = ((InternalEObject)newDiepvries).eInverseAdd(this, DpPackage.DIEPVRIES__SCHUIVEN, Diepvries.class, msgs);
			msgs = basicSetDiepvries(newDiepvries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.SCHUIF__DIEPVRIES, newDiepvries, newDiepvries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockItem getStockitem() {
		return stockitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockitem(StockItem newStockitem, NotificationChain msgs) {
		StockItem oldStockitem = stockitem;
		stockitem = newStockitem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DpPackage.SCHUIF__STOCKITEM, oldStockitem, newStockitem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockitem(StockItem newStockitem) {
		if (newStockitem != stockitem) {
			NotificationChain msgs = null;
			if (stockitem != null)
				msgs = ((InternalEObject)stockitem).eInverseRemove(this, DpPackage.STOCK_ITEM__SCHUIF, StockItem.class, msgs);
			if (newStockitem != null)
				msgs = ((InternalEObject)newStockitem).eInverseAdd(this, DpPackage.STOCK_ITEM__SCHUIF, StockItem.class, msgs);
			msgs = basicSetStockitem(newStockitem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DpPackage.SCHUIF__STOCKITEM, newStockitem, newStockitem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DpPackage.SCHUIF__DIEPVRIES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiepvries((Diepvries)otherEnd, msgs);
			case DpPackage.SCHUIF__STOCKITEM:
				if (stockitem != null)
					msgs = ((InternalEObject)stockitem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DpPackage.SCHUIF__STOCKITEM, null, msgs);
				return basicSetStockitem((StockItem)otherEnd, msgs);
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
			case DpPackage.SCHUIF__DIEPVRIES:
				return basicSetDiepvries(null, msgs);
			case DpPackage.SCHUIF__STOCKITEM:
				return basicSetStockitem(null, msgs);
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
			case DpPackage.SCHUIF__DIEPVRIES:
				return eInternalContainer().eInverseRemove(this, DpPackage.DIEPVRIES__SCHUIVEN, Diepvries.class, msgs);
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
			case DpPackage.SCHUIF__DIEPVRIES:
				return getDiepvries();
			case DpPackage.SCHUIF__STOCKITEM:
				return getStockitem();
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
			case DpPackage.SCHUIF__DIEPVRIES:
				setDiepvries((Diepvries)newValue);
				return;
			case DpPackage.SCHUIF__STOCKITEM:
				setStockitem((StockItem)newValue);
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
			case DpPackage.SCHUIF__DIEPVRIES:
				setDiepvries((Diepvries)null);
				return;
			case DpPackage.SCHUIF__STOCKITEM:
				setStockitem((StockItem)null);
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
			case DpPackage.SCHUIF__DIEPVRIES:
				return getDiepvries() != null;
			case DpPackage.SCHUIF__STOCKITEM:
				return stockitem != null;
		}
		return super.eIsSet(featureID);
	}

} //SchuifImpl
