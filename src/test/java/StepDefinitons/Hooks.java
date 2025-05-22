package StepDefinitons;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) GWD.getDriver());
            byte[] hataGorseli = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(hataGorseli, "image/png", "screenshot name");
        }
        GWD.quitDriver();
    }
}
