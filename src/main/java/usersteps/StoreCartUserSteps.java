package usersteps;

import org.openqa.selenium.WebDriver;
import pages.StoreCartPage;

public class StoreCartUserSteps {
    private StoreCartPage storePage;

    public StoreCartUserSteps(WebDriver driver){
        this.storePage = new StoreCartPage(driver);
    }

    public void placeOrder(){
        storePage.clickOnCart();
    }
}
