package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
        glue = "stepDefinition"
//, tags = "@userReg2"
, dryRun = false
,plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"})
public class TestRunner {
}
