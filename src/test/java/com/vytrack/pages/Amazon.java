package com.vytrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Amazon extends PageBase{

    @FindBy(className = "nav-search-label")
    private WebElement All;

    @FindBy(id = "searchDropdownBox")
    private WebElement Drop;

    public void All() {
        String expected = "All";
        String actual = All.getText();
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

    }

    public void Dropdown() {

    Select select = new Select(Drop);
    List<WebElement> options = select.getOptions();

    for (WebElement option : options) {
        System.out.println((option.getText()));
    }
}
}
