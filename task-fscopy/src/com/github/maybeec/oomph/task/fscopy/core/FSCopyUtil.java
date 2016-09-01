/**
 *
 */
package com.github.maybeec.oomph.task.fscopy.core;

import com.github.maybeec.oomph.task.fscopy.core.exceptions.FSCopyException;

/**
 * @author sholzer
 *
 */
public interface FSCopyUtil
{
  /**
   * copies the source to the destination
   * @param source a file or a folder to copy
   * @param destination the folder to contain the source
   * @throws FSCopyException
   */
  void copy(String source, String destination) throws FSCopyException;
}
