public class MenuItem {
    //메뉴를 언제든지 추가할 수 있는 메뉴아이템 클래스를 만들어뒀고 이 클래스에서만 접근 가능하도록 private를 사용했고
    //필드는 이름을 나타내는 name 가격을 나타내는 int price 골랐을 때 selectNum 으로 선언해둔다
    private String name;
    private int price;
    private int selectNum;


    // 메뉴아이템을 생성할 때 이름, 가격, 선택번호를 입력하도록 생성자를 만들어 두겠다.
    // 생성자는 접근 제어자 클래스네임 강제할 매개변수를 넣어줘야한다.
    // 입력되는 시점 (호출되는 시점)에 값들을 대입해줄것이다.
    public MenuItem(String name,int price,int selectNum) {
        this.name = name;
        this.price = price;
        this.selectNum = selectNum;
    }

    //private 필드를 불러오게 하기위해서 게터를 만들어둔다 변경은 만들때 뺴고는 불가능하게 할거야!

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSelectNum() {
        return selectNum;
    }


}
