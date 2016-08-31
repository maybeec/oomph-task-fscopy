/**
 */
package com.github.maybeec.oomph.task.fscopy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.github.maybeec.oomph.task.fscopy.FSCopyFactory;
import com.github.maybeec.oomph.task.fscopy.FSCopyPackage;
import com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FSCopyFactoryImpl extends EFactoryImpl implements FSCopyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FSCopyFactory init()
  {
    try
    {
      FSCopyFactory theFSCopyFactory = (FSCopyFactory)EPackage.Registry.INSTANCE.getEFactory(FSCopyPackage.eNS_URI);
      if (theFSCopyFactory != null)
      {
        return theFSCopyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FSCopyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSCopyFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK:
      return createFileSystemCopyTask();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileSystemCopyTask createFileSystemCopyTask()
  {
    FileSystemCopyTaskImpl fileSystemCopyTask = new FileSystemCopyTaskImpl();
    return fileSystemCopyTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSCopyPackage getFSCopyPackage()
  {
    return (FSCopyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FSCopyPackage getPackage()
  {
    return FSCopyPackage.eINSTANCE;
  }

} // FSCopyFactoryImpl
