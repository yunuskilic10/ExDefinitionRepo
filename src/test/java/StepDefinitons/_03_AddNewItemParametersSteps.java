package StepDefinitons;

import Pages.DialogContent;
import Pages.Header;
import Pages.Parent;
import io.cucumber.java.en.When;

public class _03_AddNewItemParametersSteps extends Parent {
    DialogContent dc = new DialogContent();
    Header h =new Header();
    @When("Enter itemname {string}")
    public void enterItemname(String itemname) {
        sendKeysFunction(h.searchInput,itemname);
        clickFunction(h.searchButton);

    }
}
