package com.github.maybeec.oomph.task.fscopy.core.impl;

import static org.junit.Assert.assertTrue;

import com.github.maybeec.oomph.task.fscopy.core.FSCopyUtil;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

/**
 *
 * @author sholzer (24.10.2016)
 */
public class CopyTest
{

  FSCopyUtil test;

  static String resources = "./test/resources/";

  /**
   * @throws java.lang.Exception
   * @author sholzer (24.10.2016)
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception
  {
  }

  /**
   * @throws java.lang.Exception
   * @author sholzer (24.10.2016)
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception
  {

    new File(resources + "singleFile/dst/a.txt").delete();
    new File(resources + "folders/dst/a.txt").delete();
    new File(resources + "folders/dst/b/c/e.txt").delete();
    new File(resources + "folders/dst/b/c/").delete();
    new File(resources + "folders/dst/b/d.txt").delete();
    new File(resources + "folders/dst/b/").delete();

  }

  /**
   * @throws java.lang.Exception
   * @author sholzer (24.10.2016)
   */
  @Before
  public void setUp() throws Exception
  {
    test = new FSCopyUtilImpl();
  }

  @Test
  public void testSingleFile() throws Exception
  {
    String source = resources + "singleFile/src/";
    String dest = resources + "singleFile/dst/";
    test.copy(source, dest);

    File a = new File(dest, "a.txt");

    assertTrue("Files not properly copied", a.exists());

  }

  @Test
  public void testFolders() throws Exception
  {
    String source = resources + "folders/src/";
    String dest = resources + "folders/dst/";

    test.copy(source, dest);

    File a = new File(dest, "a.txt");
    File d = new File(dest + "b/", "d.txt");
    File e = new File(dest + "b/c/", "e.txt");

    assertTrue("a not copied", a.exists());
    assertTrue("d not copied", d.exists());
    assertTrue("e not copied", e.exists());
  }

}
