package StepDefinitons;

import Utilities.GWD_second;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) GWD_second.getDriver());
            byte[] hataGorseli = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(hataGorseli, "image/png", "screenshot name");
        }
        GWD_second.quitDriver();
    }
}
