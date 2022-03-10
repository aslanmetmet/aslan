package com.Amazon.pages;

import com.Amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(linkText = "Start here.")
    public WebElement startHere;

}
