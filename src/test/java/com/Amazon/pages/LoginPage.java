package com.Amazon.pages;

import com.Amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (linkText = "Start here.")
    public WebElement startHere;

    @FindBy(id="ap_customer_name")
    public WebElement name;

    @FindBy(id="ap_email")
    public WebElement email;

    @FindBy(id="ap_password")
    public WebElement password;

    @FindBy(id="ap_password_check")
    public WebElement checkPassword;

    @FindBy(id="continue")
    public WebElement cont;


}
