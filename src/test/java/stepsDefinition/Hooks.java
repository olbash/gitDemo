package stepsDefinition;


import Utils.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks extends Base {
//    WebDriver driver;
    @Before("RegTest")
    public void beforeValidation(){
        System.out.println("BEFORE HOOK");
    }

    @After
    public void afterHook(){
        driver.close();
    }
}
