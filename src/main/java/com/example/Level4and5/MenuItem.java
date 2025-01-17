package com.example.Level4and5;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

}