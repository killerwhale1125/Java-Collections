package generic.ex3;

import generic.ex1.Cat;
import generic.ex1.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("개1", 1);
        Cat cat = new Cat("고양이1", 2);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 개 병원에 고양이 전달
//        dogHospital.set(cat);

        // 개 타입 반환
        dogHospital.set(dog);
        Dog bigggerDog = dogHospital.bigger(new Dog("개2", 3));

    }
}
