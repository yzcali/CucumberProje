package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.omg.CORBA.WStringSeqHelper;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.KoalaPalacePage;
import utilities.Driver;

public class KoalaPalaceStepDef {

    KoalaPalacePage page = new KoalaPalacePage();
    @Given("kullanici koalapalace admin sayfasina gider")
    public void kullanici_koalapalace_admin_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");
    }
    @Given("kullanici kullaniciadi ve sifresini girer")
    public void kullanici_kullaniciadi_ve_sifresini_girer() {
        page.userNameKutusu.sendKeys("manager2");
        page.passwordKutusu.sendKeys("Man1ager2!");
    }
    @Then("kullanici giris islemini gerceklestirir")
    public void kullanici_giris_islemini_gerceklestirir() {
        page.girisButonu.click();
    }
    @Given("kullanici hotelcreate sayfasina gider")
    public void kullanici_hotelcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin/Create");
    }
    @Given("kullanici hotelcreate code bolumune {string} girer")
    public void kullanici_hotelcreate_code_bolumune_girer(String string) {
        page.hotelCreateCodeKutusu.sendKeys(string);
    }
    @Given("kullanici hotelcreate name bolumune {string} girer")
    public void kullanici_hotelcreate_name_bolumune_girer(String string) {
        page.hotelCreateNameKutusu.sendKeys(string);
    }
    @Given("kullanici hotelcreate adress bolumune {string} girer")
    public void kullanici_hotelcreate_adress_bolumune_girer(String string) {
        page.hotelCreateAddressKutusu.sendKeys(string);
    }
    @Given("kullanici hotelcreate phone bolumune {string} girer")
    public void kullanici_hotelcreate_phone_bolumune_girer(String string) {
        page.hotelCreatePhoneKutusu.sendKeys(string);
    }
    @Given("kullanici hotelcreate email bolumune {string} girer")
    public void kullanici_hotelcreate_email_bolumune_girer(String string) {
        page.hotelCreateEmailKutusu.sendKeys(string);
    }
    @Given("kullanici hotelcreate idgroup bolumunde {string} secer")
    public void kullanici_hotelcreate_idgroup_bolumunde_secer(String string) {
        Select select = new Select(page.hotelCreateIDGroupDropdown);
        select.selectByVisibleText(string);
    }
    @Given("kullanici hotelcreate save butonuna tiklar")
    public void kullanici_hotelcreate_save_butonuna_tiklar() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelCreateSaveButonu.click();
    }
    @Then("kullanici hotelcreate kayit islemini assert eder")
    public void kullanici_hotelcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelCreateBasariliYazisi.getText());
    }
    @Given("kullanici hotelroomcreate sayfasina gider")
    public void kullanici_hotelroomcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelroomAdmin/Create");
    }
    @Given("kullanici hotelroomcreate idhotel bolumunde {string} secer")
    public void kullanici_hotelroomcreate_idhotel_bolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomCreateIDHotelDropdown);
        select.selectByIndex(2);
    }
    @Given("kullanici hotelroomcreate code bolumune {string} girer")
    public void kullanici_hotelroomcreate_code_bolumune_girer(String string) {
        page.hotelRoomCreateCodeKutusu.sendKeys(string);
    }
    @Given("kullanici hotelroomcreate name bolumune {string} girer")
    public void kullanici_hotelroomcreate_name_bolumune_girer(String string) {
        page.hotelRoomCreateNameKutusu.sendKeys(string);
    }
    @Given("kullanici hotelroomcreate location bolumune {string} girer")
    public void kullanici_hotelroomcreate_location_bolumune_girer(String string) {
        page.hotelRoomCreateLocationKutusu.sendKeys(string);
    }
    @Given("kullanici hotelroomcreate description bolumune {string} girer")
    public void kullanici_hotelroomcreate_description_bolumune_girer(String string) {
            page.hotelRoomCreateDescriptionKutusu.sendKeys(string);
    }
    @Given("kullanici hotelroomcreate price bolumune fiyat girer")
    public void kullanici_hotelroomcreate_price_bolumune_fiyat_girer() {
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(page.hotelRoomCreatePrice500, page.hotelRoomCreatePriceKutusu)
        .perform();
    }
    @Given("kullanici hotelroomcreate roomtype bolumunde {string} secer")
    public void kullanici_hotelroomcreate_roomtype_bolumunde_secer(String string) {
     Select select= new Select(page.hotelRoomCreateIDGroupRoomTypeDropDown);
     select.selectByVisibleText(string);
    }
    @Given("kullanici hotelroomcreate maxadult bolumune {string} girer")
    public void kullanici_hotelroomcreate_maxadult_bolumune_girer(String string) {
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(string);
    }
    @Given("kullanici hotelroomcreate maxchildren bolumune {string} girer")
    public void kullanici_hotelroomcreate_maxchildren_bolumune_girer(String string) {
     page.hotelRoomCreateMaxChildKutusu.sendKeys(string);
    }
    @Given("kullanici hotelroomcreate save butonuna tiklar")
    public void kullanici_hotelroomcreate_save_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        page.hotelRoomCreateSaveButonu.click();
    }
    @Then("kullanici hotelroomcreate kayit islemini assert eder")
    public void kullanici_hotelroomcreate_kayit_islemini_assert_eder() throws InterruptedException {

        Thread.sleep(3000);


        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

    }



}

