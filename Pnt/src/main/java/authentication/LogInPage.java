package authentication;

import authentication.popup.HandlePopUp;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    @FindBy(css = "#globl-cont a")
    public WebElement loginButtonElement;

    @FindBy(css = ".input_text")
    public WebElement userNameInputField;

    @FindBy(css = ".input_password")
    public WebElement passwordInputField;

    @FindBy(css = ".button_submit")
    public WebElement clickButtonElement;

    public WebElement getClickButtonElement() {
        return clickButtonElement;
    }

    public void setClickButtonElement(WebElement clickButtonElement) {
        this.clickButtonElement = clickButtonElement;
    }

    public WebElement getUserNameInputField() {
        return userNameInputField;
    }

    public void setUserNameInputField(WebElement userNameInputField) {
        this.userNameInputField = userNameInputField;
    }

    public WebElement getPasswordInputField() {
        return passwordInputField;
    }

    public void setPasswordInputField(WebElement passwordInputField) {
        this.passwordInputField = passwordInputField;
    }

    public WebElement getLoginButtonElement() {
        return loginButtonElement;
    }

    public void setLoginButtonElement(WebElement loginButtonElement) {
        this.loginButtonElement = loginButtonElement;
    }

    public void clickOnLogInButton(){

        getLoginButtonElement().click();
    }
    public void clickOnLogInButton(WebDriver driver1){
        CommonAPI.clickOnElement("#globl-cont a",driver1);
    }
    public void typeUserName(){
        getUserNameInputField().sendKeys("testuser1");
    }
    public void typeUserName(WebDriver driver1){
        CommonAPI.typeOnElementNEnter(".input_text","testuser1",driver1);
    }
    public void typePassword(){
        getPasswordInputField().sendKeys("abcd1234");
    }
    public void typePassword(WebDriver driver1){
        CommonAPI.typeOnElementNEnter(".input_password","abcd1234",driver1);
    }
    public void clickOnAuthenticate(){
        getClickButtonElement().click();
    }
    public void clickOnAuthenticate(WebDriver driver1){
        CommonAPI.clickOnElement(".button_submit",driver1);
    }

    public void logInToPntForum(WebDriver driver1)throws InterruptedException{
        HandlePopUp handlePopUp = PageFactory.initElements(driver1, HandlePopUp.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver1);
        CommonAPI.sleepFor(2);
        clickOnLogInButton();
        CommonAPI.handleNewTab(driver1);
        typeUserName();
        typePassword();
        clickOnAuthenticate();
    }
    public void logInToPntForumWithoutPopup(WebDriver driver1)throws InterruptedException{
        clickOnLogInButton(driver1);
        CommonAPI.handleNewTab(driver1);
        typeUserName(driver1);
        typePassword(driver1);
        clickOnAuthenticate(driver1);
    }
}
