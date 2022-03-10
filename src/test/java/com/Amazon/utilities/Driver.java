package com.Amazon.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private  static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();



            }
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        return driver;
        }






    public static void closeDriver(){
        if(driver!=null){
            driver.close();
            driver=null;

        }

    }


}
