package СтарыеПроекты;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/feature",
        glue = "src/test/java/stepDefinitions",
        tags = "@Smoke",
        dryRun = false
)
public class SmokeRunner {


}