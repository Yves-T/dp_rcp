/**
 */
package dp.impl;

import dp.Categorie;
import dp.Diepvries;
import dp.DpFactory;
import dp.DpPackage;
import dp.Produkt;
import dp.Schuif;
import dp.StockItem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DpPackageImpl extends EPackageImpl implements DpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diepvriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schuifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass produktEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dp.DpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DpPackageImpl() {
		super(eNS_URI, DpFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DpPackage init() {
		if (isInited) return (DpPackage)EPackage.Registry.INSTANCE.getEPackage(DpPackage.eNS_URI);

		// Obtain or create and register package
		DpPackageImpl theDpPackage = (DpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DpPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDpPackage.createPackageContents();

		// Initialize created meta-data
		theDpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DpPackage.eNS_URI, theDpPackage);
		return theDpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockItem() {
		return stockItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockItem_Categorie() {
		return (EReference)stockItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockItem_Produkten() {
		return (EReference)stockItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockItem_Schuif() {
		return (EReference)stockItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_Aantal() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_Datum() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockItem_Info() {
		return (EAttribute)stockItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorie() {
		return categorieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorie_Stockitem() {
		return (EReference)categorieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorie_Produkten() {
		return (EReference)categorieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategorie_Naam() {
		return (EAttribute)categorieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiepvries() {
		return diepvriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiepvries_Schuiven() {
		return (EReference)diepvriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiepvries_Naam() {
		return (EAttribute)diepvriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchuif() {
		return schuifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchuif_Diepvries() {
		return (EReference)schuifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchuif_Stockitem() {
		return (EReference)schuifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProdukt() {
		return produktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProdukt_Categories() {
		return (EReference)produktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProdukt_Stockitem() {
		return (EReference)produktEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProdukt_Naam() {
		return (EAttribute)produktEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProdukt_Category() {
		return (EReference)produktEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpFactory getDpFactory() {
		return (DpFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stockItemEClass = createEClass(STOCK_ITEM);
		createEReference(stockItemEClass, STOCK_ITEM__CATEGORIE);
		createEReference(stockItemEClass, STOCK_ITEM__PRODUKTEN);
		createEReference(stockItemEClass, STOCK_ITEM__SCHUIF);
		createEAttribute(stockItemEClass, STOCK_ITEM__AANTAL);
		createEAttribute(stockItemEClass, STOCK_ITEM__DATUM);
		createEAttribute(stockItemEClass, STOCK_ITEM__INFO);

		categorieEClass = createEClass(CATEGORIE);
		createEReference(categorieEClass, CATEGORIE__STOCKITEM);
		createEAttribute(categorieEClass, CATEGORIE__NAAM);
		createEReference(categorieEClass, CATEGORIE__PRODUKTEN);

		diepvriesEClass = createEClass(DIEPVRIES);
		createEReference(diepvriesEClass, DIEPVRIES__SCHUIVEN);
		createEAttribute(diepvriesEClass, DIEPVRIES__NAAM);

		schuifEClass = createEClass(SCHUIF);
		createEReference(schuifEClass, SCHUIF__DIEPVRIES);
		createEReference(schuifEClass, SCHUIF__STOCKITEM);

		produktEClass = createEClass(PRODUKT);
		createEReference(produktEClass, PRODUKT__CATEGORIES);
		createEReference(produktEClass, PRODUKT__STOCKITEM);
		createEAttribute(produktEClass, PRODUKT__NAAM);
		createEReference(produktEClass, PRODUKT__CATEGORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(stockItemEClass, StockItem.class, "StockItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStockItem_Categorie(), this.getCategorie(), this.getCategorie_Stockitem(), "categorie", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockItem_Produkten(), this.getProdukt(), this.getProdukt_Stockitem(), "produkten", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStockItem_Schuif(), this.getSchuif(), this.getSchuif_Stockitem(), "schuif", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_Aantal(), ecorePackage.getEIntegerObject(), "aantal", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_Datum(), ecorePackage.getEDate(), "datum", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStockItem_Info(), ecorePackage.getEString(), "info", null, 0, 1, StockItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorieEClass, Categorie.class, "Categorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorie_Stockitem(), this.getStockItem(), this.getStockItem_Categorie(), "stockitem", null, 0, 1, Categorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategorie_Naam(), ecorePackage.getEString(), "naam", null, 0, 1, Categorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategorie_Produkten(), this.getProdukt(), this.getProdukt_Category(), "produkten", null, 0, -1, Categorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diepvriesEClass, Diepvries.class, "Diepvries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiepvries_Schuiven(), this.getSchuif(), this.getSchuif_Diepvries(), "schuiven", null, 0, -1, Diepvries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiepvries_Naam(), ecorePackage.getEString(), "naam", null, 0, 1, Diepvries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schuifEClass, Schuif.class, "Schuif", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchuif_Diepvries(), this.getDiepvries(), this.getDiepvries_Schuiven(), "diepvries", null, 0, 1, Schuif.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchuif_Stockitem(), this.getStockItem(), this.getStockItem_Schuif(), "stockitem", null, 0, 1, Schuif.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(produktEClass, Produkt.class, "Produkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProdukt_Categories(), this.getCategorie(), null, "categories", null, 1, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdukt_Stockitem(), this.getStockItem(), this.getStockItem_Produkten(), "stockitem", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProdukt_Naam(), ecorePackage.getEString(), "naam", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdukt_Category(), this.getCategorie(), this.getCategorie_Produkten(), "category", null, 0, 1, Produkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DpPackageImpl
