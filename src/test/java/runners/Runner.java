package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@US003",
        dryRun = false
)
public class Runner {
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
