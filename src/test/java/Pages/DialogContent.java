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

    @FindBy(xpath = "(//button[span[contains(text(),'Add to Cart')]])[4]")
    public WebElement ipod4;

    @FindBy(css = "div#content > h1")
    public WebElement assertMessage;

}
