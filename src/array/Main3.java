package array;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayListExpansion<String> list = new ArrayListExpansion();
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
