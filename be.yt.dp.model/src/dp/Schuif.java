/**
 */
package dp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schuif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dp.Schuif#getDiepvries <em>Diepvries</em>}</li>
 *   <li>{@link dp.Schuif#getStockitem <em>Stockitem</em>}</li>
 * </ul>
 * </p>
 *
 * @see dp.DpPackage#getSchuif()
 * @model
 * @generated
 */
public interface Schuif extends EObject {
	/**
	 * Returns the value of the '<em><b>Diepvries</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dp.Diepvries#getSchuiven <em>Schuiven</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diepvries</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diepvries</em>' container reference.
	 * @see #setDiepvries(Diepvries)
	 * @see dp.DpPackage#getSchuif_Diepvries()
	 * @see dp.Diepvries#getSchuiven
	 * @model opposite="schuiven" transient="false"
	 * @generated
	 */
	Diepvries getDiepvries();

	/**
	 * Sets the value of the '{@link dp.Schuif#getDiepvries <em>Diepvries</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diepvries</em>' container reference.
	 * @see #getDiepvries()
	 * @generated
	 */
	void setDiepvries(Diepvries value);

	/**
	 * Returns the value of the '<em><b>Stockitem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dp.StockItem#getSchuif <em>Schuif</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stockitem</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stockitem</em>' container reference.
	 * @see #setStockitem(StockItem)
	 * @see dp.DpPackage#getSchuif_Stockitem()
	 * @see dp.StockItem#getSchuif
	 * @model opposite="schuif" transient="false"
	 * @generated
	 */
	StockItem getStockitem();

	/**
	 * Sets the value of the '{@link dp.Schuif#getStockitem <em>Stockitem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stockitem</em>' container reference.
	 * @see #getStockitem()
	 * @generated
	 */
	void setStockitem(StockItem value);

} // Schuif
