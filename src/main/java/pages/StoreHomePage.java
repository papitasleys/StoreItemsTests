package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StoreHomePage extends StoreBasePage {
    @FindBy(how = How.XPATH, using = "//a[text()='Laptops']")
    WebElement laptopsButton;

    @FindBy(how = How.XPATH, using = "//a[text()='Dell i7 8gb']")
    WebElement dellResult;

    public StoreHomePage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    public void clickOnLaptops(){
        laptopsButton.click();
    }

    public void clickOnDell(){
        dellResult.click();
    }
}
