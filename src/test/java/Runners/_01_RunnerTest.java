package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Features/_01_Login.feature"},
        glue = {"StepDefinitons"}
)

public class _01_RunnerTest extends AbstractTestNGCucumberTests {
}
