/**
 */
package dp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dp.Categorie#getStockitems <em>Stockitems</em>}</li>
 *   <li>{@link dp.Categorie#getNaam <em>Naam</em>}</li>
 *   <li>{@link dp.Categorie#getProdukten <em>Produkten</em>}</li>
 * </ul>
 * </p>
 *
 * @see dp.DpPackage#getCategorie()
 * @model
 * @generated
 */
public interface Categorie extends EObject {
	/**
	 * Returns the value of the '<em><b>Stockitems</b></em>' containment reference list.
	 * The list contents are of type {@link dp.StockItem}.
	 * It is bidirectional and its opposite is '{@link dp.StockItem#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stockitems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stockitems</em>' containment reference list.
	 * @see dp.DpPackage#getCategorie_Stockitems()
	 * @see dp.StockItem#getCategorie
	 * @model opposite="categorie" containment="true"
	 * @generated
	 */
	EList<StockItem> getStockitems();

	/**
	 * Returns the value of the '<em><b>Produkten</b></em>' containment reference list.
	 * The list contents are of type {@link dp.Produkt}.
	 * It is bidirectional and its opposite is '{@link dp.Produkt#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produkten</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produkten</em>' containment reference list.
	 * @see dp.DpPackage#getCategorie_Produkten()
	 * @see dp.Produkt#getCategories
	 * @model opposite="categories" containment="true"
	 * @generated
	 */
	EList<Produkt> getProdukten();

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
