package dynamictable;

import org.testng.annotations.Test;
import table.TableData;

public class TestTableData extends TableData {

    @Test
    public void table(){
        readTableRows();
    }
}
