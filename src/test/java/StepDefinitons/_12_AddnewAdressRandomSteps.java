package StepDefinitons;

import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.And;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.Select;

public class _12_AddnewAdressRandomSteps extends Parent {
    FormContent fc=new FormContent();
    @And("Enter firstName {string} and lastName {string} randomly")
    public void enterFirstNameAndLastNameRandomly(String firstName, String lastName) {
        String address1= RandomStringUtils.randomAlphabetic(10);
        String city=RandomStringUtils.randomAlphabetic(5,12);

        sendKeysFunction(fc.firstName,firstName);
        sendKeysFunction(fc.lastName,lastName);
        sendKeysFunction(fc.address1,address1);
        sendKeysFunction(fc.city,city);
        sendKeysFunction(fc.postCode,"12345");
        Select select1 = new Select(fc.selectRegionState);
        select1.selectByIndex(10);

    }
}
