/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.eanghel.planning.planning;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.eanghel.planning.planning.PlanningPackage
 * @generated
 */
public interface PlanningFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlanningFactory eINSTANCE = uk.ac.kcl.eanghel.planning.planning.impl.PlanningFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Task Planning</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Planning</em>'.
   * @generated
   */
  TaskPlanning createTaskPlanning();

  /**
   * Returns a new object of class '<em>Owner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Owner</em>'.
   * @generated
   */
  Owner createOwner();

  /**
   * Returns a new object of class '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  Project createProject();

  /**
   * Returns a new object of class '<em>Tasks</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tasks</em>'.
   * @generated
   */
  Tasks createTasks();

  /**
   * Returns a new object of class '<em>Points</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Points</em>'.
   * @generated
   */
  Points createPoints();

  /**
   * Returns a new object of class '<em>Task Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Type</em>'.
   * @generated
   */
  TaskType createTaskType();

  /**
   * Returns a new object of class '<em>Feature Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Task</em>'.
   * @generated
   */
  FeatureTask createFeatureTask();

  /**
   * Returns a new object of class '<em>Bug Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bug Task</em>'.
   * @generated
   */
  BugTask createBugTask();

  /**
   * Returns a new object of class '<em>Analyse Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Analyse Task</em>'.
   * @generated
   */
  AnalyseTask createAnalyseTask();

  /**
   * Returns a new object of class '<em>Test Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Task</em>'.
   * @generated
   */
  TestTask createTestTask();

  /**
   * Returns a new object of class '<em>Document Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Task</em>'.
   * @generated
   */
  DocumentTask createDocumentTask();

  /**
   * Returns a new object of class '<em>Deploy Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deploy Task</em>'.
   * @generated
   */
  DeployTask createDeployTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PlanningPackage getPlanningPackage();

} //PlanningFactory