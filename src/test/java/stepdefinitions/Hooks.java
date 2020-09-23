package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before // her senaryodan once
    public void setup(){
        System.out.println("setup worked");
    }

    @After // her senaryodan sonra

    public void teardown(Scenario scenario){
        System.out.println("teardown worked");
        //for screenshot we need that code
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
// if scenario is failed , screenshot is added your report
      if(scenario.isFailed()){
          scenario.embed(screenshot,"image/png");
      }

    }
}
