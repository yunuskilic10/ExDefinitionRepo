package StepDefinitons;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _08_AddAndDeleteAddressSteps extends Parent {
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();

    @When("Enter username and password with Data Table")
    public void enterUsernameAndPasswordWithDataTable(DataTable dt) {
        List<List<String>> loginInformations = dt.asLists(String.class);

        for (int i = 0; i < loginInformations.size(); i++) {
            WebElement element = dc.getWebElement(loginInformations.get(i).get(0));
            sendKeysFunction(element,loginInformations.get(i).get(1));

        }
    }

    @And("Enter text to webelement with DataTabel")
    public void enterTextToWebelementWithDataTabel(DataTable dt) {
        List<List<String>> addressInformations = dt.asLists(String.class);

        for (int i = 0; i < addressInformations.size(); i++) {
            WebElement element = fc.getWebElement(addressInformations.get(i).get(0));
            sendKeysFunction(element,addressInformations.get(i).get(1));
        }
    }

    @And("Select country and zone")
    public void selectCountryAndZone(DataTable dt) {
        List<List<String>> zoneList = dt.asLists(String.class);
        for (int i = 0; i < zoneList.size(); i++) {
            WebElement element = fc.getWebElement(zoneList.get(i).get(0));
            Select select = new Select(element);
            select.selectByValue(zoneList.get(i).get(1));
        }
    }

    @Then("Should be deleted new address")
    public void shouldBeDeletedNewAddress() {
        verifyContainsText(dc.assertMessageAddress,"deleted");
    }

    @And("Click to DC elements with Data Table")
    public void clickToDCElementsWithDataTable(DataTable buttons) {
        List<String> buttonsList = buttons.asList(String.class);

        for (int i = 0; i < buttonsList.size(); i++) {
            WebElement element = dc.getWebElement(buttonsList.get(i));
            clickFunction(element);
        }
    }

}
