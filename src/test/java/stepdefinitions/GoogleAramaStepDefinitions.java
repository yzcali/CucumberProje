package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GoogleAramaStepDefinitions {

    GooglePage googlePage= new GooglePage();

    @Given("user goes to search page of google")
    public void user_goes_to_search_page_of_google() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));


    }



    @Given("searches techproeducation")
    public void searches_techproeducation() {
       googlePage.searchB.sendKeys(ConfigurationReader.getProperty("google_word")+ Keys.ENTER);

    }
    @Then("controls page title")
    public void controls_page_title() throws InterruptedException {
        Thread.sleep(3000);

        String title =Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains(ConfigurationReader.getProperty("google_word")));


    }
}
