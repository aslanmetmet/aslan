package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.junit.Assert;
import pages.BasePage;
import pages.HOmePage;
import utilities.Driver;

public class US001_StepDe {

    HOmePage page= new HOmePage();




    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String adres) {
        Driver.getDriver().get(adres);
    }

    @Then("kullanici seyahatin tadini cikartin yazisinin gorunur oldugunu dogrular")
    public void kullaniciSeyahatinTadiniCikartinYazisininGorunurOldugunuDogrular() {
        boolean isDisplayed =  page.seyahatinTadiniCikartin.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

}