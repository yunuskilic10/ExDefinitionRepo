package Pages;

import Utilities.GWD_first;
import Utilities.GWD_second;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    public Header(){
        PageFactory.initElements(GWD_second.getDriver(),this);
    }

    @FindBy(css = "div#search > input")
    public WebElement searchInput;

    @FindBy(xpath = "(//span[@class='input-group-btn']/button)[1]")
    public WebElement searchButton;

    @FindBy(css = "span#cart-total")
    public WebElement addCart;

    @FindBy(xpath = "(//a[contains(@href,'checkout/cart')])[2]")
    public WebElement viewCart;
    @FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
    public WebElement item1;
    public WebElement getWebElement(String element){
        switch (element){
            case "searchInput": return this.searchInput;
            case "item1": return this.item1;
            case "searchButton": return this.searchButton;
            case "addCart": return this.addCart;
            case "viewCart": return this.viewCart;

        }
        return null;
    }



}
