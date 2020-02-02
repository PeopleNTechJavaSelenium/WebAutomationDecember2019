package searchpage;

import authentication.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
    @FindBy(css = "#button_search")
    public WebElement clickOnSearchTabWebElement;

    @FindBy(css = ".input_text")
    public WebElement searchInputFieldWebElement;

    @FindBy(css = ".button_submit")
    public WebElement clickOnSearchButtonWebElement;

    public WebElement getClickOnSearchTabWebElement() {
        return clickOnSearchTabWebElement;
    }

    public void setClickOnSearchTabWebElement(WebElement clickOnSearchTabWebElement) {
        this.clickOnSearchTabWebElement = clickOnSearchTabWebElement;
    }

    public WebElement getSearchInputFieldWebElement() {
        return searchInputFieldWebElement;
    }

    public void setSearchInputFieldWebElement(WebElement searchInputFieldWebElement) {
        this.searchInputFieldWebElement = searchInputFieldWebElement;
    }

    public WebElement getClickOnSearchButtonWebElement() {
        return clickOnSearchButtonWebElement;
    }

    public void setClickOnSearchButtonWebElement(WebElement clickOnSearchButtonWebElement) {
        this.clickOnSearchButtonWebElement = clickOnSearchButtonWebElement;
    }

    public void clickOnSearchMenu(){
        getClickOnSearchTabWebElement().click();
    }
    public void typeOnSearchInputField(){
        getSearchInputFieldWebElement().sendKeys("Selenium");
    }
    public void clickOnSearchButton(){
        getClickOnSearchButtonWebElement().click();
    }
    public void searchTopics(WebDriver driver1)throws InterruptedException{
        LogInPage logInPage = new LogInPage();
        logInPage.logInToPntForum(driver1);
        clickOnSearchMenu();
        typeOnSearchInputField();
        clickOnSearchButton();
    }

}
