package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/Features/_02_AddNewItem.feature",
                "src/test/java/Features/_03_AddNewItem.feature"
        },
        glue = {"StepDefinitons"}
)


public class _02_RunnerTestMulty extends AbstractTestNGCucumberTests {

}
