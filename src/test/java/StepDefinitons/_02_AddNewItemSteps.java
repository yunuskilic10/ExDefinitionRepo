package StepDefinitons;

import Pages.DialogContent;
import Pages.Header;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_AddNewItemSteps extends Parent {
    DialogContent dc = new DialogContent();
    Header h = new Header();
    @And("Enter item name to searchbox and click search button")
    public void enterItemNameToSearchboxAndClickSearchButton() {



        clickFunction(h.searchInput);
        sendKeysFunction(h.searchInput,"ipod");
        clickFunction(h.searchButton);

    }

    @When("Add to Cart and Check")
    public void addToCartAndCheck() {

        clickFunction(h.item1);
        clickFunction(h.addCart);
        clickFunction(h.viewCart);


    }

    @Then("Should be added new item in Shop Cart")
    public void shouldBeAddedNewItemInShopCart() {
   verifyContainsText(dc.assertMessage, "Gift");
    }
}
