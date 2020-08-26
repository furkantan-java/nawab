package com.vytrack.step_definitions;

import com.vytrack.pages.Jwt;
import com.vytrack.pages.Login;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class JwtSteps {

    WebDriver driver = Driver.getDriver();
    Jwt jwt = new Jwt();

    @Given("user is on the url")
    public void Url() {
        driver.get(ConfigurationReader.getProperty("url"));

    }

    @When("user randomly select a checkbox,as soon as you check any day,print the name of the day and uncheck immediately")
    public void Days() throws InterruptedException {
        jwt.Days();
    }

    @Then("after you check and uncheck Friday for the third time, exit the program.")
    public void CheckExit() throws InterruptedException {
            jwt.CheckExit();
        }

    }
