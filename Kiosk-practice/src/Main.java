import jdk.jshell.spi.SPIResolutionException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Kiosk.welcomePrint();
        Kiosk.menueSelecprint();
        Kiosk.menuPrint(1, "김밥", 1000);
        Kiosk.menuPrint(2, "계란김밥", 1500);
        Kiosk.menuPrint(3, "충무김밥", 1000);
        Kiosk.menuPrint(4, "라볶이", 2000);

        Kiosk selcNum = new Kiosk();
        Kiosk price = new Kiosk();
        int a = price.matchPrice(selcNum.menuNumselect());

        // 인스턴스 메서드기 대문에 각각 객체를 만들어 줬고
        // 메서드를 matchPrice 메서드를 사용해서 받은 번호를 필드에 가격과 매칭시켜줬다.
        Kiosk.menuCountprint();

        Kiosk maxcount = new Kiosk();
        Kiosk menucount = new Kiosk();

        //메뉴의 최대수량을 저장해둘 메서드를 부르기 위해 인스턴스화 했음
        //메뉴의 선택수량을 입력받아 저장해둘 메서드를 부르기 위해 인스턴스를 했음
        //그리고 그걸 저장해둘 인스턴스 변수를 max 를 만들어 뒀고
        //한번은 반복문으로 한번은 무조건 돌게 만들어주고 메서드를 호출해서 최대값을 저장해두고 그 만큼 주문 가능하다라는 것을 메시지로 출력해줄거고
        //입력받은 선택수량은 count에 담을거야


        int count;
        int max;
        do {
            max = maxcount.maxCount(99);
            System.out.printf("※최대 주문 가능 수량 : %d", max);

            count = menucount.menuCount();
            //콘솔을 통해 입력받은 값을 리턴해주는 메소드
            //조건문이 true일 때까지 반복할 것이고 조건문이 false 라는건 최대수량 이상으로 수량을 입력한 것이니까 메시지를 출력해줄거야
        } while (count > max);
        {

            int result = a * count;

            System.out.printf("[안내]주문하신 메뉴의 총 금액은 %d원 입니다.\n[안내]이용해 주셔서 감사합니다.", result);


        }
    }
}