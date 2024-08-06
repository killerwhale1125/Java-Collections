package generic.ex4;

import generic.ex1.Cat;
import generic.ex1.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 200);

        ComplexBox<Dog> animalComplexBox = new ComplexBox<>();
        animalComplexBox.set(dog);

        Cat returnCat = animalComplexBox.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
