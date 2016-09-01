/*
 * Copyright (c) 2014 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package com.github.maybeec.oomph.task.fscopy;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File System Copy Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getResource <em>Resource</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see com.github.maybeec.oomph.task.fscopy.FSCopyPackage#getFileSystemCopyTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.file.system.copy' repository='https://maybeec.github.io/oomph-task-fscopy/update/' installableUnits='com.github.maybeec.oomph.task.fsmove.feature.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP MANUAL'"
 * @generated
 */
public interface FileSystemCopyTask extends SetupTask
{

  /**
   * Returns the value of the '<em><b>Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' attribute.
   * @see #setResource(String)
   * @see com.github.maybeec.oomph.task.fscopy.FSCopyPackage#getFileSystemCopyTask_Resource()
   * @model required="true"
   * @generated
   */
  String getResource();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getResource <em>Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' attribute.
   * @see #getResource()
   * @generated
   */
  void setResource(String value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' attribute.
   * @see #setDestination(String)
   * @see com.github.maybeec.oomph.task.fscopy.FSCopyPackage#getFileSystemCopyTask_Destination()
   * @model required="true"
   * @generated
   */
  String getDestination();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getDestination <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' attribute.
   * @see #getDestination()
   * @generated
   */
  void setDestination(String value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * The default value is <code>"500"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see com.github.maybeec.oomph.task.fscopy.FSCopyPackage#getFileSystemCopyTask_Priority()
   * @model default="500"
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

} // FileSystemCopyTask
