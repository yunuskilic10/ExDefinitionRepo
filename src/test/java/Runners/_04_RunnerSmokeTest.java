package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags ="@SmokeTest",

        features = {"src/test/java/Features"},

        glue = {"StepDefinitons"}

)


public class _04_RunnerSmokeTest extends AbstractTestNGCucumberTests {
}
