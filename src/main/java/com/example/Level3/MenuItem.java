package com.example.Level3;

public class MenuItem extends Menu {

    // 생성자
    private String name;
    private double price;
    private String productInfo;

    public MenuItem(String name, double price, String productInfo) {
        this.name = name;
        this.price = price;
        this.productInfo = productInfo;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductInfo() {
        return productInfo;
    }

    // Setter
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

