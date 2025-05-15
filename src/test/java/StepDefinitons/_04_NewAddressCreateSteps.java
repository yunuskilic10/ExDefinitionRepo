package StepDefinitons;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class _04_NewAddressCreateSteps extends Parent {
    DialogContent dc = new DialogContent();

    FormContent fc = new FormContent();

    @When("Click address book button")
    public void clickAddressBookButton() {
        clickFunction(dc.addressBookLink);
        clickFunction(dc.newAddressButton);

    }

    @And("Enter firstName {string} and lastName {string}")
    public void enterFirstNameAndLastName(String firstName, String lastName) {
        sendKeysFunction(fc.firstName,firstName);
        sendKeysFunction(fc.lastName,lastName);
        sendKeysFunction(fc.address1,"Eskisehir adres1");
        sendKeysFunction(fc.city,"Eskisehir");
        sendKeysFunction(fc.postCode,"12345");
        Select select1 = new Select(fc.selectRegionState);
        select1.selectByIndex(10);
    }

    @And("full form and click continue button")
    public void fullFormAndClickContinueButton() {
        clickFunction(fc.continueButton);
    }

    @Then("Should be added new address")
    public void shouldBeAddedNewAddress() {
        verifyContainsText(dc.assertMessageAddress,"added");
    }
}
