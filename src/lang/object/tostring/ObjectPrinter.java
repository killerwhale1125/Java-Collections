package lang.object.tostring;

public class ObjectPrinter {
    /**
     * 다형적 참조 사용
     * print(Car car) 라면 ObjectPrinter는 Car에 의존하게 되는 것
     * Object 최상위 클래스를 사용하여 다형성을 매우 잘 활용하는 좋은 예
     * OCP 원칙을 위반하지 않음
     */
    public static void print(Object obj) {
        String string = "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }
}
