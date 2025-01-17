package com.example.Level4and5;

import java.util.ArrayList;
import java.util.List;

// 객체 생성 및 메뉴 정보 설정
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

    // 메뉴 항목 추가
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // 메뉴 항목 출력
    public void displayMenuItems() {
        System.out.printf("[ %s MENU ]\n", category); // 선택별로 ~~ 메뉴인지 표시
        for (int i = 0; i < menuItems.size(); i++) { // 번호 부여
            MenuItem item = (MenuItem) menuItems.get(i);
            // 번호, 음식이름, 가격, 상품정보 차례대로 출력
            System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getProductInfo());
        }
        System.out.println("0. 뒤로가기");
    }
}
