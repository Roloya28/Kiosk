package com.example.Level3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List menuItem;

    public Kiosk(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItem.size(); i++) {
                MenuItem item = (MenuItem) menuItem.get(i);
                System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getProductInfo());
            }
            System.out.println("0. 종료          | 종료");

            // 사용자 입력 처리
            System.out.print("메뉴를 선택하세요: ");
            String input = sc.nextLine();

            // 종료 조건
            if (input.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 메뉴 선택 처리
            try {
                int choice = Integer.parseInt(input); // 입력 값을 정수로 변환
                if (choice > 0 && choice <= menuItem.size()) {
                    // 선택한 메뉴 출력
                    MenuItem selectedItem = (MenuItem) menuItem.get(choice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getProductInfo());
                } else {
                    // 메뉴 번호가 범위를 벗어난 경우
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 입력해주세요.\n");
                }
            } catch (NumberFormatException e) {
                // 입력값이 숫자가 아닌 경우
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }

        sc.close();
    }
}