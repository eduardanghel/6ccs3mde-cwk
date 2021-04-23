/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.eanghel.planning.planning.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.eanghel.planning.planning.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.eanghel.planning.planning.PlanningPackage
 * @generated
 */
public class PlanningSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PlanningPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanningSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PlanningPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PlanningPackage.TASK_PLANNING:
      {
        TaskPlanning taskPlanning = (TaskPlanning)theEObject;
        T result = caseTaskPlanning(taskPlanning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.OWNER:
      {
        Owner owner = (Owner)theEObject;
        T result = caseOwner(owner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.PROJECT:
      {
        Project project = (Project)theEObject;
        T result = caseProject(project);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.TASKS:
      {
        Tasks tasks = (Tasks)theEObject;
        T result = caseTasks(tasks);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.POINTS:
      {
        Points points = (Points)theEObject;
        T result = casePoints(points);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.TASK_TYPE:
      {
        TaskType taskType = (TaskType)theEObject;
        T result = caseTaskType(taskType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.FEATURE_TASK:
      {
        FeatureTask featureTask = (FeatureTask)theEObject;
        T result = caseFeatureTask(featureTask);
        if (result == null) result = caseTaskType(featureTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.BUG_TASK:
      {
        BugTask bugTask = (BugTask)theEObject;
        T result = caseBugTask(bugTask);
        if (result == null) result = caseTaskType(bugTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.ANALYSE_TASK:
      {
        AnalyseTask analyseTask = (AnalyseTask)theEObject;
        T result = caseAnalyseTask(analyseTask);
        if (result == null) result = caseTaskType(analyseTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.TEST_TASK:
      {
        TestTask testTask = (TestTask)theEObject;
        T result = caseTestTask(testTask);
        if (result == null) result = caseTaskType(testTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.DOCUMENT_TASK:
      {
        DocumentTask documentTask = (DocumentTask)theEObject;
        T result = caseDocumentTask(documentTask);
        if (result == null) result = caseTaskType(documentTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PlanningPackage.DEPLOY_TASK:
      {
        DeployTask deployTask = (DeployTask)theEObject;
        T result = caseDeployTask(deployTask);
        if (result == null) result = caseTaskType(deployTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Planning</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Planning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskPlanning(TaskPlanning object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Owner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Owner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOwner(Owner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProject(Project object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tasks</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tasks</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTasks(Tasks object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Points</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Points</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoints(Points object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskType(TaskType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureTask(FeatureTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bug Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bug Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBugTask(BugTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Analyse Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Analyse Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnalyseTask(AnalyseTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestTask(TestTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentTask(DocumentTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployTask(DeployTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PlanningSwitch
