package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOmePage extends BasePage{



    @FindBy(xpath = "//h1[contains(text(),'Seyahatin Tadını Çıkartın!')]")
    public WebElement seyahatinTadiniCikartin;

}
