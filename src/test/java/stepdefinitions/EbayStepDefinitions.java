package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import pages.EbayPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class EbayStepDefinitions {

    EbayPage ebayPage= new EbayPage();

    @Given("F_user goes to search page of ebay")
    public void F_user_goes_to_search_page_of_ebay() {
    Driver.getDriver().get(ConfigurationReader.getProperty("ebay_link"));


}
    @Given("user writes {string} on searchB")
    public void user_writes_on_search_button(String string) {
        ebayPage.searchB.sendKeys(string+Keys.ENTER);
    }

    @Then("user see at the results of searching and writes it")
    public void user_see_at_the_results_of_searching_and_writes_it(){
            System.out.println(ebayPage.resultNo.getText());
    }
}


