/**
 *
 */
package com.github.maybeec.oomph.task.fscopy.core.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import com.github.maybeec.oomph.task.fscopy.core.FSCopyUtil;
import com.github.maybeec.oomph.task.fscopy.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.fscopy.core.exceptions.FSCopyException;

/**
 * @author themetalone
 *
 */
public class FSCopyUtilImpl implements FSCopyUtil {

  private SetupTaskLogger LOG = SetupTaskLogger.getLogger();

  /**
   *
   */
  public FSCopyUtilImpl() {
    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   *
   * @see com.github.maybeec.oomph.task.fscopy.core.FSCopyUtli#copy(java.lang.String, java.lang.String)
   */
  public void copy(String source, String destination) throws FSCopyException {

    this.LOG = SetupTaskLogger.getLogger();
    this.LOG.logInfo("Copying " + source + " to " + destination);
    new File(destination).mkdirs();
    try {
      fileWalkCopy(source, destination);
    } catch (IOException ex) {
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
  private void fileWalkCopy(String src, String dst) throws IOException {

    final Path srcDir = Paths.get(src).toRealPath();
    if (!srcDir.equals(Paths.get(src))) {
      SetupTaskLogger.getLogger().log("Resolved " + src + " to " + srcDir.toString());
    }
    final Path dstDir = Paths.get(dst);
    Files.walkFileTree(srcDir, new SimpleFileVisitor<Path>() {
      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        Path toCopy = file;
        if (Files.isSymbolicLink(file)) {
          try {
            toCopy = file.toRealPath();
          } catch (IOException e) {
            SetupTaskLogger.getLogger()
                .logWarning("Could not resolve symbolic " + file.toString() + ". Skipping this file");
            return FileVisitResult.CONTINUE;
          }
        }
        return copy(toCopy);
      }

      private FileVisitResult copy(Path fileOrDir) throws IOException {

        if (!Files.exists(fileOrDir)) {
          SetupTaskLogger.getLogger().logWarning("File doesn't seem to exist: " + fileOrDir.getFileName());
          return FileVisitResult.CONTINUE;
        }
        if (Files.isDirectory(fileOrDir)) {
          return FileVisitResult.CONTINUE;
        } else {
          if (dstDir.resolve(srcDir.relativize(fileOrDir)).getParent().toFile().mkdirs()) {
            SetupTaskLogger.getLogger()
                .log("Made " + dstDir.resolve(srcDir.relativize(fileOrDir)).getParent().toFile().getAbsolutePath());
          }
        }
        try {
          SetupTaskLogger.getLogger().log(
              srcDir.relativize(fileOrDir).toString() + "->" + dstDir.resolve(srcDir.relativize(fileOrDir)).toString());
          Files.copy(fileOrDir, dstDir.resolve(srcDir.relativize(fileOrDir)));
        } catch (FileAlreadyExistsException e) {
          SetupTaskLogger.getLogger()
              .logWarning("Caught FileAlreadyExistsException for " + e.getMessage() + " Continue.");
        }
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {

        if (exc instanceof FileAlreadyExistsException) {
          SetupTaskLogger.getLogger().logWarning("Caught exc:" + exc.getMessage());
          return FileVisitResult.CONTINUE;
        }
        throw exc;
      }
    });
  }
}
