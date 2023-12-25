package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import pages.RobotPage;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotStepDefinition {
    public RobotStepDefinition() throws AWTException {
    }

    @Test
    public void name() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.delay(3000);
    }
    RobotPage robotPage = new RobotPage();

    @When("yuklenmek istenen dosyayi yukler")
    public void yuklenmekIstenenDosyayiYukler() {
        robotPage.selectButton.click();
    }


    @Then("dosyanin basariyla yuklendigini test eder")
    public void dosyaninBasariylaYuklendiginiTestEder() {
        Assert.assertTrue(robotPage.verify.isDisplayed());
    }
}
