package lang.object;

public class Child extends Parent {
    public void childMethod() {
        System.out.println("Child.childMethod");
    }

    public static void staticChild() {
        System.out.println("This is Child static");
    }

    @Override
    public void parentMethod() {
        System.out.println("childMethod Override");
    }
}
