package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"org.example.stepDefs"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
        tags = "@tests",
        monochrome = true,
        publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
