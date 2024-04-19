import java.util.Scanner;

public class Kiosk {
    //클래스에서 만들어지고 바꿀수 없게 만들거야
    // MenuItem 데이터타입의 menuitem 을 만들고 생성자를 이용해서 만들어뒀다
    private final static MenuItem menuitem = new MenuItem("삼각김밥", 2000, 1);
    private final static MenuItem menuitem2 = new MenuItem("돈까스", 5000, 2);
    private final static MenuItem menuitem3 = new MenuItem("라볶이", 3000, 3);
    // 메뉴인포 데이터타입을 이용해서 리뷰와 만들어진 날짜까지 만들어줬어
    private final static MenuInfo menuitem4 = new MenuInfo("비빔밥", 8000, 4, "경범이가 좋아하는 영천영화 비빔밥", 20240417);


    //메서드를 호출하면 번호, 이름, 가격 순으로 출력해주는 메서드를 만들것이다
    //
    static void menuSort() {
        System.out.println("1번 " + menuitem.getName() + " " + menuitem.getPrice() + "원\n" + "2번 " + menuitem2.getName() + " " + menuitem2.getPrice() + "원\n" + "3번 " + menuitem3.getName() + " " + menuitem3.getPrice() + "원\n" + "4번 " + menuitem4.getName() + " " + menuitem4.getPrice() + "원");
        System.out.println("-".repeat(40));
    }

    //숫자를 입력받아서 1~4가 아니라면 처음으로 돌아가는 반복문을 만들어서 숫자가 맞도록 만들어준다
    //여기서 심화과정으로 첫번쨰만들었던 키오스크의 불편한점인 int대신 문자열로받아서 만들어보자.

    static MenuItem menuSelect() {
        boolean numValid;
        String str1 = "";
        int a = 0;
        int b = 0;
        MenuItem menuItem = new MenuItem(str1, a, b);
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        do {
            if (str == "1" || str == "2" || str == "3" || str == "4") {
                numValid = false;
            } else {
                numValid = true;
                System.out.println("[안내]메뉴의 번호를 다시 입력해주세요\n[안내]메뉴 선택화면으로 돌아갑니다");
                str = scan.next();
            }
        } while (numValid = true);

        switch (str) {
            case "1":
                menuItem = menuitem;
                break;
            case "2":
                menuItem = menuitem2;
                break;
            case "3":
                menuItem = menuitem3;
                break;
            case "4":
                menuItem = menuitem4;
                break;

        }
        return menuItem;
    }


}








