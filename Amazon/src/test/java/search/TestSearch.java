package search;

import base.CommonAPI;
import home.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {

    @Test
    public void searchItems(){
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clearTypeNClickOnSearch();
    }
}
