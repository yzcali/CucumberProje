package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("user goes to search page of amazon")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("http://amazon.com");
    }

    @Given("user writes headphones on search button")
    public void kullanici_aramakutusuna_headphones_yazar_ve_arar() {

        amazonPage.searchB.sendKeys("headphones" + Keys.ENTER);
    }

    @Then("user see at the results of searching and writes it on the console")
    public void kullanici_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(amazonPage.resultNo.getText());
    }

    @Given("user writes camera on search button")
    public void user_writes_camera_on_search_button() {
        amazonPage.searchB.sendKeys("camera" + Keys.ENTER);
    }

    @Given("user writes {string} on search button")
    public void user_writes_on_search_button(String string) {
        amazonPage.searchB.sendKeys(string + Keys.ENTER);
    }

    @Given("user selects {string} of dropdown")
    public void user_selects_of_dropdown(String string) {
        Select select = new Select(amazonPage.DropdownB);
        select.selectByVisibleText(string);
    }

}