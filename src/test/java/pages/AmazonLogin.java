package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLogin extends BasePage {


    @FindBy(linkText = "Start here.")
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
