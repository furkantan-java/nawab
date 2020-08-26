package com.vytrack.step_definitions;

import com.vytrack.pages.Amazon;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {

    WebDriver driver = Driver.getDriver();
    Amazon amazon = new Amazon();

    @Given("user is on the url2")
    public void user_is_on_the_url2(){
    driver.get(ConfigurationReader.getProperty("url2"));

    }
    @When("user clicks on All dropdown")
    public void user_clicks_on_All_dropdown() {
        amazon.All();
    }

    @Then("verify that default value in dropdown is All, and the dropdown is not sorted alphabetically")
    public void verify_that_default_value_in_dropdown_is_All_and_the_dropdown_is_not_sorted_alphabetically() {
    amazon.Dropdown();

    }

}
