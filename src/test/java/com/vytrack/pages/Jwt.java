package com.vytrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Jwt extends PageBase {

    @FindBy(css = "label[id*='gwt-debug-cwCheckBox']")
    private WebElement checkboxes;

    @FindBy(id = "gwt-debug-cwCheckBox-Friday-input")
    private WebElement Friday;

    public void Days() throws InterruptedException {
        Thread.sleep(3000);
        checkboxes.click();
        Thread.sleep(1000);
        System.out.println(checkboxes.getText());
        checkboxes.click();
    }

    public void CheckExit() throws InterruptedException {
        //for (int i = 0; i < 6; i++) {
            Thread.sleep(1000);
            Friday.click();
        Thread.sleep(1000);
            Friday.click();
        Friday.click();
        Thread.sleep(1000);
        Friday.click();
        Friday.click();
        Thread.sleep(1000);
        Friday.click();
            Thread.sleep(3000);
            driver.close();
        }

    }
