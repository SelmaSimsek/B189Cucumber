package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablePage {
    public DataTablePage() {
        /*
        Bu kod bu classtaki ögeleri driver ile iliskilendirir
        Bu sayede classtaki webelementlere erisebilmek icin @FindBy gibi
        PageFactory ye yardimci olan notasyonlari kullanilabilir hale getirir
         */
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='New']")
    public WebElement newButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;

    @FindBy(xpath= "//button[.='Create']")
    public WebElement createButton;

    @FindBy(xpath= "//input[@type='search']")
    public WebElement searchName;


    @FindBy(xpath= "//tbody//tr[1]//td[2]")
    public WebElement firstCell;
}

