package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonHome extends CommonAPI {

    @Test
    public void test1() throws InterruptedException {
        System.out.println(driver.getTitle());
        typeOnElement("twotabsearchtextbox","book");
        clickOnElement(".nav-input");
        Thread.sleep(2000);
    }


}
