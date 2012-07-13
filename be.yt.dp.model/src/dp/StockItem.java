/**
 */
package dp;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stock Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dp.StockItem#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link dp.StockItem#getProdukten <em>Produkten</em>}</li>
 *   <li>{@link dp.StockItem#getSchuif <em>Schuif</em>}</li>
 *   <li>{@link dp.StockItem#getAantal <em>Aantal</em>}</li>
 *   <li>{@link dp.StockItem#getDatum <em>Datum</em>}</li>
 *   <li>{@link dp.StockItem#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see dp.DpPackage#getStockItem()
 * @model
 * @generated
 */
public interface StockItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link dp.Categorie#getStockitem <em>Stockitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' containment reference.
	 * @see #setCategorie(Categorie)
	 * @see dp.DpPackage#getStockItem_Categorie()
	 * @see dp.Categorie#getStockitem
	 * @model opposite="stockitem" containment="true"
	 * @generated
	 */
	Categorie getCategorie();

	/**
	 * Sets the value of the '{@link dp.StockItem#getCategorie <em>Categorie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' containment reference.
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(Categorie value);

	/**
	 * Returns the value of the '<em><b>Produkten</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link dp.Produkt#getStockitem <em>Stockitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produkten</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produkten</em>' containment reference.
	 * @see #setProdukten(Produkt)
	 * @see dp.DpPackage#getStockItem_Produkten()
	 * @see dp.Produkt#getStockitem
	 * @model opposite="stockitem" containment="true"
	 * @generated
	 */
	Produkt getProdukten();

	/**
	 * Sets the value of the '{@link dp.StockItem#getProdukten <em>Produkten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produkten</em>' containment reference.
	 * @see #getProdukten()
	 * @generated
	 */
	void setProdukten(Produkt value);

	/**
	 * Returns the value of the '<em><b>Schuif</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link dp.Schuif#getStockitem <em>Stockitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schuif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schuif</em>' containment reference.
	 * @see #setSchuif(Schuif)
	 * @see dp.DpPackage#getStockItem_Schuif()
	 * @see dp.Schuif#getStockitem
	 * @model opposite="stockitem" containment="true"
	 * @generated
	 */
	Schuif getSchuif();

	/**
	 * Sets the value of the '{@link dp.StockItem#getSchuif <em>Schuif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schuif</em>' containment reference.
	 * @see #getSchuif()
	 * @generated
	 */
	void setSchuif(Schuif value);

	/**
	 * Returns the value of the '<em><b>Aantal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aantal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aantal</em>' attribute.
	 * @see #setAantal(Integer)
	 * @see dp.DpPackage#getStockItem_Aantal()
	 * @model
	 * @generated
	 */
	Integer getAantal();

	/**
	 * Sets the value of the '{@link dp.StockItem#getAantal <em>Aantal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aantal</em>' attribute.
	 * @see #getAantal()
	 * @generated
	 */
	void setAantal(Integer value);

	/**
	 * Returns the value of the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datum</em>' attribute.
	 * @see #setDatum(Date)
	 * @see dp.DpPackage#getStockItem_Datum()
	 * @model
	 * @generated
	 */
	Date getDatum();

	/**
	 * Sets the value of the '{@link dp.StockItem#getDatum <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum</em>' attribute.
	 * @see #getDatum()
	 * @generated
	 */
	void setDatum(Date value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' attribute.
	 * @see #setInfo(String)
	 * @see dp.DpPackage#getStockItem_Info()
	 * @model
	 * @generated
	 */
	String getInfo();

	/**
	 * Sets the value of the '{@link dp.StockItem#getInfo <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' attribute.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(String value);

} // StockItem
