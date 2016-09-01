/**
 *
 */
package com.github.maybeec.oomph.task.fscopy.core.impl;

import com.github.maybeec.oomph.task.fscopy.core.FSCopyUtil;
import com.github.maybeec.oomph.task.fscopy.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.fscopy.core.exceptions.FSCopyException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author sholzer
 *
 */
public class FSCopyUtilImpl implements FSCopyUtil
{

  private SetupTaskLogger LOG = SetupTaskLogger.getLogger();

  /**
   *
   */
  public FSCopyUtilImpl()
  {
    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   * @see com.github.maybeec.oomph.task.fscopy.core.FSCopyUtli#copy(java.lang.String, java.lang.String)
   */
  public void copy(String source, String destination) throws FSCopyException
  {
    LOG = SetupTaskLogger.getLogger();
    LOG.logInfo("Copying " + source + " to " + destination);
    File sourceFile = new File(source);
    try
    {
      recursiveDirectoryCopy(sourceFile, destination);
    }
    catch (IOException ex)
    {
      throw new FSCopyException(ex.getClass().getName() + ":" + ex.getMessage(), ex);
    }
  }

  private void recursiveDirectoryCopy(File source, String destination) throws IOException
  {
    if (source.isDirectory())
    {
      for (File f : source.listFiles())
      {
        String fileDestination = destination + File.separator + f.getName();
        if (f.isDirectory() && f.listFiles().length > 0)
        {
          recursiveDirectoryCopy(f, fileDestination);
        }
        else
        {
          createPath(fileDestination);
          Files.copy(f.toPath(), Paths.get(fileDestination), StandardCopyOption.REPLACE_EXISTING);
          LOG.log("Copied " + f.getPath() + " to " + fileDestination);
        }
      }
    }
    else
    {
      createPath(destination);
      Files.copy(source.toPath(), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
      LOG.log("Copied " + source.getPath() + " to " + destination);
    }
  }

  private void createPath(String pathString)
  {
    File pathFile = new File(pathString);
    LOG.log("Making path for " + pathString);
    try
    {
      if (pathFile.isDirectory())
      {
        pathFile.mkdirs();
      }
      else
      {
        pathFile.getParentFile().mkdirs();
      }
    }
    catch (Exception e)
    {
      LOG.logError(e.getMessage());
    }
  }

}
