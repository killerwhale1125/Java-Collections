package generic.ex3.v1;

import generic.ex1.Cat;
import generic.ex1.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("개1", 1);
        Cat cat = new Cat("고양이1", 2);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 개 병원에 고양이 전달
        dogHospital.set(cat);

        // 개 타입 반환
        dogHospital.set(dog);
        Dog bigggerDog = (Dog) dogHospital.bigger(new Dog("개2", 3));

    }
}
