package generic.ex4;

import generic.ex1.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("class Name= " + animal.getClass().getName());
        System.out.println("t Name= " + t.getClass().getName());
        return t;
    }
}
