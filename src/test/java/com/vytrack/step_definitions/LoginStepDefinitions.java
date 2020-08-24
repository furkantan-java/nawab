package com.vytrack.step_definitions;

import com.vytrack.pages.Login;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginStepDefinitions {

    WebDriver driver = Driver.getDriver();
    Login login = new Login();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("qa1"));
    }

    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        login.loginAsStoreManager();
    }

    @Then("user should verify that title is {string}")
    public void user_should_verify_that_title_is(String title) {
        Assert.assertEquals(title,driver.getTitle());
    }

}
