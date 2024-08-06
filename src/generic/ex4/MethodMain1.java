package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object o = GenericMethod.objMethod(i);

        int number = GenericMethod.numberExtendsMethod(3);
        GenericMethod.<Integer>genericMethod(i);
    }
}
