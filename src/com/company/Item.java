package com.company;

public class Item {

    String name;
    double price;

    public Item(){

    }
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }//constructor

    void printDetail() {
        System.out.println("The item is: " + name + " ,The price is: " + price);
    }


}

