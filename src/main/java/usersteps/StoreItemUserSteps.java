package usersteps;

import org.openqa.selenium.WebDriver;
import pages.StoreHomePage;
import pages.StoreItemPage;

public class StoreItemUserSteps {
    private StoreItemPage storePage;

    public StoreItemUserSteps(WebDriver driver){
        this.storePage = new StoreItemPage(driver);
    }

    public void addItemToCart(){
        storePage.clickOnAddtoCart();
    }

    public void gotoCart(){
        storePage.clickOnCart();
    }
}
