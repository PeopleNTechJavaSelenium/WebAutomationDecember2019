package search;

import base.CommonAPI;
import home.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import reporting.TestLogger;

public class TestSearch extends CommonAPI {

    @Test
    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clearTypeNClickOnSearch();
    }
}
