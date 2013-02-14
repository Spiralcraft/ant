package spiralcraft.ant;

import org.apache.tools.ant.Task;

public class BuildInfo
  extends Task
{
  @Override
  public void execute() 
  {
    // use of the reference to Project-instance
    String projectName = getProject().getProperty("ant.project.name");
    String versionInfo = getProject().getProperty("organization")
      +"-"
      +getProject().getProperty("module")
      +"-"
      +getProject().getProperty("buildVersion");

    log("Spiralcraft build: "+projectName+" "+versionInfo+" ("+getLocation()+")");

  }
}
