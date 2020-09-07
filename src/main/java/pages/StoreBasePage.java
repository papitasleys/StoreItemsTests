package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class StoreBasePage {
    protected WebDriver driver;
    protected String baseURL;

    public StoreBasePage(WebDriver driver, String baseURL) {
        this.driver = driver;
        this.baseURL = baseURL;
        PageFactory.initElements(driver, this);
    }
}
