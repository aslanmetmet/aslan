package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonMain extends BasePage{


    @FindBy(linkText = "Start here.")
    public WebElement startHere;
}

