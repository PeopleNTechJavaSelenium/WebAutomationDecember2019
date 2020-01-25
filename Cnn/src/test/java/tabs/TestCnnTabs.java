package tabs;

import base.CommonAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCnnTabs extends CommonAPI {

    @Test
    public void usTabs(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnUsTab();
    }
    @Test
    public void worldTabs(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnWorldTab();
    }
    @Test
    public void politicsTabs(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnPoliticsTab();
    }
    @Test
    public void travelTabs(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnTravelTab();
    }
    @Test
    public void businessTabs(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnBusinessTab();
    }
}
