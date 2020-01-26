package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.CSS, using = "locator")
    public static WebElement usWebElement;

    @FindBy(how = How.CSS, using = "locator")
    public static WebElement worldWebElement;

    @FindBy(how = How.CSS, using = "locator")
    public static WebElement politicsWebElement;

    @FindBy(how = How.CSS, using = "locator")
    public static WebElement businessWebElement;

    @FindBy(how = How.CSS, using = "locator")
    public static WebElement travelWebElement;

    @FindBy(how = How.CSS, using = "locator")
    public static WebElement sportsWebElement;

    public static WebElement getUsWebElement(){
        return usWebElement;
    }

    public static WebElement getWorldWebElement(){
        return worldWebElement;
    }

    public static WebElement getPoliticsWebElement(){
        return politicsWebElement;
    }

    public static WebElement getBusinessWebElement(){
        return businessWebElement;
    }

    public static WebElement getTravelWebElement(){
        return travelWebElement;
    }

    public void clickOnUsTab(){
        getUsWebElement().click();
    }
    public void clickOnWorldTab(){
        getWorldWebElement().click();
    }
    public void clickOnPoliticsTab(){
        getPoliticsWebElement().click();
    }
    public void clickOnBusinessTab(){
        getBusinessWebElement().click();
    }
    public void clickOnTravelTab(){
        getTravelWebElement().click();
    }

}
