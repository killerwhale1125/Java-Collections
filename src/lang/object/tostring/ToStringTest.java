package lang.object.tostring;

public class ToStringTest {
    public static void main(String[] args) {
        Object o = new Object();
        String string = o.toString();

        /**
         * 동일한 결과
         * 내부적으로 println은 Object의 toString 을 호출한다.
         */
        System.out.println(string);
        System.out.println(o);

        Car car = new Car("람보르기니");
        Dog dog = new Dog("토리", 3);

        /** println 내부 ToString 호출 **/
        System.out.println(car);
        System.out.println(dog);

        /** Object 다형성 활용 **/
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);
    }
}
