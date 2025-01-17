package com.example.Level4and5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private final List menuItems;

    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList();
    }

    // Getter
    public String getCategory() {
        return category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // Setter
    public void setCategory(String category) {
        this.category = category;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void displayMenuItems() {
        System.out.printf("[ %s MENU ]\n", category);
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = (MenuItem) menuItems.get(i);
            System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getProductInfo());
        }
        System.out.println("0. 뒤로가기");
    }
}
