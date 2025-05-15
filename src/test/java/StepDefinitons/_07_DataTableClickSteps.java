package StepDefinitons;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Header;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;



public class _07_DataTableClickSteps extends Parent {
    Header h = new Header();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();
    @When("Enter item name {string}")
    public void enterItemName(String itemName) {
        sendKeysFunction(h.searchInput,itemName);

    }

    @And("Click to elements with Data Table")
    public void clickToElementsWithDataTable(DataTable dt) {
        List<String> buttonsList = dt.asList(String.class);

        for (int i = 0; i < buttonsList.size(); i++) {
            WebElement element = h.getWebElement(buttonsList.get(i));
            clickFunction(element);
        }

    }
}
