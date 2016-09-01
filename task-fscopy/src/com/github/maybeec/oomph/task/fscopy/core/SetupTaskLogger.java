/**
 *
 */
package com.github.maybeec.oomph.task.fscopy.core;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.log.ProgressLog.Severity;

/**
 * @author sholzer
 *
 */
@SuppressWarnings("restriction")
public abstract class SetupTaskLogger
{

  private static SetupTaskLogger logger;

  public static SetupTaskLogger getLogger()
  {
    if (logger == null)
    {
      logger = new SetupTaskLogger()
      {
      };
    }
    return logger;
  }

  static void setLogger(SetupTaskLogger logger)
  {
    SetupTaskLogger.logger = logger;
  }

  private SetupTaskContext context;

  public void setContext(SetupTaskContext context)
  {
    this.context = context;
  }

  public void log(String msg)
  {
    if (context == null)
    {
      System.out.println("log:" + msg);
    }
    else
    {
      context.log(msg, Severity.OK);
    }

  }

  public void logInfo(String msg)
  {
    if (context == null)
    {
      System.out.println("INFO:" + msg);
    }
    else
    {
      context.log(msg, Severity.INFO);
    }
  }

  public void logWarning(String msg)
  {
    if (context == null)
    {
      System.out.println("WARN:" + msg);
    }
    else
    {
      context.log(msg, Severity.WARNING);
    }
  }

  public void logError(String msg)
  {
    if (context == null)
    {
      System.out.println("ERROR:" + msg);
    }
    else
    {
      context.log(msg, Severity.ERROR);
    }
  }
}
