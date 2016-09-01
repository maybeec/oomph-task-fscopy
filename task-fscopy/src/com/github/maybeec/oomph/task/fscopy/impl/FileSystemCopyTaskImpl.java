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
package com.github.maybeec.oomph.task.fscopy.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.github.maybeec.oomph.task.fscopy.FSCopyPackage;
import com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask;
import com.github.maybeec.oomph.task.fscopy.core.FSCopyUtil;
import com.github.maybeec.oomph.task.fscopy.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.fscopy.core.impl.FSCopyUtilImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File System Copy Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.maybeec.oomph.task.fscopy.impl.FileSystemCopyTaskImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.fscopy.impl.FileSystemCopyTaskImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.fscopy.impl.FileSystemCopyTaskImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileSystemCopyTaskImpl extends SetupTaskImpl implements FileSystemCopyTask
{
  /**
   * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected static final String RESOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected String resource = RESOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected String destination = DESTINATION_EDEFAULT;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final int PRIORITY_EDEFAULT = 500;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected int priority = PRIORITY_EDEFAULT;

  private static final int PRIORITY = PRIORITY_DEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileSystemCopyTaskImpl()
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
    return FSCopyPackage.Literals.FILE_SYSTEM_COPY_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(String newResource)
  {
    String oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, FSCopyPackage.FILE_SYSTEM_COPY_TASK__RESOURCE, oldResource, resource));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(String newDestination)
  {
    String oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, FSCopyPackage.FILE_SYSTEM_COPY_TASK__DESTINATION, oldDestination, destination));
    }
  }

  @Override
  public int getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(int newPriority)
  {
    int oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, FSCopyPackage.FILE_SYSTEM_COPY_TASK__PRIORITY, oldPriority, priority));
    }
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
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__RESOURCE:
      return getResource();
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__DESTINATION:
      return getDestination();
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__PRIORITY:
      return getPriority();
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
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__RESOURCE:
      setResource((String)newValue);
      return;
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__DESTINATION:
      setDestination((String)newValue);
      return;
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__PRIORITY:
      setPriority((Integer)newValue);
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
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__RESOURCE:
      setResource(RESOURCE_EDEFAULT);
      return;
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__DESTINATION:
      setDestination(DESTINATION_EDEFAULT);
      return;
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__PRIORITY:
      setPriority(PRIORITY_EDEFAULT);
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
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__RESOURCE:
      return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__DESTINATION:
      return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__PRIORITY:
      return priority != PRIORITY_EDEFAULT;
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
    if (eIsProxy())
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (resource: ");
    result.append(resource);
    result.append(", destination: ");
    result.append(destination);
    result.append(", priority: ");
    result.append(priority);
    result.append(')');
    return result.toString();
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    SetupTaskLogger.getLogger().setContext(context);
    FSCopyUtil util = new FSCopyUtilImpl();
    util.copy(resource, destination);
  }

} // FileSystemCopyTaskImpl
