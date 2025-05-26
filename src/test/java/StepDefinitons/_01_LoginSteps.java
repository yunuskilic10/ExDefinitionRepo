package StepDefinitons;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD_second;
import io.cucumber.java.en.*;


public class _01_LoginSteps extends Parent {

    DialogContent dc=new DialogContent();

    @Given("Navigate to Opencart")
    public void navigateToOpencart() {
        GWD_second.getDriver().get("https://opencart.abstracta.us/index.php?route=account/login");
        GWD_second.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        //wait.until(ExpectedConditions.elementToBeClickable(dc.loginButton));
       //dc.email.sendKeys("carlosSantana@gmail.com");
       // dc.password.sendKeys("1234");
       // dc.loginButton.click();

        sendKeysFunction(dc.email,"hanofaj644@gianes.com");
        sendKeysFunction(dc.password,"12345");
        clickFunction(dc.loginButton);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
       //   wait.until(ExpectedConditions.visibilityOf(dc.myAccount));
     verifyContainsText(dc.myAccount,"My Account");


    }
}
