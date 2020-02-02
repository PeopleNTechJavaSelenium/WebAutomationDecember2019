package authentication;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAuthentication extends CommonAPI {

    @Test
    public void logIn()throws InterruptedException {
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.logInToPntForum(driver);
    }

}
