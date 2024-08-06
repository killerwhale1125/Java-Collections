package generic.ex5;

import generic.ex1.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }
    /**
     * T는 Animal 상속했기 때문에 매개변수로 넘어오는 값도 Animal의 자식
     */
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    /** Wild Card **/

    /**
     * ?는 아무거나 다 들어올 수 있음
     * Box<Dog> Box<Cat>
     */
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("? = " + animal.getName());
    }

    static Animal printWildcardV3(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("? = " + animal.getName());
        return animal;
    }
}
