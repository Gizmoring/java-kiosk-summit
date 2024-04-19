package V2;
//메뉴를 이 클래스 내에서만 접근 할 수 있게 만들겠다.
//그리고 다른곳에서 접근할 수 있게 getter를 만들어 두겠다.
public class Menu {
   private static String name;
   private static int price;



   private static int num;

    public Menu(String name, int price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public static String getName() {
        return name;
    }

    public static int getPrice() {
        return price;
    }

    public static int getNum(){return num;}
}
