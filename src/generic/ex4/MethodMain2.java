package generic.ex4;

import generic.ex1.Animal;
import generic.ex1.Cat;
import generic.ex1.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 100);

        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.<Cat>checkup(cat);

        Animal bigger = AnimalMethod.bigger(dog, cat);

    }
}
