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
 *   <li>{@link dp.StockItem#getProdukt <em>Produkt</em>}</li>
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
	 * Returns the value of the '<em><b>Categorie</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dp.Categorie#getStockitems <em>Stockitems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' container reference.
	 * @see #setCategorie(Categorie)
	 * @see dp.DpPackage#getStockItem_Categorie()
	 * @see dp.Categorie#getStockitems
	 * @model opposite="stockitems" transient="false"
	 * @generated
	 */
	Categorie getCategorie();

	/**
	 * Sets the value of the '{@link dp.StockItem#getCategorie <em>Categorie</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' container reference.
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(Categorie value);

	/**
	 * Returns the value of the '<em><b>Produkt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dp.Produkt#getStockitems <em>Stockitems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produkt</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produkt</em>' reference.
	 * @see #setProdukt(Produkt)
	 * @see dp.DpPackage#getStockItem_Produkt()
	 * @see dp.Produkt#getStockitems
	 * @model opposite="stockitems"
	 * @generated
	 */
	Produkt getProdukt();

	/**
	 * Sets the value of the '{@link dp.StockItem#getProdukt <em>Produkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produkt</em>' reference.
	 * @see #getProdukt()
	 * @generated
	 */
	void setProdukt(Produkt value);

	/**
	 * Returns the value of the '<em><b>Schuif</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dp.Schuif#getStockitem <em>Stockitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schuif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schuif</em>' container reference.
	 * @see #setSchuif(Schuif)
	 * @see dp.DpPackage#getStockItem_Schuif()
	 * @see dp.Schuif#getStockitem
	 * @model opposite="stockitem" transient="false"
	 * @generated
	 */
	Schuif getSchuif();

	/**
	 * Sets the value of the '{@link dp.StockItem#getSchuif <em>Schuif</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schuif</em>' container reference.
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
