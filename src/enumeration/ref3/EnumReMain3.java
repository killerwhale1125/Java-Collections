package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class EnumReMain3 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
//        int basic = discountService.discount(Grade.BASIC, price);
//        int gold = discountService.discount(Grade.GOLD, price);
//        int diamond = discountService.discount(Grade.DIAMOND, price);

        // 할인율 계산
        int basic = BASIC.discount(price);
        int gold = GOLD.discount(price);
        int diamond = DIAMOND.discount(price);

        Grade.values();

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
