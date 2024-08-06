package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        /**
         * 기본형은 값을 공유 X
         */

        int a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);
    }
}
