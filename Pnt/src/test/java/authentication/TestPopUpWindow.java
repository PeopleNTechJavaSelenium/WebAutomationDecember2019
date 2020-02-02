package authentication;

import authentication.popup.HandlePopUp;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestPopUpWindow extends CommonAPI {

    @Test
    public void testPopUp()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HandlePopUp handlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
    }
}
