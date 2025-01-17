package com.example.Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 메뉴판을 저장할 List 생성 및 데이터 저장
        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShake", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야치가 들어간 기본버거"));

        // 입력 처리를 위한 스케너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 반복문 while 을 이용한 리스트에 메뉴를 차례대로 출력 (앞에 번호 부여 및 출력시 상품명, 가격, 제품설명 출력)
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getProductInfo());
            }
            System.out.println("0. 종료       | 종료");

            System.out.println("메뉴를 선택하세요: ");
            String input = sc.nextLine();

            // 입력받은값에 따른 처리
            try {
                int choice = Integer.parseInt(input);

                // 0을 입력시 프로그램 종료
                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (choice > 0 && choice <= menuItems.size()) { // 유효한값을 입력받을시 선택한 메뉴 출력
                    MenuItem selectedItem = menuItems.get(choice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getProductInfo());
                } else { // 존재하지 않는 번호 입력시 오류 메세지
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 입력해주세요");
                }
            } catch (NumberFormatException e) { // 문자열 입력시 오류 메세지
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }
        sc.close();
    }
}