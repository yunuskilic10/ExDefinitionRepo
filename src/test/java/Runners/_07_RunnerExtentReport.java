package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags ="@RegressionTest",
        features = {"src/test/java/Features"},
        glue = {"StepDefinitons"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _07_RunnerExtentReport extends AbstractTestNGCucumberTests {
}
