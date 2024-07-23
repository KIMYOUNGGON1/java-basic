package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
        }

        if (10 >= age) {
            discount += 1000;
        }

        System.out.println("총 할인 금액 = " + discount + " 원");
    }
}
