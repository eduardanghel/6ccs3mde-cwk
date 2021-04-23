/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.eanghel.planning.planning;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.eanghel.planning.planning.PlanningFactory
 * @model kind="package"
 * @generated
 */
public interface PlanningPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "planning";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/eanghel/planning/Planning";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "planning";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlanningPackage eINSTANCE = uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.TaskPlanningImpl <em>Task Planning</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.TaskPlanningImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getTaskPlanning()
   * @generated
   */
  int TASK_PLANNING = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PLANNING__NAME = 0;

  /**
   * The feature id for the '<em><b>Owners</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PLANNING__OWNERS = 1;

  /**
   * The feature id for the '<em><b>Projs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PLANNING__PROJS = 2;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PLANNING__TASKS = 3;

  /**
   * The number of structural features of the '<em>Task Planning</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PLANNING_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.OwnerImpl <em>Owner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.OwnerImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getOwner()
   * @generated
   */
  int OWNER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWNER__NAME = 0;

  /**
   * The number of structural features of the '<em>Owner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWNER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.ProjectImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = 0;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.TasksImpl <em>Tasks</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.TasksImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getTasks()
   * @generated
   */
  int TASKS = 3;

  /**
   * The feature id for the '<em><b>Task Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS__TASK_TYPE = 0;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS__OWNER = 1;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS__PRIORITY = 2;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS__POINTS = 3;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS__STATUS = 4;

  /**
   * The feature id for the '<em><b>Proj</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS__PROJ = 5;

  /**
   * The number of structural features of the '<em>Tasks</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASKS_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.PointsImpl <em>Points</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PointsImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getPoints()
   * @generated
   */
  int POINTS = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__VALUE = 0;

  /**
   * The number of structural features of the '<em>Points</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.TaskTypeImpl <em>Task Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.TaskTypeImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getTaskType()
   * @generated
   */
  int TASK_TYPE = 5;

  /**
   * The number of structural features of the '<em>Task Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.FeatureTaskImpl <em>Feature Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.FeatureTaskImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getFeatureTask()
   * @generated
   */
  int FEATURE_TASK = 6;

  /**
   * The feature id for the '<em><b>Feat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_TASK__FEAT = TASK_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_TASK_FEATURE_COUNT = TASK_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.BugTaskImpl <em>Bug Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.BugTaskImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getBugTask()
   * @generated
   */
  int BUG_TASK = 7;

  /**
   * The feature id for the '<em><b>Bug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUG_TASK__BUG = TASK_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bug Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUG_TASK_FEATURE_COUNT = TASK_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.AnalyseTaskImpl <em>Analyse Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.AnalyseTaskImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getAnalyseTask()
   * @generated
   */
  int ANALYSE_TASK = 8;

  /**
   * The feature id for the '<em><b>Analyse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSE_TASK__ANALYSE = TASK_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Analyse Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSE_TASK_FEATURE_COUNT = TASK_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.TestTaskImpl <em>Test Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.TestTaskImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getTestTask()
   * @generated
   */
  int TEST_TASK = 9;

  /**
   * The feature id for the '<em><b>Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_TASK__TEST = TASK_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Test Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_TASK_FEATURE_COUNT = TASK_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.DocumentTaskImpl <em>Document Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.DocumentTaskImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getDocumentTask()
   * @generated
   */
  int DOCUMENT_TASK = 10;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TASK__DOC = TASK_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Document Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TASK_FEATURE_COUNT = TASK_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.DeployTaskImpl <em>Deploy Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.impl.DeployTaskImpl
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getDeployTask()
   * @generated
   */
  int DEPLOY_TASK = 11;

  /**
   * The feature id for the '<em><b>Deploy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_TASK__DEPLOY = TASK_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Deploy Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOY_TASK_FEATURE_COUNT = TASK_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.eanghel.planning.planning.Status <em>Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.eanghel.planning.planning.Status
   * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getStatus()
   * @generated
   */
  int STATUS = 12;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.TaskPlanning <em>Task Planning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Planning</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.TaskPlanning
   * @generated
   */
  EClass getTaskPlanning();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.TaskPlanning#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.TaskPlanning#getName()
   * @see #getTaskPlanning()
   * @generated
   */
  EAttribute getTaskPlanning_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.eanghel.planning.planning.TaskPlanning#getOwners <em>Owners</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owners</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.TaskPlanning#getOwners()
   * @see #getTaskPlanning()
   * @generated
   */
  EReference getTaskPlanning_Owners();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.eanghel.planning.planning.TaskPlanning#getProjs <em>Projs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projs</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.TaskPlanning#getProjs()
   * @see #getTaskPlanning()
   * @generated
   */
  EReference getTaskPlanning_Projs();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.eanghel.planning.planning.TaskPlanning#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.TaskPlanning#getTasks()
   * @see #getTaskPlanning()
   * @generated
   */
  EReference getTaskPlanning_Tasks();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.Owner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Owner</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Owner
   * @generated
   */
  EClass getOwner();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.Owner#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Owner#getName()
   * @see #getOwner()
   * @generated
   */
  EAttribute getOwner_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.Tasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tasks</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Tasks
   * @generated
   */
  EClass getTasks();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.eanghel.planning.planning.Tasks#getTaskType <em>Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Task Type</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Tasks#getTaskType()
   * @see #getTasks()
   * @generated
   */
  EReference getTasks_TaskType();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.kcl.eanghel.planning.planning.Tasks#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Owner</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Tasks#getOwner()
   * @see #getTasks()
   * @generated
   */
  EReference getTasks_Owner();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.Tasks#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Tasks#getPriority()
   * @see #getTasks()
   * @generated
   */
  EAttribute getTasks_Priority();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.eanghel.planning.planning.Tasks#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Points</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Tasks#getPoints()
   * @see #getTasks()
   * @generated
   */
  EReference getTasks_Points();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.Tasks#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Tasks#getStatus()
   * @see #getTasks()
   * @generated
   */
  EAttribute getTasks_Status();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.kcl.eanghel.planning.planning.Tasks#getProj <em>Proj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Proj</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Tasks#getProj()
   * @see #getTasks()
   * @generated
   */
  EReference getTasks_Proj();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.Points <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Points</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Points
   * @generated
   */
  EClass getPoints();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.Points#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Points#getValue()
   * @see #getPoints()
   * @generated
   */
  EAttribute getPoints_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.TaskType <em>Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Type</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.TaskType
   * @generated
   */
  EClass getTaskType();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.FeatureTask <em>Feature Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Task</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.FeatureTask
   * @generated
   */
  EClass getFeatureTask();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.FeatureTask#getFeat <em>Feat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feat</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.FeatureTask#getFeat()
   * @see #getFeatureTask()
   * @generated
   */
  EAttribute getFeatureTask_Feat();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.BugTask <em>Bug Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bug Task</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.BugTask
   * @generated
   */
  EClass getBugTask();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.BugTask#getBug <em>Bug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bug</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.BugTask#getBug()
   * @see #getBugTask()
   * @generated
   */
  EAttribute getBugTask_Bug();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.AnalyseTask <em>Analyse Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Analyse Task</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.AnalyseTask
   * @generated
   */
  EClass getAnalyseTask();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.AnalyseTask#getAnalyse <em>Analyse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Analyse</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.AnalyseTask#getAnalyse()
   * @see #getAnalyseTask()
   * @generated
   */
  EAttribute getAnalyseTask_Analyse();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.TestTask <em>Test Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Task</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.TestTask
   * @generated
   */
  EClass getTestTask();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.TestTask#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Test</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.TestTask#getTest()
   * @see #getTestTask()
   * @generated
   */
  EAttribute getTestTask_Test();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.DocumentTask <em>Document Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Task</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.DocumentTask
   * @generated
   */
  EClass getDocumentTask();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.DocumentTask#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.DocumentTask#getDoc()
   * @see #getDocumentTask()
   * @generated
   */
  EAttribute getDocumentTask_Doc();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.eanghel.planning.planning.DeployTask <em>Deploy Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deploy Task</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.DeployTask
   * @generated
   */
  EClass getDeployTask();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.eanghel.planning.planning.DeployTask#getDeploy <em>Deploy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deploy</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.DeployTask#getDeploy()
   * @see #getDeployTask()
   * @generated
   */
  EAttribute getDeployTask_Deploy();

  /**
   * Returns the meta object for enum '{@link uk.ac.kcl.eanghel.planning.planning.Status <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Status</em>'.
   * @see uk.ac.kcl.eanghel.planning.planning.Status
   * @generated
   */
  EEnum getStatus();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PlanningFactory getPlanningFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.TaskPlanningImpl <em>Task Planning</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.TaskPlanningImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getTaskPlanning()
     * @generated
     */
    EClass TASK_PLANNING = eINSTANCE.getTaskPlanning();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_PLANNING__NAME = eINSTANCE.getTaskPlanning_Name();

    /**
     * The meta object literal for the '<em><b>Owners</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_PLANNING__OWNERS = eINSTANCE.getTaskPlanning_Owners();

    /**
     * The meta object literal for the '<em><b>Projs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_PLANNING__PROJS = eINSTANCE.getTaskPlanning_Projs();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_PLANNING__TASKS = eINSTANCE.getTaskPlanning_Tasks();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.OwnerImpl <em>Owner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.OwnerImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getOwner()
     * @generated
     */
    EClass OWNER = eINSTANCE.getOwner();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OWNER__NAME = eINSTANCE.getOwner_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.ProjectImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.TasksImpl <em>Tasks</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.TasksImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getTasks()
     * @generated
     */
    EClass TASKS = eINSTANCE.getTasks();

    /**
     * The meta object literal for the '<em><b>Task Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASKS__TASK_TYPE = eINSTANCE.getTasks_TaskType();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASKS__OWNER = eINSTANCE.getTasks_Owner();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASKS__PRIORITY = eINSTANCE.getTasks_Priority();

    /**
     * The meta object literal for the '<em><b>Points</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASKS__POINTS = eINSTANCE.getTasks_Points();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASKS__STATUS = eINSTANCE.getTasks_Status();

    /**
     * The meta object literal for the '<em><b>Proj</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASKS__PROJ = eINSTANCE.getTasks_Proj();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.PointsImpl <em>Points</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PointsImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getPoints()
     * @generated
     */
    EClass POINTS = eINSTANCE.getPoints();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINTS__VALUE = eINSTANCE.getPoints_Value();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.TaskTypeImpl <em>Task Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.TaskTypeImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getTaskType()
     * @generated
     */
    EClass TASK_TYPE = eINSTANCE.getTaskType();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.FeatureTaskImpl <em>Feature Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.FeatureTaskImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getFeatureTask()
     * @generated
     */
    EClass FEATURE_TASK = eINSTANCE.getFeatureTask();

    /**
     * The meta object literal for the '<em><b>Feat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_TASK__FEAT = eINSTANCE.getFeatureTask_Feat();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.BugTaskImpl <em>Bug Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.BugTaskImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getBugTask()
     * @generated
     */
    EClass BUG_TASK = eINSTANCE.getBugTask();

    /**
     * The meta object literal for the '<em><b>Bug</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUG_TASK__BUG = eINSTANCE.getBugTask_Bug();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.AnalyseTaskImpl <em>Analyse Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.AnalyseTaskImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getAnalyseTask()
     * @generated
     */
    EClass ANALYSE_TASK = eINSTANCE.getAnalyseTask();

    /**
     * The meta object literal for the '<em><b>Analyse</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANALYSE_TASK__ANALYSE = eINSTANCE.getAnalyseTask_Analyse();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.TestTaskImpl <em>Test Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.TestTaskImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getTestTask()
     * @generated
     */
    EClass TEST_TASK = eINSTANCE.getTestTask();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_TASK__TEST = eINSTANCE.getTestTask_Test();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.DocumentTaskImpl <em>Document Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.DocumentTaskImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getDocumentTask()
     * @generated
     */
    EClass DOCUMENT_TASK = eINSTANCE.getDocumentTask();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_TASK__DOC = eINSTANCE.getDocumentTask_Doc();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.impl.DeployTaskImpl <em>Deploy Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.impl.DeployTaskImpl
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getDeployTask()
     * @generated
     */
    EClass DEPLOY_TASK = eINSTANCE.getDeployTask();

    /**
     * The meta object literal for the '<em><b>Deploy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOY_TASK__DEPLOY = eINSTANCE.getDeployTask_Deploy();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.eanghel.planning.planning.Status <em>Status</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.eanghel.planning.planning.Status
     * @see uk.ac.kcl.eanghel.planning.planning.impl.PlanningPackageImpl#getStatus()
     * @generated
     */
    EEnum STATUS = eINSTANCE.getStatus();

  }

} //PlanningPackage