package StepDefinitons;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Header;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class _05_DataTableExampleSteps extends Parent {
    Header h = new Header();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();
    @When("Enter item name as DataTable")
    public void enterItemNameAsDataTable(DataTable dt) {
        List<String> itemList = dt.asList(String.class);
        for (String item : itemList) {
            sendKeysFunction(h.searchInput, item);
            clickFunction(h.searchButton);
            clickFunction(h.item1);
        }

    }

    @Then("Should be added new item with DataTable in Shop Cart")
    public void shouldBeAddedNewItemWithDataTableInShopCart() {
        clickFunction(h.addCart);
        clickFunction(h.viewCart);
        verifyContainsText(dc.assertMessage, "Gift");
    }
}
