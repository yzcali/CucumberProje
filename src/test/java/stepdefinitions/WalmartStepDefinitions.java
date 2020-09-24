package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.WalmartPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class WalmartStepDefinitions {

    WalmartPage walmartPage= new WalmartPage();

    @Given("TC_{int} user goes to walmart page")
    public void tc__user_goes_to_walmart_page(Integer int1) {
        Driver.getDriver().get(ConfigurationReader.getProperty("walmart_link"));
    }
    @Given("TC_{int} user writes {string} on searchB")
    public void tc__user_writes_on_searchB(Integer int1, String string) {
       walmartPage.searchB.sendKeys(string+ Keys.ENTER);
    }

    @Then("TC_{int} user see at the results of searching and writes it on the console")
    public void tc__user_see_at_the_results_of_searching_and_writes_it_on_the_console(Integer int1) {
        System.out.println(walmartPage.resultNo.getText());
    }
}
