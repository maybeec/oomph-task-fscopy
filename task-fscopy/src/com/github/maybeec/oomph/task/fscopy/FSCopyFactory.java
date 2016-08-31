/**
 */
package com.github.maybeec.oomph.task.fscopy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.maybeec.oomph.task.fscopy.FSCopyPackage
 * @generated
 */
public interface FSCopyFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FSCopyFactory eINSTANCE = com.github.maybeec.oomph.task.fscopy.impl.FSCopyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>File System Copy Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File System Copy Task</em>'.
   * @generated
   */
  FileSystemCopyTask createFileSystemCopyTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FSCopyPackage getFSCopyPackage();

} // FSCopyFactory
