/**
 * generated by Xtext 2.14.0
 */
package org.xtext.slr.reliSRS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.slr.reliSRS.Result#getRTotal <em>RTotal</em>}</li>
 *   <li>{@link org.xtext.slr.reliSRS.Result#getRDecision <em>RDecision</em>}</li>
 *   <li>{@link org.xtext.slr.reliSRS.Result#getRPaper <em>RPaper</em>}</li>
 *   <li>{@link org.xtext.slr.reliSRS.Result#getRPourcentage <em>RPourcentage</em>}</li>
 * </ul>
 *
 * @see org.xtext.slr.reliSRS.ReliSRSPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject
{
  /**
   * Returns the value of the '<em><b>RTotal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RTotal</em>' attribute.
   * @see #setRTotal(String)
   * @see org.xtext.slr.reliSRS.ReliSRSPackage#getResult_RTotal()
   * @model
   * @generated
   */
  String getRTotal();

  /**
   * Sets the value of the '{@link org.xtext.slr.reliSRS.Result#getRTotal <em>RTotal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RTotal</em>' attribute.
   * @see #getRTotal()
   * @generated
   */
  void setRTotal(String value);

  /**
   * Returns the value of the '<em><b>RDecision</b></em>' attribute list.
   * The list contents are of type {@link org.xtext.slr.reliSRS.RDecision}.
   * The literals are from the enumeration {@link org.xtext.slr.reliSRS.RDecision}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RDecision</em>' attribute list.
   * @see org.xtext.slr.reliSRS.RDecision
   * @see org.xtext.slr.reliSRS.ReliSRSPackage#getResult_RDecision()
   * @model unique="false"
   * @generated
   */
  EList<RDecision> getRDecision();

  /**
   * Returns the value of the '<em><b>RPaper</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RPaper</em>' attribute list.
   * @see org.xtext.slr.reliSRS.ReliSRSPackage#getResult_RPaper()
   * @model unique="false"
   * @generated
   */
  EList<String> getRPaper();

  /**
   * Returns the value of the '<em><b>RPourcentage</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>RPourcentage</em>' attribute list.
   * @see org.xtext.slr.reliSRS.ReliSRSPackage#getResult_RPourcentage()
   * @model unique="false"
   * @generated
   */
  EList<String> getRPourcentage();

} // Result