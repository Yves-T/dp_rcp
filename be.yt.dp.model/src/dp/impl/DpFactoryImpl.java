/**
 */
package dp.impl;

import dp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DpFactoryImpl extends EFactoryImpl implements DpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DpFactory init() {
		try {
			DpFactory theDpFactory = (DpFactory)EPackage.Registry.INSTANCE.getEFactory("http://dp/1.0"); 
			if (theDpFactory != null) {
				return theDpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DpPackage.STOCK_ITEM: return createStockItem();
			case DpPackage.CATEGORIE: return createCategorie();
			case DpPackage.DIEPVRIES: return createDiepvries();
			case DpPackage.SCHUIF: return createSchuif();
			case DpPackage.PRODUKT: return createProdukt();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockItem createStockItem() {
		StockItemImpl stockItem = new StockItemImpl();
		return stockItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie createCategorie() {
		CategorieImpl categorie = new CategorieImpl();
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diepvries createDiepvries() {
		DiepvriesImpl diepvries = new DiepvriesImpl();
		return diepvries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schuif createSchuif() {
		SchuifImpl schuif = new SchuifImpl();
		return schuif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produkt createProdukt() {
		ProduktImpl produkt = new ProduktImpl();
		return produkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpPackage getDpPackage() {
		return (DpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DpPackage getPackage() {
		return DpPackage.eINSTANCE;
	}

} //DpFactoryImpl
