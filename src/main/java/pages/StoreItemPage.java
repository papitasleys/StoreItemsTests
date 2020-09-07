package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StoreItemPage extends StoreBasePage {
    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-success btn-lg']")
    WebElement addtoCartButton;

    @FindBy(how = How.XPATH, using = "//a[@id='cartur']")
    WebElement cartButton;

    public StoreItemPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    public void clickOnAddtoCart(){
        addtoCartButton.click();
    }

    public void clickOnCart(){
        cartButton.click();
    }
}
