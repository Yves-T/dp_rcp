/**
 */
package dp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diepvries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dp.Diepvries#getSchuiven <em>Schuiven</em>}</li>
 *   <li>{@link dp.Diepvries#getNaam <em>Naam</em>}</li>
 * </ul>
 * </p>
 *
 * @see dp.DpPackage#getDiepvries()
 * @model
 * @generated
 */
public interface Diepvries extends EObject {
	/**
	 * Returns the value of the '<em><b>Schuiven</b></em>' containment reference list.
	 * The list contents are of type {@link dp.Schuif}.
	 * It is bidirectional and its opposite is '{@link dp.Schuif#getDiepvries <em>Diepvries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schuiven</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schuiven</em>' containment reference list.
	 * @see dp.DpPackage#getDiepvries_Schuiven()
	 * @see dp.Schuif#getDiepvries
	 * @model opposite="diepvries" containment="true"
	 * @generated
	 */
	EList<Schuif> getSchuiven();

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
	 * @see dp.DpPackage#getDiepvries_Naam()
	 * @model
	 * @generated
	 */
	String getNaam();

	/**
	 * Sets the value of the '{@link dp.Diepvries#getNaam <em>Naam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naam</em>' attribute.
	 * @see #getNaam()
	 * @generated
	 */
	void setNaam(String value);

} // Diepvries
