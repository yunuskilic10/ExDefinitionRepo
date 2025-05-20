package StepDefinitons;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _11_UpdateSteps extends Parent {
    DialogContent dC = new DialogContent();
    @And("Enter update name to edit name button")
    public void enterUpdateNameToEditNameButton(DataTable dt) {
        List<List<String>> editList = dt.asLists(String.class);
        for (int i = 0; i < editList.size(); i++) {
            String elementKey = editList.get(i).get(0);
            String valueToSend = editList.get(i).get(1);
            WebElement element = dC.getWebElement(elementKey);
            if (valueToSend == null || valueToSend.isEmpty()) {
                throw new IllegalArgumentException("sendKeys fonksiyonuna boş veya null değer gönderilemez!");
            }
            sendKeysFunction(element, valueToSend);
        }
    }

    @Then("Should be updated item")
    public void shouldBeUpdatedItem() {
        verifyContainsText(dC.newAssertMessage,"updated");
    }
}
