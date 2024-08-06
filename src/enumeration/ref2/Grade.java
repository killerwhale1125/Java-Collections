package enumeration.ref2;

/**
 * BASIC을 호출하면 public static final 정적이고 불변한 객체가 discountPercent를 포함하여 생성된다
 * static이기 때문에 재사용된다
 */
public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;


    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
