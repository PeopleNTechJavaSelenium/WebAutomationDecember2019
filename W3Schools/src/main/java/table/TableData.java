package table;

import base.CommonAPI;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableData extends CommonAPI {

    public void readTable(){
        String name = getTextByCss(".w3-table-all.notranslate tr:nth-child(5) td:nth-child(2)");
        System.out.println(name);
    }

    public void readTableRows(){
        List<WebElement> tableWebElement = getListOfWebElementsByCss(".w3-table-all.notranslate");
        List<String> getTableData = getListOfString(tableWebElement);
        for(String st: getTableData) {
            System.out.println(st);
        }
    }
}
