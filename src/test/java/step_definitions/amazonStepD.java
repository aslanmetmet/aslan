package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.AmazonLogin;
import pages.AmazonMain;
import utilities.Driver;

public class amazonStepD {

    AmazonLogin login=new AmazonLogin();
    AmazonMain page= new AmazonMain();

    @Given("user is on signup page {string}")
    public void userIsOnSignupPage(String url) {
        Driver.getDriver().get(url);
    }

    @And("user click to account checkbox")
    public void userClickToAccountCheckbox() {
        page.startHere.click();
    }

    @And("user enter name {string}")
    public void userEnterName(String adres) {
        login.name.sendKeys(adres);
    }

    @And("user enter email {string}")
    public void userEnterEmail(String email) {login.email.sendKeys(email);
    }

    @And("user enter password {string}")
    public void userEnterPassword(String password) {login.password.sendKeys(password);
    }

    @And("user enter re-password {string}")
    public void userEnterRePassword(String repassword) {login.checkPassword.sendKeys(repassword);
    }

    @And("user click to continue checkbox")
    public void userClickToContinueCheckbox() {login.cont.click();
    }

}
