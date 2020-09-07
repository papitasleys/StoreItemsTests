package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StoreBuyFormPage extends StoreBasePage {
    @FindBy(how = How.CSS, using = "input#name")
    WebElement nameInput;

    @FindBy(how = How.CSS, using = "input#country")
    WebElement countryInput;

    @FindBy(how = How.CSS, using = "input#city")
    WebElement cityInput;

    @FindBy(how = How.CSS, using = "input#card")
    WebElement creditCardInput;

    @FindBy(how = How.CSS, using = "input#month")
    WebElement monthInput;

    @FindBy(how = How.CSS, using = "input#year")
    WebElement yearInput;

    @FindBy(how = How.XPATH, using = "//button[text()='Purchase']")
    WebElement purchaseBtn;

    @FindBy(how = How.XPATH, using = "//button[text()='OK']")
    WebElement okBtn;

    public StoreBuyFormPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    public void enterName(String name){
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterCountry(String country){
        countryInput.clear();
        countryInput.sendKeys(country);
    }

    public void enterCity(String city){
        cityInput.clear();
        cityInput.sendKeys(city);
    }

    public void enterCard(String card){
        creditCardInput.clear();
        creditCardInput.sendKeys(card);
    }

    public void enterMonth(String month){
        monthInput.clear();
        monthInput.sendKeys(month);
    }

    public void enterYear(String year){
        yearInput.clear();
        yearInput.sendKeys(year);
    }

    public void clickOnPurchase(){
        purchaseBtn.click();
    }

    public void clickOnOK(){
        okBtn.click();
    }
}
