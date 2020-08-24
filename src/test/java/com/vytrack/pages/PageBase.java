package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    protected WebDriver driver = Driver.getDriver();

    public PageBase() {
        PageFactory.initElements(driver,this);
    }
}
