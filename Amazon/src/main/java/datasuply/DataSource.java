package datasuply;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Java Book");
        itemsList.add("Selenium Book");
        itemsList.add("Laptop");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("ps4games");
        itemsList.add("macAir");

        return itemsList;
    }
    //Database

    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        System.out.println(list.get(0));
    }

}
