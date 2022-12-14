/**
 * generated by Xtext 2.14.0
 */
package org.xtext.slr.reliSRS.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.slr.reliSRS.ReliSRSPackage;
import org.xtext.slr.reliSRS.StatisticsOnExclusionCriteria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistics On Exclusion Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.slr.reliSRS.impl.StatisticsOnExclusionCriteriaImpl#getSCriteria <em>SCriteria</em>}</li>
 *   <li>{@link org.xtext.slr.reliSRS.impl.StatisticsOnExclusionCriteriaImpl#getSNombre <em>SNombre</em>}</li>
 *   <li>{@link org.xtext.slr.reliSRS.impl.StatisticsOnExclusionCriteriaImpl#getSPourcentage <em>SPourcentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticsOnExclusionCriteriaImpl extends MinimalEObjectImpl.Container implements StatisticsOnExclusionCriteria
{
  /**
   * The cached value of the '{@link #getSCriteria() <em>SCriteria</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSCriteria()
   * @generated
   * @ordered
   */
  protected EList<String> sCriteria;

  /**
   * The cached value of the '{@link #getSNombre() <em>SNombre</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSNombre()
   * @generated
   * @ordered
   */
  protected EList<String> sNombre;

  /**
   * The cached value of the '{@link #getSPourcentage() <em>SPourcentage</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSPourcentage()
   * @generated
   * @ordered
   */
  protected EList<String> sPourcentage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatisticsOnExclusionCriteriaImpl()
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
    return ReliSRSPackage.Literals.STATISTICS_ON_EXCLUSION_CRITERIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getSCriteria()
  {
    if (sCriteria == null)
    {
      sCriteria = new EDataTypeEList<String>(String.class, this, ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SCRITERIA);
    }
    return sCriteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getSNombre()
  {
    if (sNombre == null)
    {
      sNombre = new EDataTypeEList<String>(String.class, this, ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SNOMBRE);
    }
    return sNombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getSPourcentage()
  {
    if (sPourcentage == null)
    {
      sPourcentage = new EDataTypeEList<String>(String.class, this, ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SPOURCENTAGE);
    }
    return sPourcentage;
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
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SCRITERIA:
        return getSCriteria();
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SNOMBRE:
        return getSNombre();
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SPOURCENTAGE:
        return getSPourcentage();
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
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SCRITERIA:
        getSCriteria().clear();
        getSCriteria().addAll((Collection<? extends String>)newValue);
        return;
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SNOMBRE:
        getSNombre().clear();
        getSNombre().addAll((Collection<? extends String>)newValue);
        return;
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SPOURCENTAGE:
        getSPourcentage().clear();
        getSPourcentage().addAll((Collection<? extends String>)newValue);
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
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SCRITERIA:
        getSCriteria().clear();
        return;
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SNOMBRE:
        getSNombre().clear();
        return;
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SPOURCENTAGE:
        getSPourcentage().clear();
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
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SCRITERIA:
        return sCriteria != null && !sCriteria.isEmpty();
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SNOMBRE:
        return sNombre != null && !sNombre.isEmpty();
      case ReliSRSPackage.STATISTICS_ON_EXCLUSION_CRITERIA__SPOURCENTAGE:
        return sPourcentage != null && !sPourcentage.isEmpty();
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
    result.append(" (sCriteria: ");
    result.append(sCriteria);
    result.append(", sNombre: ");
    result.append(sNombre);
    result.append(", sPourcentage: ");
    result.append(sPourcentage);
    result.append(')');
    return result.toString();
  }

} //StatisticsOnExclusionCriteriaImpl
