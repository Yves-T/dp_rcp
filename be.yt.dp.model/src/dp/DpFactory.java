/**
 */
package dp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dp.DpPackage
 * @generated
 */
public interface DpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DpFactory eINSTANCE = dp.impl.DpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Stock Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stock Item</em>'.
	 * @generated
	 */
	StockItem createStockItem();

	/**
	 * Returns a new object of class '<em>Categorie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorie</em>'.
	 * @generated
	 */
	Categorie createCategorie();

	/**
	 * Returns a new object of class '<em>Diepvries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diepvries</em>'.
	 * @generated
	 */
	Diepvries createDiepvries();

	/**
	 * Returns a new object of class '<em>Schuif</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schuif</em>'.
	 * @generated
	 */
	Schuif createSchuif();

	/**
	 * Returns a new object of class '<em>Produkt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Produkt</em>'.
	 * @generated
	 */
	Produkt createProdukt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DpPackage getDpPackage();

} //DpFactory
