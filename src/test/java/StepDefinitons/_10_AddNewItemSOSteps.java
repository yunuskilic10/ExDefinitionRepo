package StepDefinitons;

import Pages.Header;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _10_AddNewItemSOSteps extends Parent {
    Header h = new Header();
    @When("Add new item with SO")
    public void addNewItemWithSO(DataTable dt) {
        List<List<String>> searchInputList = dt.asLists(String.class);

        WebElement element = h.getWebElement(searchInputList.get(0).get(0));
        sendKeysFunction(element,searchInputList.get(0).get(1));
    }

    @And("Click to Header elements with Data Table")
    public void clickToHeaderElementsWithDataTable(DataTable dt) {
        List<String> buttonList = dt.asList(String.class);

        for (int i = 0; i < buttonList.size(); i++) {
            WebElement element = h.getWebElement(buttonList.get(i));
            clickFunction(element);
        }
    }
}
