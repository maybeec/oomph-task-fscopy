/**
 *
 */
package com.github.maybeec.oomph.task.fscopy.core.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
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
      SetupTaskLogger.getLogger().logInfo("Resolved " + src + " to " + srcDir.toString());
    }
    final Path dstDir = Paths.get(dst);
    Files.walkFileTree(srcDir, new SimpleFileVisitor<Path>() {
      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        if (!Files.exists(file)) {
          SetupTaskLogger.getLogger().logWarning("File doesn't seem to exist: " + file.getFileName());
          return FileVisitResult.CONTINUE;
        }
        if (Files.isDirectory(file)) {
          if (Files.isSymbolicLink(file)) {
            SetupTaskLogger.getLogger().log("copy sym " + srcDir.relativize(file).toString() + "->"
                + dstDir.resolve(srcDir.relativize(file)).toString());
            Files.copy(file, dstDir.resolve(srcDir.relativize(file)), LinkOption.NOFOLLOW_LINKS);
          }
          return FileVisitResult.CONTINUE;
        } else {
          if (dstDir.resolve(srcDir.relativize(file)).getParent().toFile().mkdirs()) {
            SetupTaskLogger.getLogger()
                .log("create " + dstDir.resolve(srcDir.relativize(file)).getParent().toFile().getAbsolutePath());
          }
        }
        try {
          SetupTaskLogger.getLogger().log(
              "copy " + srcDir.relativize(file).toString() + "->" + dstDir.resolve(srcDir.relativize(file)).toString());
          Files.copy(file, dstDir.resolve(srcDir.relativize(file)));
        } catch (FileAlreadyExistsException e) {
          SetupTaskLogger.getLogger().logWarning("File already exists " + e.getMessage() + " Continue.");
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
