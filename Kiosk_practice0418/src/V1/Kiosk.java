//package V1;
//
//import java.util.Scanner;
////메뉴는 선택해도 각각 다른 걸 선택하는게 아니기때문에 어플리케이션에서 접근이 불가능하게 따로 클래스를 만들고 그 안에서만 접근하게 만들어 줄것이다.
////근데 만들 때 받을 속성으로 금액, 이름은 필수로 들어가게 생성자를 만들어줄것이다.
////그리고 기능들도 클래스를 따로 만들어서 넣어 두겠다
////무언가를 입력받아서 내가 문자열을 입력했을 때 출력만 해주는 클래스를 따로 만들것이다.
//
//public class Kiosk {
//
//    private final static String menuName1 = "김밥";
//    private final static String menuName2 = "계란김밥";
//    private final static String menuName3 = "충무김밥";
//    private final static String menuName4 = "떡볶이";
//    private final static int price1 = 1000;
//    private final static int price2 = 1500;
//    private final static int price3 = 1000;
//    private final static int price4 = 2000;
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int menuNum = 0;
//        int count = 0;
//        int menuSelect;
//        int price = 0;
//
//        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
//        System.out.println("-".repeat(40));
//
//        do {
//            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
//            System.out.println("1) 김밥(1000원)\n2) 계란김밥(1500원)\n3) 충무김밥(1000원)\n4) 떡볶이(2000원)");
//            menuNum = Integer.parseInt(scan.nextLine());
//            if (menuNum < 0 || menuNum > 4){
//                System.out.println("[안내] 메뉴에 포함된 번호를 입력하여 주세요.\n");
//            }
//        }while (menuNum < 0 || menuNum > 4);
//
//        do {System.out.println("-".repeat(40));
//            System.out.println("[안내]원하시는 메뉴의 수량을 입력하여 주세요.");
//            System.out.println("(※ 최대 주문 가능 수량 : 99)");
//            count = scan.nextInt();
//            if (count < 0 || count > 99){
//                System.out.println("[경고]"+count+"개는 입력하실 수 없습니다.\n[경고]수량 선택 화면으로 돌아갑니다.");
//            }
//        }while (count < 0 || count > 99);
//
//        switch (menuNum){
//            case 1:
//                price = price1;
//                break;
//            case 2:
//                price = price2;
//                break;
//            case 3:
//                price = price3;
//                break;
//            case 4:
//                price = price4;
//                break;
//        }
//        System.out.println("[안내]주문하신 메뉴의 총 금액은"+price*count+"원 입니다.\n이용해주셔서 감사합니다.");
//    }
//
//}
