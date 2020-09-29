package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaPalacePage {
    public KoalaPalacePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy( id = "UserName")
    public WebElement userNameKutusu;
    @FindBy ( id = "Password" )
    public WebElement passwordKutusu;
    @FindBy ( xpath = "//button[.='Log in']")
    public WebElement girisButonu;
    @FindBy ( id = "Code")
    public WebElement hotelCreateCodeKutusu;
    @FindBy ( id = "Name")
    public WebElement hotelCreateNameKutusu;
    @FindBy ( id = "Address")
    public WebElement hotelCreateAddressKutusu;
    @FindBy ( id = "Phone")
    public WebElement hotelCreatePhoneKutusu;
    @FindBy (id = "Email")
    public WebElement hotelCreateEmailKutusu;
    @FindBy (id = "IDGroup")
    public WebElement hotelCreateIDGroupDropdown;
    @FindBy (id = "btnSubmit")
    public WebElement hotelCreateSaveButonu;
    @FindBy (className = "bootbox-body")
    public WebElement hotelCreateBasariliYazisi;
}
