/**
 *
 */
package com.github.maybeec.oomph.task.fscopy.core.impl;

import com.github.maybeec.oomph.task.fscopy.core.FSCopyUtil;
import com.github.maybeec.oomph.task.fscopy.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.fscopy.core.exceptions.FSCopyException;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author themetalone
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
    if (new File(destination).mkdirs())
    {
      SetupTaskLogger.getLogger().log("Created destination " + destination);
    }
    try
    {
      fileWalkCopy(source, destination);
    }
    catch (IOException ex)
    {
      throw new FSCopyException(ex.getClass().getName() + ":" + ex.getMessage(), ex);
    }
  }

  /**
   *
   * @param src
   * @param dst
   * @throws IOException
   * @author {@link "http://stackoverflow.com/questions/10126982/java-nio-files-copying-files"} adapted by themetalone
   */
  private void fileWalkCopy(String src, String dst) throws IOException
  {
    final Path srcDir = Paths.get(src);
    final Path dstDir = Paths.get(dst);
    Files.walkFileTree(srcDir, new SimpleFileVisitor<Path>()
    {
      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
      {
        return copy(file);
      }

      @Override
      public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException
      {
        return copy(dir);
      }

      private FileVisitResult copy(Path fileOrDir) throws IOException
      {

        if (!Files.exists(fileOrDir))
        {
          SetupTaskLogger.getLogger().logWarning("File doesn't seem to exist: " + fileOrDir.getFileName());
          return FileVisitResult.CONTINUE;
        }

        try
        {
          Files.copy(fileOrDir, dstDir.resolve(srcDir.relativize(fileOrDir)));
          SetupTaskLogger.getLogger().log(fileOrDir.toFile().getAbsolutePath() + "->" + dstDir.toFile().getAbsolutePath());
        }
        catch (FileAlreadyExistsException e)
        {
          SetupTaskLogger.getLogger().logWarning("Caught FileAlreadyExistsException for " + e.getMessage() + " Continue.");
        }
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException
      {
        if (exc instanceof FileAlreadyExistsException)
        {
          SetupTaskLogger.getLogger().logWarning("Caught exc");
          return FileVisitResult.CONTINUE;
        }
        throw exc;
      }
    });
  }
}
