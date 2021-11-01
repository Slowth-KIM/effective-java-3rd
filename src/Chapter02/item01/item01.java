package Chapter02.item01;

public class item01 {

    /**
     * 생성자 대신에 static factory method를 이용하자.
    * */
    private int itemId;
    private String itemName;

    public item01(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public static item01 from(int itemId, String itemName){
        return new item01(itemId, itemName);
    }

    public static void main(String[] args) {
        item01 product = item01.from(1, "과자");

        System.out.println("product = " + product.itemId);
    }

}

