package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags ="@RegressionTest and @SmokeTest",
        features = {"src/test/java/Features"},
        glue = {"StepDefinitons"},
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)

public class _07_RunnerExtentReport extends AbstractTestNGCucumberTests {
}
