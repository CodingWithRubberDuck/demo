package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.scene.control.TextArea;

public class HelloController {

    Inventory inventory = new Inventory();


    @FXML
    private TextArea inventoryListTextArea;


    @FXML
    private Label inventoryLengthLabel;

    @FXML
    protected void onClickAddItemButton(){
        inventory.addItem();
        update();
        inventoryListTextArea.setText(inventory.listOfItems());
    }

    @FXML
    protected void onClickRemoveItemButton(){
        inventory.removeItem();
        update();
    }

    private void update(){
        inventoryLengthLabel.setText("items: " + inventory.listLength());
    }

}
