package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"}, // rapor olusturmak icin
        features = "src/test/resources/features", // features dosyasi adresi
        glue = "stepdefinitions",  //testlerin icinde oldugu package
        tags = "@ebay",// istediginiz test calistirilir .
        dryRun =false  // senaryoda olusturdugumuz ancak henuz
        // test methodu yazilmamis olan stepslerin methodlarini konsolda
        // gormek icin  dryRun = true  seklinde kullaniyoruz .


        //dryRun = false olursa  testleri calistirir.
        //eksik olan methodlari bulmak icin dryRun = true yapmamiz lazim.
)

public class EbayRunner {
}
