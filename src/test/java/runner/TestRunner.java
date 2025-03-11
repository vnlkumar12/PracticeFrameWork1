package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features",
                 glue = {"org.example.stepDefs"},
                 plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
                 monochrome = true,
                 publish = true)
public class TestRunner extends AbstractTestNGCucumberTests implements Interface {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenario(){
        return super.scenarios();
    }
}
