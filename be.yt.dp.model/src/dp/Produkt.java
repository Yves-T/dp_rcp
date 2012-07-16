/**
 */
package dp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Produkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dp.Produkt#getCategories <em>Categories</em>}</li>
 *   <li>{@link dp.Produkt#getStockitem <em>Stockitem</em>}</li>
 *   <li>{@link dp.Produkt#getNaam <em>Naam</em>}</li>
 * </ul>
 * </p>
 *
 * @see dp.DpPackage#getProdukt()
 * @model
 * @generated
 */
public interface Produkt extends EObject {
	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dp.Categorie#getProdukten <em>Produkten</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference.
	 * @see #setCategories(Categorie)
	 * @see dp.DpPackage#getProdukt_Categories()
	 * @see dp.Categorie#getProdukten
	 * @model opposite="produkten" required="true"
	 * @generated
	 */
	Categorie getCategories();

	/**
	 * Sets the value of the '{@link dp.Produkt#getCategories <em>Categories</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' reference.
	 * @see #getCategories()
	 * @generated
	 */
	void setCategories(Categorie value);

	/**
	 * Returns the value of the '<em><b>Stockitem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dp.StockItem#getProdukten <em>Produkten</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stockitem</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stockitem</em>' container reference.
	 * @see #setStockitem(StockItem)
	 * @see dp.DpPackage#getProdukt_Stockitem()
	 * @see dp.StockItem#getProdukten
	 * @model opposite="produkten" transient="false"
	 * @generated
	 */
	StockItem getStockitem();

	/**
	 * Sets the value of the '{@link dp.Produkt#getStockitem <em>Stockitem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stockitem</em>' container reference.
	 * @see #getStockitem()
	 * @generated
	 */
	void setStockitem(StockItem value);

	/**
	 * Returns the value of the '<em><b>Naam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Naam</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Naam</em>' attribute.
	 * @see #setNaam(String)
	 * @see dp.DpPackage#getProdukt_Naam()
	 * @model
	 * @generated
	 */
	String getNaam();

	/**
	 * Sets the value of the '{@link dp.Produkt#getNaam <em>Naam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naam</em>' attribute.
	 * @see #getNaam()
	 * @generated
	 */
	void setNaam(String value);

} // Produkt
