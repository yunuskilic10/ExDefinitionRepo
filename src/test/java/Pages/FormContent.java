package Pages;

import Utilities.GWD_first;
import Utilities.GWD_second;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent {
    public FormContent() {

        PageFactory.initElements(GWD_second.getDriver(), this);
    }

    @FindBy(id = "input-firstname")
    public WebElement firstName;

    @FindBy(id = "input-lastname")
    public WebElement lastName;

    @FindBy(id = "input-address-1")
    public WebElement address1;

    @FindBy(id = "input-city")
    public WebElement city;

    @FindBy(id = "input-postcode")
    public WebElement postCode;

    @FindBy(id = "input-country")
    public WebElement selectCountry;

    @FindBy(id = "input-zone")
    public WebElement selectRegionState;


    public WebElement getWebElement(String element) {
        switch (element) {
            case "firstName":
                return this.firstName;



            case "lastName":
                return this.lastName;
            case "address1":
                return this.address1;
            case "city":
                return this.city;
            case "postCode":
                return this.postCode;
            case "selectCountry":
                return this.selectCountry;
            case "selectRegionState":
                return this.selectRegionState;
        }
        return null;
    }
}


