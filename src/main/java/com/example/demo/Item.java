package com.example.demo;

public class Item {

    private String name;
    private double weight;


    public Item (String name, double weight){
        this.name = name;
        this.weight = weight;
    }


    public String printToInventory(){
        return "Item Name: " + name + ";  Weight: " + weight;
    }

}
