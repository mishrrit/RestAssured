package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = {"stepdefinitions"},
        plugin = {"json:target/cucumber-reports/cucumber.json"}
       
)

public class TestRunners {

}
