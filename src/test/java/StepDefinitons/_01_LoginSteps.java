package StepDefinitons;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class _01_LoginSteps {

      WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    DialogContent dc=new DialogContent();

    @Given("Navigate to Opencart")
    public void navigateToOpencart() {
        GWD.getDriver().get("https://opencart.abstracta.us/index.php?route=account/login");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.loginButton));
        dc.email.sendKeys("carlosSantana@gmail.com");
        dc.password.sendKeys("1234");
        dc.loginButton.click();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        wait.until(ExpectedConditions.visibilityOf(dc.myAccount));
        Assert.assertTrue(dc.myAccount.isDisplayed(), "User is not logged in");
        GWD.quitDriver();

    }
}
