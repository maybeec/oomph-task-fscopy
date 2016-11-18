/**
 */
package com.github.maybeec.oomph.task.fscopy.impl;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.github.maybeec.oomph.task.fscopy.FSCopyFactory;
import com.github.maybeec.oomph.task.fscopy.FSCopyPackage;
import com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FSCopyPackageImpl extends EPackageImpl implements FSCopyPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileSystemCopyTaskEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.github.maybeec.oomph.task.fscopy.FSCopyPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FSCopyPackageImpl()
  {
    super(eNS_URI, FSCopyFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link FSCopyPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FSCopyPackage init()
  {
    if (isInited)
    {
      return (FSCopyPackage)EPackage.Registry.INSTANCE.getEPackage(FSCopyPackage.eNS_URI);
    }

    // Obtain or create and register package
    FSCopyPackageImpl theFSCopyPackage = (FSCopyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FSCopyPackageImpl ? EPackage.Registry.INSTANCE
        .get(eNS_URI) : new FSCopyPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theFSCopyPackage.createPackageContents();

    // Initialize created meta-data
    theFSCopyPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFSCopyPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FSCopyPackage.eNS_URI, theFSCopyPackage);
    return theFSCopyPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileSystemCopyTask()
  {
    return fileSystemCopyTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileSystemCopyTask_Resource()
  {
    return (EAttribute)fileSystemCopyTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileSystemCopyTask_Destination()
  {
    return (EAttribute)fileSystemCopyTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileSystemCopyTask_Priority()
  {
    return (EAttribute)fileSystemCopyTaskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSCopyFactory getFSCopyFactory()
  {
    return (FSCopyFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
    {
      return;
    }
    isCreated = true;

    // Create classes and their features
    fileSystemCopyTaskEClass = createEClass(FILE_SYSTEM_COPY_TASK);
    createEAttribute(fileSystemCopyTaskEClass, FILE_SYSTEM_COPY_TASK__RESOURCE);
    createEAttribute(fileSystemCopyTaskEClass, FILE_SYSTEM_COPY_TASK__DESTINATION);
    createEAttribute(fileSystemCopyTaskEClass, FILE_SYSTEM_COPY_TASK__PRIORITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
    {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fileSystemCopyTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(fileSystemCopyTaskEClass, FileSystemCopyTask.class, "FileSystemCopyTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFileSystemCopyTask_Resource(), ecorePackage.getEString(), "resource", null, 1, 1, FileSystemCopyTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFileSystemCopyTask_Destination(), ecorePackage.getEString(), "destination", null, 1, 1, FileSystemCopyTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFileSystemCopyTask_Priority(), ecorePackage.getEInt(), "priority", "500", 0, 1, FileSystemCopyTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource("https://raw.githubusercontent.com/maybeec/oomph-task-fscopy/master/task-fscopy-updatesite/model/Oomph-task-fscopy.ecore");

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/oomph/setup/Enablement
    createEnablementAnnotations();
    // http://www.eclipse.org/oomph/setup/ValidTriggers
    createValidTriggersAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation(this, source, new String[] { "schemaLocation",
        "https://raw.githubusercontent.com/maybeec/oomph-task-fscopy/master/task-fscopy-updatesite/model/Oomph-task-fscopy.ecore" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEnablementAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/Enablement";
    addAnnotation(fileSystemCopyTaskEClass, source, new String[] { "variableName", "p2.file.system.copy", "repository",
        "https://maybeec.github.io/oomph-task-fscopy/update/", "installableUnits", "com.github.maybeec.oomph.task.fscopy.feature.feature.group" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createValidTriggersAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
    addAnnotation(fileSystemCopyTaskEClass, source, new String[] { "triggers", "BOOTSTRAP MANUAL" });
  }

} // FSCopyPackageImpl
