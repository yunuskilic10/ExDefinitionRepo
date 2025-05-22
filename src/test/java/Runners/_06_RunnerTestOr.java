package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags ="@RegressionTest and @SmokeTest",
        features = {"src/test/java/Features"},
        glue = {"StepDefinitons"},
        plugin = {"html:target/site/cucumber-basic.html"}
)

public class _06_RunnerTestOr extends AbstractTestNGCucumberTests {

}
