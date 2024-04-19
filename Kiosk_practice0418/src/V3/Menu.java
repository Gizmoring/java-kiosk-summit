package V3;
//메뉴를 이 클래스 내에서만 접근 할 수 있게 만들겠다.
//그리고 다른곳에서 접근할 수 있게 getter를 만들어 두겠다.
public class Menu {
   private static String name;
   private static int price;
   private static int num;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public static String getName() {
        return name;
    }
    public static int getPrice() {
        return price;
    }


}
