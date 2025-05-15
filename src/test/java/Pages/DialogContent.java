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
    @FindBy(xpath = "//div[contains(@class,'alert-success')]")
    public WebElement assertMessageAddress;

    }
