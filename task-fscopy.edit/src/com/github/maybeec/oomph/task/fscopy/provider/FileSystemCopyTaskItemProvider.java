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
package com.github.maybeec.oomph.task.fscopy.provider;

import org.eclipse.oomph.setup.provider.SetupTaskItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.github.maybeec.oomph.task.fscopy.FSCopyPackage;
import com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link com.github.maybeec.oomph.task.fscopy.FileSystemCopyTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileSystemCopyTaskItemProvider extends SetupTaskItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileSystemCopyTaskItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addResourcePropertyDescriptor(object);
      addDestinationPropertyDescriptor(object);
      addPriorityPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Resource feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addResourcePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_FileSystemCopyTask_resource_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_FileSystemCopyTask_resource_feature", "_UI_FileSystemCopyTask_type"),
        FSCopyPackage.Literals.FILE_SYSTEM_COPY_TASK__RESOURCE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Destination feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDestinationPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_FileSystemCopyTask_destination_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_FileSystemCopyTask_destination_feature", "_UI_FileSystemCopyTask_type"),
        FSCopyPackage.Literals.FILE_SYSTEM_COPY_TASK__DESTINATION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Priority feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPriorityPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_FileSystemCopyTask_priority_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_FileSystemCopyTask_priority_feature", "_UI_FileSystemCopyTask_type"),
        FSCopyPackage.Literals.FILE_SYSTEM_COPY_TASK__PRIORITY, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
  }

  /**
   * This returns FileSystemCopyTask.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/FileSystemCopyTask"));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage()
  {
    return true;
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTextGen(Object object)
  {
    String label = ((FileSystemCopyTask)object).getID();
    return label == null || label.length() == 0 ? getString("_UI_FileSystemCopyTask_type") : getString("_UI_FileSystemCopyTask_type") + " " + label;
  }

  @Override
  public String getText(Object object)
  {
    String label = getTextGen(object);

    String type = getString("_UI_FileSystemCopyTask_type");
    return label.startsWith(type + " ") && !label.equals(type) ? label.substring(type.length()).trim() : label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(FileSystemCopyTask.class))
    {
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__RESOURCE:
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__DESTINATION:
    case FSCopyPackage.FILE_SYSTEM_COPY_TASK__PRIORITY:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}
