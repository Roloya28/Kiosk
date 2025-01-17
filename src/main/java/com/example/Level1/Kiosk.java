package com.example.Level1;

import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {

        // 메뉴판을 배열에 저장
        String[][] menuItems = {
                {"ShackBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"},
                {"SmokeShack", "8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"},
                {"Cheeseburger", "6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"},
                {"Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거"}
        };

        // 사용자 입력 처리
        Scanner sc = new Scanner(System.in);


        // 사용자가 명령어 0을 입력할때까지 반복수행
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");

            // 메뉴 앞에 번호 부여 및 이름, 가격, 상품 설명 출력
            for (int i = 0; i < menuItems.length; i++) {
                System.out.printf("%d. %-15s | W %.1f | %s\n", i + 1, menuItems[i][0], Double.parseDouble(menuItems[i][1]), menuItems[i][2]);
            }
            System.out.println("0. 종료         | 종료");
            System.out.println("메뉴를 선택하세요: ");
            String input = sc.nextLine();

            // 0 입력시 프로그램 종료
            if (input.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


            // 맞는 데이터를 입력햇는지 확인
            try {
                int choose = Integer.parseInt(input);
                if (choose > 0 && choose <= menuItems.length) { // 유효한 번호를 입력했을경우 선택한 메뉴 출력 ()
                    String name = menuItems[choose = 1][0];
                    double price = Double.parseDouble(menuItems[choose - 1][1]);
                    String description = menuItems[choose = 1][2];
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n", name, price, description);
                } else { // 1~menuItems.length 를 초과한 번호 입력시 오류 메세지 출력
                    System.out.println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요. \n");
                }
            } catch (NumberFormatException e) { // 번호가 아닌 글자를 입력시 요류 메세지 출력
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요. \n");
            }
        }
        sc.close();
    }
}
