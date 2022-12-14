/**
 * generated by Xtext 2.14.0
 */
package org.xtext.slr.reliSRS.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.slr.reliSRS.Classification;
import org.xtext.slr.reliSRS.ReliSRSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.slr.reliSRS.impl.ClassificationImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.xtext.slr.reliSRS.impl.ClassificationImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.xtext.slr.reliSRS.impl.ClassificationImpl#getResultat <em>Resultat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassificationImpl extends MinimalEObjectImpl.Container implements Classification
{
  /**
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected EList<String> question;

  /**
   * The cached value of the '{@link #getResponse() <em>Response</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected EList<String> response;

  /**
   * The cached value of the '{@link #getResultat() <em>Resultat</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultat()
   * @generated
   * @ordered
   */
  protected EList<String> resultat;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassificationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ReliSRSPackage.Literals.CLASSIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getQuestion()
  {
    if (question == null)
    {
      question = new EDataTypeEList<String>(String.class, this, ReliSRSPackage.CLASSIFICATION__QUESTION);
    }
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getResponse()
  {
    if (response == null)
    {
      response = new EDataTypeEList<String>(String.class, this, ReliSRSPackage.CLASSIFICATION__RESPONSE);
    }
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getResultat()
  {
    if (resultat == null)
    {
      resultat = new EDataTypeEList<String>(String.class, this, ReliSRSPackage.CLASSIFICATION__RESULTAT);
    }
    return resultat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ReliSRSPackage.CLASSIFICATION__QUESTION:
        return getQuestion();
      case ReliSRSPackage.CLASSIFICATION__RESPONSE:
        return getResponse();
      case ReliSRSPackage.CLASSIFICATION__RESULTAT:
        return getResultat();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReliSRSPackage.CLASSIFICATION__QUESTION:
        getQuestion().clear();
        getQuestion().addAll((Collection<? extends String>)newValue);
        return;
      case ReliSRSPackage.CLASSIFICATION__RESPONSE:
        getResponse().clear();
        getResponse().addAll((Collection<? extends String>)newValue);
        return;
      case ReliSRSPackage.CLASSIFICATION__RESULTAT:
        getResultat().clear();
        getResultat().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ReliSRSPackage.CLASSIFICATION__QUESTION:
        getQuestion().clear();
        return;
      case ReliSRSPackage.CLASSIFICATION__RESPONSE:
        getResponse().clear();
        return;
      case ReliSRSPackage.CLASSIFICATION__RESULTAT:
        getResultat().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ReliSRSPackage.CLASSIFICATION__QUESTION:
        return question != null && !question.isEmpty();
      case ReliSRSPackage.CLASSIFICATION__RESPONSE:
        return response != null && !response.isEmpty();
      case ReliSRSPackage.CLASSIFICATION__RESULTAT:
        return resultat != null && !resultat.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (question: ");
    result.append(question);
    result.append(", response: ");
    result.append(response);
    result.append(", resultat: ");
    result.append(resultat);
    result.append(')');
    return result.toString();
  }

} //ClassificationImpl
