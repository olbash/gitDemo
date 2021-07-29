package stepsDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Collections;
import java.util.List;

public class ApplicationLogin {

    @Given("User is on the login page")
    public void test1 () {
    System.out.println("User is on the login page");
}

    @When("user enters valid creds and clicks on the 'Login' button")
    public void enterValidCredsClickLogin() {
        System.out.println("user enters valid creds and clicks on the 'Login' button");
    }

    @Then("Home page appears")
    public void homePageAppears() {
        System.out.println("Home page appears");
    }


    @When("user enters invalid creds and clicks on the Login button")
    public void userEntersInvalidCredsAndClicksOnTheLoginButton() {
        System.out.println("user enters invalid creds");
    }


    @Then("Home page doesn't appear")
    public void homePageDoesnTAppear() {
        System.out.println("Home page doesn't appear");
    }

    @When("user enters invalid creds \\(login {string} and pwd {string}) and clicks on the Login button")
    public void userEntersInvalidCredsLoginAndPwdAndClicksOnTheLoginButton(String str1, String str2) {
        System.out.println(str1);
        System.out.println(str2);
    }

    @Then("Home page appears \"([^\"]*)\"$")
    public void home_page_appears_something(String strArg1) {
        System.out.println(strArg1);
    }

    //TableData case
    @When("user signs in with following details:")
    public void userSignsInWithFollowingDetails(DataTable data) {
        List<List<String>> obj = Collections.singletonList(data.asList());
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
    }

    //ParametrizationCase
    //@Then("{string} should send {word} with range {word} to {word} to BLS")
    @When("user logs in with login {word} and password {word}")
    public void user_logs_in_with_login_and_password(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }


    @When("Browser is open")
    public void browserIsOpen() {
        System.out.println("Browser is open");
    }

    @Then("Verify that browser is open")
    public void verifyThatBrowserIsOpen() {
        System.out.println("Verify that browser is open");
    }

}
