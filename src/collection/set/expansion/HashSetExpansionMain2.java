package collection.set.expansion;

public class HashSetExpansionMain2 {
    public static void main(String[] args) {
        HashSetExpansion2 set = new HashSetExpansion2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("CD");
        set.add("SET");
        System.out.println(set);

        System.out.println("\"A\".hashCode() = " + "A".hashCode());
        System.out.println("\"B\".hashCode() = " + "B".hashCode());
        System.out.println("\"C\".hashCode() = " + "C".hashCode());
        System.out.println("\"CD\".hashCode() = " + "CD".hashCode());
        System.out.println("\"SET\".hashCode() = " + "SET".hashCode());
        System.out.println(set);

        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);
    }
}
