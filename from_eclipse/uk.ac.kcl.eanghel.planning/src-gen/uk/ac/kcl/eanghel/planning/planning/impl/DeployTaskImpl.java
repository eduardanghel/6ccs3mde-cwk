/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.eanghel.planning.planning.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.eanghel.planning.planning.DeployTask;
import uk.ac.kcl.eanghel.planning.planning.PlanningPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.eanghel.planning.planning.impl.DeployTaskImpl#getDeploy <em>Deploy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployTaskImpl extends TaskTypeImpl implements DeployTask
{
  /**
   * The default value of the '{@link #getDeploy() <em>Deploy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeploy()
   * @generated
   * @ordered
   */
  protected static final String DEPLOY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeploy() <em>Deploy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeploy()
   * @generated
   * @ordered
   */
  protected String deploy = DEPLOY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeployTaskImpl()
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
    return PlanningPackage.Literals.DEPLOY_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDeploy()
  {
    return deploy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeploy(String newDeploy)
  {
    String oldDeploy = deploy;
    deploy = newDeploy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanningPackage.DEPLOY_TASK__DEPLOY, oldDeploy, deploy));
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
      case PlanningPackage.DEPLOY_TASK__DEPLOY:
        return getDeploy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlanningPackage.DEPLOY_TASK__DEPLOY:
        setDeploy((String)newValue);
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
      case PlanningPackage.DEPLOY_TASK__DEPLOY:
        setDeploy(DEPLOY_EDEFAULT);
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
      case PlanningPackage.DEPLOY_TASK__DEPLOY:
        return DEPLOY_EDEFAULT == null ? deploy != null : !DEPLOY_EDEFAULT.equals(deploy);
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
    result.append(" (deploy: ");
    result.append(deploy);
    result.append(')');
    return result.toString();
  }

} //DeployTaskImpl
