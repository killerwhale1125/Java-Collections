package generic.ex3.v2;

public interface AnimalHospitalInterface<T> {
    void set(T animal);

    void checkup();

    T bigger(T target);
}
