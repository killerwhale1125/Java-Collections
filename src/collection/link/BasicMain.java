package collection.link;

public class BasicMain {
    public static void main(String[] args) {
        LinkedListBasic list = new LinkedListBasic();
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z') = " + list.set(2, "z"));

        System.out.println("범위 초과");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        list.add("f");
        System.out.println(list);
    }
}
