package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", //==>console da senaryolar ile ilgili ayrintilar icin kullanilir
                "html:target/default-cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml",
                "rerun:TestOutput/failed_scenario.txt"},
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@US002",
        dryRun = false,
        monochrome = true

)
public class ParallelRunner1 {
}
/*
Runner classin body si icinde birsey yazilmaz
Runner classinda önemli olan iki tane notasyon vardir
1) @RunWith ==> Runner classimiza calisma özelligi getirdi
2) @CucumberOptions ==> parantezi icinde hangi testleri calistiracagimizi,
hangi raporlari alacagimizi, features ve glue parametreleri ile bu dosyalarin pathlerini
gibi test ayrintilarini tanimlariz ve bazi pluginler ekleyebiliriz

dryRun = true ==> iken feature file daki test senaryolarini calistirmadan, eksik
stepDefinition i olup olmadigini kontrol eder, browser i calistirmaz
 */
