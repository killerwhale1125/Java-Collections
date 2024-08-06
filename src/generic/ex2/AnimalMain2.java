package generic.ex2;

import generic.ex1.Animal;
import generic.ex1.Cat;
import generic.ex1.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("개", 1);
        Cat cat = new Cat("고양이", 2);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal animal1 = animalBox.get();

        System.out.println(animal1.getName());
    }
}
