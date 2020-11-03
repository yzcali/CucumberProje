package database_stepdefinitions;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

public class DBCreateStepDef {
    @Given("kullanici yeni bir hotel olusturur")
    public void kullanici_yeni_bir_hotel_olusturur() {
        String query = "INSERT INTO dbo.tHOTEL (Code, Name, Address, Phone, Email, IDGroup, CreateDate, CreateUser) VALUES ('113', 'Maykin yeri', 'arabul sk','1023654', 'jack@mail.com','1132564', 2020-02-02 00:00:00,4 ...)";
        DBUtils.executeQuery(query);
    }
}
