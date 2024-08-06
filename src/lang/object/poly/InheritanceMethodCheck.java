package lang.object.poly;

import lang.object.Child;
import lang.object.Parent;

import java.util.ArrayList;
import java.util.List;

public class InheritanceMethodCheck {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        /**
         * List 인터페이스에서 정의한 기능만 사용할 것인데 구현체는 ArrayList로 사용할 것 이다.
         */
        List<String> list = new ArrayList<>();

        /**
         * parent.childMethod()는 불가능하다.
         * Object obj = new Child(); 에서 obj.childMethod()는 안되지 않는가?
         * Child 클래스의 메소드를 사용하고 싶다면 직접 Child클래스를 참조변수로 활용해야한다.
         */
        Parent parent = new Child();
        parent.parentMethod();
        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        /**
         * Down Casting
         */
        if(obj instanceof Dog dog) {
            dog.sound();
        } else if(obj instanceof Car car) {
            car.move();
        }
    }
}
