package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;


public class AmazonStepDefinition {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {
        amazonPage.searchBox.sendKeys("iphone");
        amazonPage.searchBox.submit();
    }

    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("arama kutusunda samsung aratir")
    public void arama_kutusunda_samsung_aratir() {
        amazonPage.searchBox.sendKeys("samsung");
        amazonPage.searchBox.submit();
    }


    @When("arama kutusunda nokia aratir")
    public void aramaKutusundaNokiaAratir() {
        amazonPage.searchBox.sendKeys("nokia");
        amazonPage.searchBox.submit();
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @And("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        amazonPage.searchBox.sendKeys(str+ Keys.ENTER);
    }

}
