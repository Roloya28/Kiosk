# 키오스크 만들기 프로젝트 [Spring] 5기 챕터2 과제

### 프로젝트 소개 

- 기초적인 흐름 제어 및 객체 지향 설계 개념을 복습하고 연습하는 차원에서 키오스크를 만들어보자

> 프로젝트 취지

 → 클래스의 개념을 이해하고, 객체 지향 설계를 활용해보자 (자바 문법의 실습과 객체 지향 개념의 적용)

### 기능 가이드

**1. LV1 - 필수 (진행완료)**
   
- 기본적인 키오스크를 프로그래밍해보자 <br />
  └ Scanner 활용법, 조건문, 반복문을 재확인하며 입력 데이터를 처리하는 방법 강화
  <br />

**2. LV2 - 필수 (진행완료)**

- 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기 <br />
 └ 햄버거 메뉴를 MenuItem 클래스와 List 를 통해 관리
<br />

**3. LV3 - 필수 (진행완료)**

- 객체 지향 설계를 적용해 순서 제어를 클래스로 관리하기 <br />
 └ 객체 지향 개념을 학습하고, 데이터를 구조적으로 관리하며, 프로그램을 설계하는 방법을 익혀보자
<br />

**4. LV4 - 필수 (진행완료)**

- 객체 지향 설계를 적용해 음식 메뉴와 주문 내역을 클래스 기반으로 관리하기
<br />

**5. LV5 - 필수 (진행완료)**

- 캡슐화 적용하기 <br />
 └ MenuItem, Menu 그리고 Kiosk 클래스의 필드에 직접 접근하지 못하도록 설정하자 <br />
※ Getter 와 Setter 메서드를 사용해 데이터를 관리해보자
<br />

**6. LV6 - 도전기능 (미진행)**

- 장바구니 및 구매하기 기능을 추가하기 <br />
 └ 클래스 간 연계를 통해 객체 지향 프로그래밍의 기본적인 설계를 익히고, <br />
&emsp;사용자 입력에 따른 프로그램 흐름 제어와 상태 관리를 학습해보자 <br />
<br />

**7. LV7 - 도전기능 (미진행)**

- Enum, 람다 & 스트림을 활용한 주문 및 장바구니 관리 <br />
 └ 고급 자바 기능을 활용해 프로그램의 효율성과 코드의 가독성을 개선해보자 <br />
<br />

### 결과물 소개

**키오스크 - LV1**

- 햄버거 메뉴 출력 및 선택하기

▶ 작성 코드 바로가기 - <br />
https://github.com/Roloya28/Kiosk/blob/master/src/main/java/com/example/Level1/Kiosk.java

<br />

**키오스크 - LV2**

- MenuItem 객체 생성 후, 유효값 세팅 및 List 선언으로 여러 MenuItem 을 추가
- 반목문을 활용해 menuItems 를 탐색하면서 하나씩 접근

▶ 작성 코드 바로가기 - <br />
https://github.com/Roloya28/Kiosk/tree/master/src/main/java/com/example/Level2
   
<br />

**키오스크 - LV3**

- 'Kiosk' 클래스 생성하기
  └ 'MenuItem'을 관리하는 리스트가 필드로 존재한다.
  └ 'main' 함수에ㅓ 관리하던 입력과 반복문 로직은 이제 'start' 함수를 만들어 관리
  └ 'List<MenuItem> menuItems 는 'Kiosk' 클래스 생성자를 통해 값을 할당한다.

▶ 작성 코드 바로가기 - <br />
https://github.com/Roloya28/Kiosk/tree/master/src/main/java/com/example/Level3
   
<br />

**키오스크 - LV4 ~ 5**

- List<MenuItem>은 'Kiosk' 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경
- 여러 버거들을 포함하는 상위 개념 '버거' 같은 '카테고리 이름' 필드를 갖는다.

▶ 작성 코드 바로가기 - <br />
https://github.com/Roloya28/Kiosk/tree/master/src/main/java/com/example/Level4and5
   
<br />


**참조자료**

- Java 문법 종합반 강의, '계산기 만들기' 과제

<br />

**마치며**

이번에 진행한 'Kiosk 만들기' 과제는 지난번 '계산기 만들기' 과제보다는 순탄하게 진행이 되었다.

하지만 중간중간 문법을 잘못 작성하여 꼬인 코드를 찾아내는데 한세월을 소비하는 자신을 볼때는 아직

기본이 많이 부족하다는점을 느낀다. 다음 과제 전까지 꾸준히 기본기를 탄탄히 쌓아 

초보적인 실수를 줄이는데 중점을 두도록 해보자.
