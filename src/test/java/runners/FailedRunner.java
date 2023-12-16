package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//==> console da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt" },
        features = "@TestOutput/failed_scenario.txt",
        glue = {"stepDefinitions","hooks"},
        dryRun = false,
        monochrome = true

)
public class FailedRunner {
}
/*
    rerun plugini ile fail olan scenariolari burada belirtmis oldugumuz failed_scenario.txt dosyasi icinde tutabiliriz

    Bu classda sadece fail olan test scenariolarini calistiracağız
    Sadece txt dosyasindaki fail olan scenariolar calistirilacağı icin tags parametresine gerek yoktur



 */
