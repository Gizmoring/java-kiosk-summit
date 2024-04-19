package V2;

import java.util.Scanner;
//메뉴는 선택해도 각각 다른 걸 선택하는게 아니기때문에 어플리케이션에서 접근이 불가능하게 따로 클래스를 만들고 그 안에서만 접근하게 만들어 줄것이다.
//근데 만들 때 받을 속성으로 금액, 이름은 필수로 들어가게 생성자를 만들어줄것이다.
//그리고 기능들도 클래스를 따로 만들어서 넣어 두겠다
//무언가를 입력받아서 내가 문자열을 입력했을 때 출력만 해주는 클래스를 따로 만들것이다.

public class Kiosk {
    private final static String menuName1 = "김밥";
    private final static String menuName2 = "계란김밥";
    private final static String menuName3 = "충무김밥";
    private final static String menuName4 = "떡볶이";
    private final static int price1 = 1000;
    private final static int price2 = 1500;
    private final static int price3 = 1000;
    private final static int price4 = 2000;

    private static int maxcount = 100;

    public static void wellcomeMassagePrint() {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("-".repeat(40));
    }

    public static void menuMassagePrint() {
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        System.out.println("1) 김밥(1000원)\n2) 계란김밥(1500원)\n3) 충무김밥(1000원)\n4) 떡볶이(2000원)");
    }
    public static void resultMassagePrint(int result){
        System.out.println("[안내]총 가격은"+result+"원입니다\n감사합니다 이용을 종료합니다");
    }

    public static void countMassagePrint() {
        System.out.println("[안내]원하시는 메뉴의 수량을 입력하여 주세요.");
    }

    public static void maxcountMassagePrint() {
        System.out.printf("(※ 최대 주문 가능 수량 : %d)", maxcount);
    }

    public static int menuSelectNum() {
        Scanner scan = new Scanner(System.in);
        int menuNum = 0;
        do {
            menuNum = Integer.parseInt(scan.nextLine());

            if (menuNum < 0 || menuNum > 4) {
                System.out.println("[안내] 메뉴에 포함된 번호를 입력하여 주세요.");
            } else {
                return menuNum;
            }
        } while (menuNum < 0 || menuNum > 4);

        return menuNum;
    }

    public static int menuCountNum() {
        Scanner scan = new Scanner(System.in);
        int count;
        int userCount;

        do {
            maxcountMassagePrint();
            System.out.println("\n");
            countMassagePrint();
            userCount = scan.nextInt();

            if (userCount < 0 || userCount > 100) {
                System.out.println("[경고]" + userCount + "개는 입력하실 수 없습니다.\n[경고]수량 선택 화면으로 돌아갑니다.");
            } else {
                return userCount;
            }
        }
        while (userCount < 0 || userCount > 100);

        return userCount;
    }

    public static int menuPrice(int a) {
        int price = 0;

        switch (a) {
            case 1:
                price = price1;
                break;
            case 2:
                price = price2;
                break;
            case 3:
                price = price3;
                break;
            case 4:
                price = price4;
                break;
        }
        return price;
    }

    public static int totalPrice(int a, int b) {
        return a * b;
    }
}
