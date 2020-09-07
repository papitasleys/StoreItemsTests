package storetests;

import org.testng.annotations.Test;
import pages.StoreItemPage;
import usersteps.StoreCartUserSteps;
import usersteps.StoreFormUserSteps;
import usersteps.StoreHomeUserSteps;
import usersteps.StoreItemUserSteps;

public class StoreTests extends Baseclass{

    @Test
    public void buyADellLaptop(){
        driver.get("https://www.demoblaze.com/index.html#");

        StoreHomeUserSteps storeHomeUserSteps = new StoreHomeUserSteps(driver);
        storeHomeUserSteps.findLaptops();

        storeHomeUserSteps = new StoreHomeUserSteps(driver);
        storeHomeUserSteps.findDellLaptop();

        StoreItemUserSteps storeItemUserSteps = new StoreItemUserSteps(driver);
        storeItemUserSteps.addItemToCart();
      //  driver.switchTo().alert().accept();
        storeItemUserSteps.gotoCart();

        StoreCartUserSteps storeCartUserSteps = new StoreCartUserSteps(driver);
        storeCartUserSteps.placeOrder();

        StoreFormUserSteps storeFormUserSteps = new StoreFormUserSteps(driver);
        storeFormUserSteps.enterName("cosme fulanito");
        storeFormUserSteps.enterLocation("zapopan", "mexico");
        storeFormUserSteps.enterPayment("1234","01", "01");
        storeFormUserSteps.purchaseOrder();

        storeFormUserSteps = new StoreFormUserSteps(driver);
        storeFormUserSteps.finishOrder();
    }
}
