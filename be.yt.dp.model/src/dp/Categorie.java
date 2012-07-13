/**
 */
package dp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dp.Categorie#getStockitem <em>Stockitem</em>}</li>
 *   <li>{@link dp.Categorie#getProdukt <em>Produkt</em>}</li>
 *   <li>{@link dp.Categorie#getNaam <em>Naam</em>}</li>
 * </ul>
 * </p>
 *
 * @see dp.DpPackage#getCategorie()
 * @model
 * @generated
 */
public interface Categorie extends EObject {
	/**
	 * Returns the value of the '<em><b>Stockitem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dp.StockItem#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stockitem</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stockitem</em>' container reference.
	 * @see #setStockitem(StockItem)
	 * @see dp.DpPackage#getCategorie_Stockitem()
	 * @see dp.StockItem#getCategorie
	 * @model opposite="categorie" transient="false"
	 * @generated
	 */
	StockItem getStockitem();

	/**
	 * Sets the value of the '{@link dp.Categorie#getStockitem <em>Stockitem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stockitem</em>' container reference.
	 * @see #getStockitem()
	 * @generated
	 */
	void setStockitem(StockItem value);

	/**
	 * Returns the value of the '<em><b>Produkt</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dp.Produkt#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produkt</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produkt</em>' container reference.
	 * @see #setProdukt(Produkt)
	 * @see dp.DpPackage#getCategorie_Produkt()
	 * @see dp.Produkt#getCategories
	 * @model opposite="categories" transient="false"
	 * @generated
	 */
	Produkt getProdukt();

	/**
	 * Sets the value of the '{@link dp.Categorie#getProdukt <em>Produkt</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produkt</em>' container reference.
	 * @see #getProdukt()
	 * @generated
	 */
	void setProdukt(Produkt value);

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
	 * @see dp.DpPackage#getCategorie_Naam()
	 * @model
	 * @generated
	 */
	String getNaam();

	/**
	 * Sets the value of the '{@link dp.Categorie#getNaam <em>Naam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naam</em>' attribute.
	 * @see #getNaam()
	 * @generated
	 */
	void setNaam(String value);

} // Categorie
