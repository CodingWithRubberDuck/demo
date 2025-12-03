package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    //ObservableList<Item> itemList = FXCollections.observableArrayList();


    List<Item> itemList = new ArrayList<>();


    public void addItem(){
        itemList.add(new Item("Generic", 0.69));
    }

    public int listLength(){
        return itemList.size();
    }

    public void removeItem(){
        itemList.removeFirst();
    }

    public String listOfItems(){
        StringBuilder items = new StringBuilder();
        for (Item item : itemList){
            items.append(item.printToInventory());
        }
        return items.toString();
    }

}

