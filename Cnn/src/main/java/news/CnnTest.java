package news;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CnnTest extends CommonAPI {

    @Test
    public  void newsUpdate() throws InterruptedException {
        driver.findElement(By.cssSelector(".nav-linksstyles__NavLink-sc-1tike8v-1 fxRQgN li:nth-child(4)")).click();
        Thread.sleep(2000);
    }
}
