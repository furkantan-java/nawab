package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtilities;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageBase {

    @FindBy(id = "prependedInput")
    private WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    private WebElement passwordBox;

    @FindBy(id = "_submit")
    private WebElement loginButton;


    public void loginAsStoreManager(){
        usernameBox.sendKeys(ConfigurationReader.getProperty("store_manager"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }
}
