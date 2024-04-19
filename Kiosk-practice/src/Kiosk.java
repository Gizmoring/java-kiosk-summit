import java.util.Arrays;
import java.util.Scanner;

public class Kiosk {
    //안내문구를 출력해줄 메서드를 만들거야
    //안에있는 메뉴메서드로 구현해서
    //선택된 음식의 수량을 입력하는데 최대 99개까지 받을 거야 그게 넘어가면 다시 수량을 받아야해
    //입력하면 입력된 수량만큼 계산해주는 메소드도 만들거야

    //   키오스크에 들어가는 메뉴, 가격 등은 바뀔 수 있지만 안에서만 사용할 것이기 때문에
    // 클래스 변수로 만들어 고정할거야 그래야 메뉴의 변동이나 가격변동에 같이 바꿔 줄 수 있어
    private static String menu1 = "김밥";
    private static int price1 = 1000;
    private static String menu2 = "계란김밥";
    private static int price2 = 1500;
    private static String menu3 = "충무김밥";
    private static int price3 = 1000;
    private static String menu4 = "라볶이";
    private static int price4 = 2000;

    // 메뉴가 4개이니 selecNum이라는 변수로 숫자를 받아 올거야 그리고 숫자를 받아오면 그 숫자랑 가격이랑 매칭해주는 메서드도 작성 할거야
    static int selecNum1 = 1;
    static int selecNum2 = 2;
    static int selecNum3 = 3;
    static int selecNum4 = 4;

    // 받은 숫자를 저장해둘 때 쓸 변수를 하나 만들어 줄거야
    int a;

    //내가 언제든 문구를 바꿀 수 있게 출력되는 메서드로 만들거야

    public static void welcomePrint() {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다");
        System.out.println("-".repeat(40));
    }

    public static void menuCountprint() {
        System.out.println("[안내]주문하신 메뉴의 수량을 입력해주세요");
        System.out.println("-".repeat(40));
    }

    public static void menueSelecprint() {
        System.out.println("[안내]원하시는 메뉴의 번호를 입력해주세요");
        System.out.println("-".repeat(40));
    }

    // 생성자를 이용해서 키오스크 메뉴와 메뉴의 번호 가격을 정해주고 메뉴의 번호를 받으면 그 가격이 되게할거야
    // 메뉴 구성과 가격을 언제든지 수정 가능하게 만들기 위해서 메서드를 만들었다.
    public static void menuPrint(int selecNum, String menu, int price) {
        System.out.printf("%s번 %s(%d원)", selecNum, menu, price);
    }

    //입력받을 개체를 만들건데 slecNum1234가 들어오면 메뉴를 선택한 번호가 변수에 저장되게 할거야
    // 메서드로 받으면 두개를 곱해서 가격을 산출할거야

    public int menuNumselect() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        return a;
    }

    //입력받은 수량을 count에 담아둘거야

    public int menuCount() {
        int count;
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();
        return count;
    }

    //최대수량을 언제나 바꿀 수 있게 메서드로 만들어뒀다.
    public int maxCount(int max) {
        return max;
    }

    // 받은 숫자와 가격을 매칭해줄 메소드
    public int matchPrice(int a) {
        int price;
        if (a == 1) {
            price = price1;
        } else if (a == 2) {
            price = price2;
        } else if (a == 3) {
            price = price3;
        } else if (a == 4) {
            price = price4;
        } else { price = -1;
        }
        return price;
    }
}
