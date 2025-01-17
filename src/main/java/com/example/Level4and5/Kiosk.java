package com.example.Level4and5;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 객체 생성 및 메뉴 목록 초기화
    private List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    // Getter
    public List<Menu> getMenu() {
        return menus;
    }

    // SettER
    public void setMenu(List<Menu> menus) {
        this.menus = menus;
    }

    // 키오스크 프로그램 시작
    public void start() {
        Scanner sc = new Scanner(System.in);

        // 반복문 while 을 이용한 리스트에 메뉴를 차례대로 출력 (앞에 번호 부여 및 출력시 상품명, 가격, 제품설명 출력)
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, menus.get(i).getCategory());
            }
            System.out.println("0. 종료       | 종료");

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
                if (choice > 0 && choice <= menus.size()) {
                    // 선택한 메뉴 출력
                    Menu selectedMenu = menus.get(choice - 1);
                    menuSelection(sc, selectedMenu);
                } else { /* 메뉴 번호가 범위를 벗어난 경우 */
                    System.out.println("유효하지 않은 선택입니다. 다시 입력해주세요.");
                }
            } catch (NumberFormatException e) { /* 입력값이 숫자가 아닌 경우 */
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }
        sc.close();
    }

    // 입력받은 값의 메뉴항목 처리
    private void menuSelection(Scanner sc, Menu selectedMenu) {
        while (true) {
            selectedMenu.displayMenuItems();

            System.out.print("메뉴를 선택하세요: ");
            String input = sc.nextLine();

            // 0을 입력시 다시 초기 화면으로 돌아감
            if (input.equals("0")) {
                System.out.println("메인 메뉴로 돌아갑니다.");
                break;
            }

            // 입력 처리
            try {
                int choice = Integer.parseInt(input); /* 입력 값을 정수로 변환 */
                List<MenuItem> items = selectedMenu.getMenuItems();
                if (choice > 0 && choice <= items.size()) { /* 입력한 값이 유효한 범위 내에 있는지 확인하고 */
                    MenuItem selectedItem = items.get(choice - 1); /* 값이 맞다면 해당 번호에 맞는 메뉴를 출력 (items 리스트에서 -1 번째 항목을 가져옴 - 인덱스 0 데이터) */
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getProductInfo());
                return; /* 해당 메서드 종료 */
                } else { /* 메뉴 번호가 범위를 벗어난 경우 */
                    System.out.println("유효하지 않은 선택입니다. 다시 입력해주세요.");
                }
            } catch (NumberFormatException e) { /* 입력값이 숫자가 아닌 경우 */
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }
    }
}
