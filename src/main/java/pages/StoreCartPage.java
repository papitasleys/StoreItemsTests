package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreCartPage extends StoreBasePage {
    @FindBy(how = How.XPATH, using = "//button[text()='Place Order']")
    private WebElement placeOrderBtn;

    @FindBy(how = How.XPATH, using = "//a[text()='Delete']")
    private WebElement deleteItemBtn;

    public StoreCartPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    public void clickOnCart(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(deleteItemBtn));
        placeOrderBtn.click();
    }
}
