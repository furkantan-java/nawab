package com.vytrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class W3 extends PageBase{

    @FindBy (tagName = "a")
    private List<WebElement> tag;

    public void Tag (){
        for (WebElement e: tag) {
            System.out.println(e.getTagName());}
    }
}
