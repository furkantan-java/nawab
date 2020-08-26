package com.vytrack.step_definitions;

import com.vytrack.pages.W3;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class W3Steps {

    WebDriver driver = Driver.getDriver();
    W3 w3 = new W3();

    @Given("user is on the url3")
    public void user_is_on_the_url3() {
    driver.get(ConfigurationReader.getProperty("url3"));
    }

    @When("find all elements with the tag a")
    public void find_all_elements_with_the_tag_a() {
    w3.Tag();
    }

    @Then("for each element displayed print text and href")
    public void for_each_element_displayed_print_text_and_href() {

    }

}

