package enumeration.nested;

public class NestedOuter {

    private static int outStaticInstanceValue = 1;
    private int outInstanceValue = 1;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println(nestedInstanceValue);

            // 바깥 클래스 인스턴스 멤버에는 접근 불가능 ( private이며 중첩 내부클래스는 전혀 다른 클래스이기 때문 )
//            System.out.println(outInstanceValue);

            System.out.println(outStaticInstanceValue);
        }
    }
}
