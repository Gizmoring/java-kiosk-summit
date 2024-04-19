public class MenuInfo extends MenuItem {

//    MenuInfo 클래스타입을로 생성되는 필드에는 review, 제조년월을 알아볼 수 있는 madeDate 를 만들어줄거
// 인스턴스를 만들어서 메서드를 호출하면 리뷰를 출력해줄거야

    public static int madeDate;
    private static String review;

    public MenuInfo(String name, int price, int selectNum) {
        super(name, price, selectNum);
        this.review = review;
        this.madeDate = madeDate;
    }

    //메뉴인포 클래스를 통해서 만들어지는 인스턴스들은 위 아래의 생성자를 가지도록 강제할거야
    public MenuInfo(String name, int price, int selectNum,String review, int madeDate) {
        super(name, price, selectNum);
        this.review = review;
        this.madeDate = madeDate;
    }

    // 인스턴스가 만들어 질 떄
    public String infoPrint(){
            return MenuInfo.review;
    }




}
