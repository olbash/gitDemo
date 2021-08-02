package stepsDefinition;

import PageObject.HomePage;
import Utils.Base;
import Utils.GlobalProperties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class VegetableSearch {

    WebDriver driver = Base.getDriver();
    HomePage hp = new HomePage(driver);

    public VegetableSearch() throws IOException {
    }

    @Given("User is on the official website GreenCard landing page")
    public void userIsOnTheOfficialWebsiteGreenCardLandingPage() throws InterruptedException {
        System.out.println("User is on the official website GreenCard landing page");
//        driver.get(GlobalProperties.getProperty("url"));
        Thread.sleep(3000);
    }

//    @When("^User searched for \"([^\"]*)\" Vegetable$")
//    public void userSearchedForVegetable(String veg) throws InterruptedException {
////        System.out.println("User searched for CUCUMBER Vegetable");
//        hp.getSearch().sendKeys(veg);
//        Thread.sleep(3000);
//    }

    @Then("^\"([^\"]*)\" result is displayed$")
    public void resultIsDisplayed(String veg) {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(veg));
        System.out.println(driver.findElement(By.cssSelector("h4.product-name")).getText());
    }


    @And("added items to the Cart")
    public void addedItemsToTheCart() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
        Thread.sleep(2000);
    }


    @And("user proceeded to checkout page")
    public void userProceededToCheckoutPage() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class=\"cart-icon\"]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        Thread.sleep(2000);
    }

    //assertion
    @Then("verify selected {string} is displayed on Checkout page")
    public void verifySelectedIsDisplayedOnCheckoutPage(String veg) {
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Brinjal')]")).getText().contains(veg));
    }

    @When("^User searched for (.+) Vegetables$")
    public void userSearchedForNameVegetable(String veg) throws InterruptedException {
        hp.getSearch().sendKeys(veg);
        Thread.sleep(3000);
    }

}
