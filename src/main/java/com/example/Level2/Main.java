package com.example.Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShake", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야치가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getPriceInfo());
            }
            System.out.println("0. 종료       | 종료");

            System.out.println("메뉴를 선택하세요: ");
            String input = sc.nextLine();

            try {
                int choice = Integer.parseInt(input);

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (choice > 0 && choice <= menuItems.size()) {
                    MenuItem selectedItem = menuItems.get(choice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getPriceInfo());
                } else {
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 입력해주세요");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }
        sc.close();
    }
}