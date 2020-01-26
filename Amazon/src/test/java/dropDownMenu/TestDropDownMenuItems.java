package dropDownMenu;

import menu.FetchDropDown;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestDropDownMenuItems extends FetchDropDown {

    @Test
    public void dropDownMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dropDown();
    }
}
