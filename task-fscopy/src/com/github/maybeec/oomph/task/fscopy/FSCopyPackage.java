/**
 */
package com.github.maybeec.oomph.task.fscopy;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.github.maybeec.oomph.task.fscopy.FSCopyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/maybeec/oomph-task-fsmove/master/task-fsmove-updatesite/model/Oomph-task-fscopy.ecore'"
 * @generated
 */
public interface FSCopyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fscopy";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://com.github.maybeec/task-fscopy/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fscopy";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FSCopyPackage eINSTANCE = com.github.maybeec.oomph.task.fscopy.impl.FSCopyPackageImpl.init();

  /**
   * The meta object id for the '{@link com.github.maybeec.oomph.task.fscopy.impl.FileSystemCopyTaskImpl <em>File System Copy Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.maybeec.oomph.task.fscopy.impl.FileSystemCopyTaskImpl
   * @see com.github.maybeec.oomph.task.fscopy.impl.FSCopyPackageImpl#getFileSystemCopyTask()
   * @generated
   */
  int FILE_SYSTEM_COPY_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__RESOURCE = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__DESTINATION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK__PRIORITY = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>File System Copy Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_SYSTEM_COPY_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * Returns the meta object for class '{@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask <em>File System Copy Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File System Copy Task</em>'.
   * @see com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask
   * @generated
   */
  EClass getFileSystemCopyTask();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resource</em>'.
   * @see com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getResource()
   * @see #getFileSystemCopyTask()
   * @generated
   */
  EAttribute getFileSystemCopyTask_Resource();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination</em>'.
   * @see com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getDestination()
   * @see #getFileSystemCopyTask()
   * @generated
   */
  EAttribute getFileSystemCopyTask_Destination();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getPriority()
   * @see #getFileSystemCopyTask()
   * @generated
   */
  EAttribute getFileSystemCopyTask_Priority();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FSCopyFactory getFSCopyFactory();

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
     * The meta object literal for the '{@link com.github.maybeec.oomph.task.fscopy.impl.FileSystemCopyTaskImpl <em>File System Copy Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.maybeec.oomph.task.fscopy.impl.FileSystemCopyTaskImpl
     * @see com.github.maybeec.oomph.task.fscopy.impl.FSCopyPackageImpl#getFileSystemCopyTask()
     * @generated
     */
    EClass FILE_SYSTEM_COPY_TASK = eINSTANCE.getFileSystemCopyTask();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_SYSTEM_COPY_TASK__RESOURCE = eINSTANCE.getFileSystemCopyTask_Resource();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_SYSTEM_COPY_TASK__DESTINATION = eINSTANCE.getFileSystemCopyTask_Destination();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_SYSTEM_COPY_TASK__PRIORITY = eINSTANCE.getFileSystemCopyTask_Priority();

  }

} // FSCopyPackage
