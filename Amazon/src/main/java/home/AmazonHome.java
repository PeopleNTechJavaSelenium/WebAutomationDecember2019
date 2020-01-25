package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AmazonHome extends CommonAPI {

    @Test
    public void test1() throws InterruptedException {
        System.out.println(driver.getTitle());
        List<String> list = getItems();
        for(int i=0; i<list.size(); i++){
            clearField("twotabsearchtextbox");
            typeOnElement("twotabsearchtextbox",list.get(i));
            clickOnElement(".nav-input");
        }
        //Thread.sleep(1000);
    }

    public List<String> getItems(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("books");
        itemsList.add("iPhone");
        itemsList.add("Honey");
        itemsList.add("car");

        return itemsList;

    }


}
