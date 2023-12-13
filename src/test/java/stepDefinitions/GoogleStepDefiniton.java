package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepDefiniton {

    GooglePage  googlePage = new GooglePage();

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @When("google arama kutusunda {string} aratir")
    public void googleAramaKutusundaAratir(String str) {
        googlePage.searchBox.sendKeys(str+ Keys.ENTER);
    }
}
