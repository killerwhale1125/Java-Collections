package generic.ex5;

import generic.ex1.Animal;
import generic.ex1.Cat;
import generic.ex1.Dog;

public class WildCardMain {
    public static void main(String[] args) {
        Box<Object> obj = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printGenericV2(dogBox);
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        WildcardEx.printWildcardV1(dogBox);
//        WildcardEx.printWildcardV2(dogBox);
        Animal animal = WildcardEx.printWildcardV3(dogBox);
    }
}
