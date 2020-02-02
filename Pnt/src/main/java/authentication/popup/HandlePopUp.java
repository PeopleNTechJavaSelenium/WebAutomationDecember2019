package authentication.popup;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HandlePopUp {

    @FindBy(css = ".modal-body")
    public WebElement scholarshipPopUpWindowWebElement;
    @FindBy(css = ".fa.fa-times-circle-o")
    public WebElement scholarshipPopUpWindowCloseWebElement;


    public WebElement getScholarshipPopUpWindowWebElement() {
        return scholarshipPopUpWindowWebElement;
    }

    public void setScholarshipPopUpWindowWebElement(WebElement scholarshipPopUpWindowWebElement) {
        this.scholarshipPopUpWindowWebElement = scholarshipPopUpWindowWebElement;
    }

    public WebElement getScholarshipPopUpWindowCloseWebElement() {
        return scholarshipPopUpWindowCloseWebElement;
    }

    public void setScholarshipPopUpWindowCloseWebElement(WebElement scholarshipPopUpWindowCloseWebElement) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.scholarshipPopUpWindowCloseWebElement = scholarshipPopUpWindowCloseWebElement;
    }

    public boolean isScholarshipPopUpWindowDisplayed(WebDriver driver1, String locator){
        boolean value = CommonAPI.isPopUpWindowDisplayed(driver1, locator);
        return value;
    }
    public void closePopUpWindow(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        setScholarshipPopUpWindowCloseWebElement(scholarshipPopUpWindowCloseWebElement);
        getScholarshipPopUpWindowCloseWebElement().click();
    }

    public static void closePopUpWindow(WebDriver driver1){
        //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI.clickOnElement(".fa.fa-times-circle-o",driver1);
    }
    public void handlePopUpWindowBeforeLogIn(WebDriver driver1)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI.sleepFor(2);
        if(isScholarshipPopUpWindowDisplayed(driver1, ".modal-body")) {

            try{
                closePopUpWindow();
            }catch (Exception ex){
                closePopUpWindow(driver1);
            }
            CommonAPI.sleepFor(2);
        }
    }

}
