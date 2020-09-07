package usersteps;

import org.openqa.selenium.WebDriver;
import pages.StoreBuyFormPage;
import pages.StoreCartPage;

import java.util.Random;

public class StoreFormUserSteps {
    private StoreBuyFormPage storePage;

    public StoreFormUserSteps(WebDriver driver){
        this.storePage = new StoreBuyFormPage(driver);
    }

    public void enterName(String name){
        storePage.enterName(name);
    }

    public void enterLocation(String city, String country){
        storePage.enterCity(city);
        storePage.enterCountry(country);
    }

    public void enterPayment(String card, String month, String year){
        storePage.enterCard(card);
        storePage.enterMonth(month);
        storePage.enterYear(year);
    }

    public void purchaseOrder(){
        storePage.clickOnPurchase();
    }

    public void finishOrder(){
        storePage.clickOnOK();
    }

}
