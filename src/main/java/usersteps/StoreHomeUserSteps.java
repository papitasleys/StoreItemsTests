package usersteps;

import org.openqa.selenium.WebDriver;
import pages.StoreHomePage;

public class StoreHomeUserSteps {
    private StoreHomePage storeHomePage;

    public StoreHomeUserSteps(WebDriver driver){
        this.storeHomePage = new StoreHomePage(driver);
    }

    public void findLaptops(){
        storeHomePage.clickOnLaptops();
    }

    public void findDellLaptop(){
        storeHomePage.clickOnDell();
    }
}
