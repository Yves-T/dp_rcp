/**
 */
package dp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dp.DpFactory
 * @model kind="package"
 * @generated
 */
public interface DpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dp/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DpPackage eINSTANCE = dp.impl.DpPackageImpl.init();

	/**
	 * The meta object id for the '{@link dp.impl.StockItemImpl <em>Stock Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dp.impl.StockItemImpl
	 * @see dp.impl.DpPackageImpl#getStockItem()
	 * @generated
	 */
	int STOCK_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__CATEGORIE = 0;

	/**
	 * The feature id for the '<em><b>Produkten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__PRODUKTEN = 1;

	/**
	 * The feature id for the '<em><b>Schuif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__SCHUIF = 2;

	/**
	 * The feature id for the '<em><b>Aantal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__AANTAL = 3;

	/**
	 * The feature id for the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__DATUM = 4;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM__INFO = 5;

	/**
	 * The number of structural features of the '<em>Stock Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_ITEM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link dp.impl.CategorieImpl <em>Categorie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dp.impl.CategorieImpl
	 * @see dp.impl.DpPackageImpl#getCategorie()
	 * @generated
	 */
	int CATEGORIE = 1;

	/**
	 * The feature id for the '<em><b>Stockitem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE__STOCKITEM = 0;

	/**
	 * The feature id for the '<em><b>Naam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE__NAAM = 1;

	/**
	 * The feature id for the '<em><b>Produkten</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE__PRODUKTEN = 2;

	/**
	 * The number of structural features of the '<em>Categorie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dp.impl.DiepvriesImpl <em>Diepvries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dp.impl.DiepvriesImpl
	 * @see dp.impl.DpPackageImpl#getDiepvries()
	 * @generated
	 */
	int DIEPVRIES = 2;

	/**
	 * The feature id for the '<em><b>Schuiven</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIEPVRIES__SCHUIVEN = 0;

	/**
	 * The feature id for the '<em><b>Naam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIEPVRIES__NAAM = 1;

	/**
	 * The number of structural features of the '<em>Diepvries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIEPVRIES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dp.impl.SchuifImpl <em>Schuif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dp.impl.SchuifImpl
	 * @see dp.impl.DpPackageImpl#getSchuif()
	 * @generated
	 */
	int SCHUIF = 3;

	/**
	 * The feature id for the '<em><b>Diepvries</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUIF__DIEPVRIES = 0;

	/**
	 * The feature id for the '<em><b>Stockitem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUIF__STOCKITEM = 1;

	/**
	 * The number of structural features of the '<em>Schuif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUIF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dp.impl.ProduktImpl <em>Produkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dp.impl.ProduktImpl
	 * @see dp.impl.DpPackageImpl#getProdukt()
	 * @generated
	 */
	int PRODUKT = 4;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUKT__CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Stockitem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUKT__STOCKITEM = 1;

	/**
	 * The feature id for the '<em><b>Naam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUKT__NAAM = 2;

	/**
	 * The number of structural features of the '<em>Produkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUKT_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link dp.StockItem <em>Stock Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Item</em>'.
	 * @see dp.StockItem
	 * @generated
	 */
	EClass getStockItem();

	/**
	 * Returns the meta object for the containment reference '{@link dp.StockItem#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categorie</em>'.
	 * @see dp.StockItem#getCategorie()
	 * @see #getStockItem()
	 * @generated
	 */
	EReference getStockItem_Categorie();

	/**
	 * Returns the meta object for the containment reference '{@link dp.StockItem#getProdukten <em>Produkten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Produkten</em>'.
	 * @see dp.StockItem#getProdukten()
	 * @see #getStockItem()
	 * @generated
	 */
	EReference getStockItem_Produkten();

	/**
	 * Returns the meta object for the containment reference '{@link dp.StockItem#getSchuif <em>Schuif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schuif</em>'.
	 * @see dp.StockItem#getSchuif()
	 * @see #getStockItem()
	 * @generated
	 */
	EReference getStockItem_Schuif();

	/**
	 * Returns the meta object for the attribute '{@link dp.StockItem#getAantal <em>Aantal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aantal</em>'.
	 * @see dp.StockItem#getAantal()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_Aantal();

	/**
	 * Returns the meta object for the attribute '{@link dp.StockItem#getDatum <em>Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datum</em>'.
	 * @see dp.StockItem#getDatum()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_Datum();

	/**
	 * Returns the meta object for the attribute '{@link dp.StockItem#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see dp.StockItem#getInfo()
	 * @see #getStockItem()
	 * @generated
	 */
	EAttribute getStockItem_Info();

	/**
	 * Returns the meta object for class '{@link dp.Categorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorie</em>'.
	 * @see dp.Categorie
	 * @generated
	 */
	EClass getCategorie();

	/**
	 * Returns the meta object for the container reference '{@link dp.Categorie#getStockitem <em>Stockitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stockitem</em>'.
	 * @see dp.Categorie#getStockitem()
	 * @see #getCategorie()
	 * @generated
	 */
	EReference getCategorie_Stockitem();

	/**
	 * Returns the meta object for the reference list '{@link dp.Categorie#getProdukten <em>Produkten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produkten</em>'.
	 * @see dp.Categorie#getProdukten()
	 * @see #getCategorie()
	 * @generated
	 */
	EReference getCategorie_Produkten();

	/**
	 * Returns the meta object for the attribute '{@link dp.Categorie#getNaam <em>Naam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Naam</em>'.
	 * @see dp.Categorie#getNaam()
	 * @see #getCategorie()
	 * @generated
	 */
	EAttribute getCategorie_Naam();

	/**
	 * Returns the meta object for class '{@link dp.Diepvries <em>Diepvries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diepvries</em>'.
	 * @see dp.Diepvries
	 * @generated
	 */
	EClass getDiepvries();

	/**
	 * Returns the meta object for the containment reference list '{@link dp.Diepvries#getSchuiven <em>Schuiven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schuiven</em>'.
	 * @see dp.Diepvries#getSchuiven()
	 * @see #getDiepvries()
	 * @generated
	 */
	EReference getDiepvries_Schuiven();

	/**
	 * Returns the meta object for the attribute '{@link dp.Diepvries#getNaam <em>Naam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Naam</em>'.
	 * @see dp.Diepvries#getNaam()
	 * @see #getDiepvries()
	 * @generated
	 */
	EAttribute getDiepvries_Naam();

	/**
	 * Returns the meta object for class '{@link dp.Schuif <em>Schuif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schuif</em>'.
	 * @see dp.Schuif
	 * @generated
	 */
	EClass getSchuif();

	/**
	 * Returns the meta object for the container reference '{@link dp.Schuif#getDiepvries <em>Diepvries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diepvries</em>'.
	 * @see dp.Schuif#getDiepvries()
	 * @see #getSchuif()
	 * @generated
	 */
	EReference getSchuif_Diepvries();

	/**
	 * Returns the meta object for the container reference '{@link dp.Schuif#getStockitem <em>Stockitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stockitem</em>'.
	 * @see dp.Schuif#getStockitem()
	 * @see #getSchuif()
	 * @generated
	 */
	EReference getSchuif_Stockitem();

	/**
	 * Returns the meta object for class '{@link dp.Produkt <em>Produkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produkt</em>'.
	 * @see dp.Produkt
	 * @generated
	 */
	EClass getProdukt();

	/**
	 * Returns the meta object for the reference '{@link dp.Produkt#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categories</em>'.
	 * @see dp.Produkt#getCategories()
	 * @see #getProdukt()
	 * @generated
	 */
	EReference getProdukt_Categories();

	/**
	 * Returns the meta object for the container reference '{@link dp.Produkt#getStockitem <em>Stockitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stockitem</em>'.
	 * @see dp.Produkt#getStockitem()
	 * @see #getProdukt()
	 * @generated
	 */
	EReference getProdukt_Stockitem();

	/**
	 * Returns the meta object for the attribute '{@link dp.Produkt#getNaam <em>Naam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Naam</em>'.
	 * @see dp.Produkt#getNaam()
	 * @see #getProdukt()
	 * @generated
	 */
	EAttribute getProdukt_Naam();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DpFactory getDpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dp.impl.StockItemImpl <em>Stock Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dp.impl.StockItemImpl
		 * @see dp.impl.DpPackageImpl#getStockItem()
		 * @generated
		 */
		EClass STOCK_ITEM = eINSTANCE.getStockItem();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_ITEM__CATEGORIE = eINSTANCE.getStockItem_Categorie();

		/**
		 * The meta object literal for the '<em><b>Produkten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_ITEM__PRODUKTEN = eINSTANCE.getStockItem_Produkten();

		/**
		 * The meta object literal for the '<em><b>Schuif</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK_ITEM__SCHUIF = eINSTANCE.getStockItem_Schuif();

		/**
		 * The meta object literal for the '<em><b>Aantal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__AANTAL = eINSTANCE.getStockItem_Aantal();

		/**
		 * The meta object literal for the '<em><b>Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__DATUM = eINSTANCE.getStockItem_Datum();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK_ITEM__INFO = eINSTANCE.getStockItem_Info();

		/**
		 * The meta object literal for the '{@link dp.impl.CategorieImpl <em>Categorie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dp.impl.CategorieImpl
		 * @see dp.impl.DpPackageImpl#getCategorie()
		 * @generated
		 */
		EClass CATEGORIE = eINSTANCE.getCategorie();

		/**
		 * The meta object literal for the '<em><b>Stockitem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIE__STOCKITEM = eINSTANCE.getCategorie_Stockitem();

		/**
		 * The meta object literal for the '<em><b>Produkten</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIE__PRODUKTEN = eINSTANCE.getCategorie_Produkten();

		/**
		 * The meta object literal for the '<em><b>Naam</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIE__NAAM = eINSTANCE.getCategorie_Naam();

		/**
		 * The meta object literal for the '{@link dp.impl.DiepvriesImpl <em>Diepvries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dp.impl.DiepvriesImpl
		 * @see dp.impl.DpPackageImpl#getDiepvries()
		 * @generated
		 */
		EClass DIEPVRIES = eINSTANCE.getDiepvries();

		/**
		 * The meta object literal for the '<em><b>Schuiven</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIEPVRIES__SCHUIVEN = eINSTANCE.getDiepvries_Schuiven();

		/**
		 * The meta object literal for the '<em><b>Naam</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIEPVRIES__NAAM = eINSTANCE.getDiepvries_Naam();

		/**
		 * The meta object literal for the '{@link dp.impl.SchuifImpl <em>Schuif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dp.impl.SchuifImpl
		 * @see dp.impl.DpPackageImpl#getSchuif()
		 * @generated
		 */
		EClass SCHUIF = eINSTANCE.getSchuif();

		/**
		 * The meta object literal for the '<em><b>Diepvries</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHUIF__DIEPVRIES = eINSTANCE.getSchuif_Diepvries();

		/**
		 * The meta object literal for the '<em><b>Stockitem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHUIF__STOCKITEM = eINSTANCE.getSchuif_Stockitem();

		/**
		 * The meta object literal for the '{@link dp.impl.ProduktImpl <em>Produkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dp.impl.ProduktImpl
		 * @see dp.impl.DpPackageImpl#getProdukt()
		 * @generated
		 */
		EClass PRODUKT = eINSTANCE.getProdukt();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUKT__CATEGORIES = eINSTANCE.getProdukt_Categories();

		/**
		 * The meta object literal for the '<em><b>Stockitem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUKT__STOCKITEM = eINSTANCE.getProdukt_Stockitem();

		/**
		 * The meta object literal for the '<em><b>Naam</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUKT__NAAM = eINSTANCE.getProdukt_Naam();

	}

} //DpPackage
