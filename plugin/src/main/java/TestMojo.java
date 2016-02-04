import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.project.MavenProject;

@Mojo(name = "test")
public class TestMojo extends AbstractMojo {

  /**
   * The Maven Project.
   */
  @Component
  protected MavenProject project;

  /**
   * Maven plugin Main method
   */
  @Override
  public void execute() throws MojoExecutionException {
    System.out.println("Hello");
  }
}