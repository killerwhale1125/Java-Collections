package generic.ex5;

import generic.ex1.Animal;
import generic.ex1.Cat;
import generic.ex1.Dog;

public class WildCardmain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(animalBox);
        writeBox(objectBox);
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
