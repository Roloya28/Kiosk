package com.example.Level2;

public class MenuItem {

    private String name;
    private double price;
    private String productInfo;


    public MenuItem(String name, double price, String productInfo) {
        this.name = name;
        this.price = price;
        this.productInfo = productInfo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductInfo() {
        return productInfo;
    }
}
