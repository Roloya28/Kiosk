package com.example.Level4and5;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Menu> getMenu() {
        return menus;
    }

    public void setMenu(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, menus.get(i).getCategory());
            }
            System.out.println("0. 종료       | 종료");

            System.out.print("메뉴를 선택하세요: ");
            String input = sc.nextLine();

            if (input.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            try {
                int choice = Integer.parseInt(input);
                if (choice > 0 && choice <= menus.size()) {
                    Menu selectedMenu = menus.get(choice - 1);
                    menuSelection(sc, selectedMenu);
                } else {
                    System.out.println("유효하지 않은 선택입니다. 다시 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }
        sc.close();
    }

    private void menuSelection(Scanner sc, Menu selectedMenu) {
        while (true) {
            selectedMenu.displayMenuItems();

            System.out.print("메뉴를 선택하세요: ");
            String input = sc.nextLine();

            if (input.equals("0")) {
                System.out.println("메인 메뉴로 돌아갑니다.");
                break;
            }

            try {
                int choice = Integer.parseInt(input);
                List<MenuItem> items = selectedMenu.getMenuItems();
                if (choice > 0 && choice <= items.size()) {
                    MenuItem selectedItem = items.get(choice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getProductInfo());
                return;
                } else {
                    System.out.println("유효하지 않은 선택입니다. 다시 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }
    }
}
