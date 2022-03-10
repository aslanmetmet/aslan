package com.Amazon.tests;

import com.Amazon.pages.LoginPage;
import com.Amazon.pages.MainPage;
import com.Amazon.utilities.ConfigurationReader;
import com.Amazon.utilities.Driver;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTest {

  @Test
    public void amazonSingUp(){
      Driver.getDriver().get(ConfigurationReader.getProperty("api_url"));

      Faker faker=new Faker();
      LoginPage login=new LoginPage();
      MainPage page=new MainPage();


      page.startHere.click();
      login.name.sendKeys(ConfigurationReader.getProperty("name"));
      login.email.sendKeys(ConfigurationReader.getProperty("email"));
      login.password.sendKeys(ConfigurationReader.getProperty("pass"));
      login.checkPassword.sendKeys(ConfigurationReader.getProperty("pass1"));
      login.cont.click();
/*
      login.name.sendKeys(faker.name().fullName());
      login.email.sendKeys(faker.internet().emailAddress());
      login.password.sendKeys(faker.internet().password());
      login.checkPassword.sendKeys(faker.internet().password());
      login.cont.click();
*/
       // Driver.closeDriver();

    }







}
