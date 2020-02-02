package keyword;

import authentication.LogInPage;
import authentication.popup.HandlePopUp;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import searchpage.SearchPage;

import java.io.IOException;

public class Features extends CommonAPI {
    LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
    SearchPage searchPage = new SearchPage();
    HandlePopUp handlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
    public void signIn(){
       logInPage.typeUserName();
       logInPage.typePassword();
       logInPage.clickOnAuthenticate();
    }
    public void signIn(WebDriver driver1)throws InterruptedException{
        logInPage.logInToPntForumWithoutPopup(driver1);
    }
    public void registration(){
        typeByCss("testuser1", "email");
        typeByCss("abcd1234", "password");
    }

    public void search(WebDriver driver1) throws InterruptedException,IOException{
       searchPage.searchTopics(driver1);
    }

    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
        switch(featureName){
            case "signIn":
                signIn(driver1);
                break;
            case "registration":
                registration();
                break;
            case "search":
                search(driver1);
                break;
            case "popup":
                handlePopUp.handlePopUpWindowBeforeLogIn(driver1);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
