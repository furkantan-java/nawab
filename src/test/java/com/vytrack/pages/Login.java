package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageBase {

    @FindBy(id = "prependedInput")
    private WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    private WebElement passwordBox;

    @FindBy(id = "_submit")
    private WebElement loginButton;


}
