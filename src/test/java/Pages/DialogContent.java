package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(id = "input-email")
    public WebElement email;

    @FindBy(id = "input-password")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccount;


    @FindBy(css = "div#content > h1")
    public WebElement assertMessage;
    @FindBy(xpath = "(//a[text()='Address Book'])[1]")
    public WebElement addressBookLink;
    @FindBy(xpath = "//a[text()='New Address']")
    public WebElement newAddressButton;
    @FindBy(xpath = "(//a[contains(@href, 'delete')])[2]")
    public WebElement deleteButton;
    @FindBy(xpath = "//div[contains(@class,'alert-success')]")
    public WebElement assertMessageAddress;
    @FindBy(css = "input[value='Continue']")
    public WebElement continueButton;

    public WebElement getWebElement(String element){
        switch (element){
            case "deleteButton": return this.deleteButton;
            case "email": return this.email;
            case "password": return this.password;
            case "loginButton": return this.loginButton;
            case "myAccount": return this.myAccount;
            case "assertMessage": return this.assertMessage;
            case "addressBookLink": return this.addressBookLink;
            case "newAddressButton": return this.newAddressButton;
            case "assertMessageAddress": return this.assertMessageAddress;
            case "continueButton": return this.continueButton;
        }
        return null;
    }


    }

