package collection.set.expansion;

public class HashSetExpansionMain {
    public static void main(String[] args) {
        HashSetExpansion set = new HashSetExpansion();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);

        System.out.println("set = " + set);

        int searchValue = 9;
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + searchValue + " = " + contains);

        boolean remove = set.remove(searchValue);
        System.out.println("remove = " + remove);
        System.out.println("set = " + set);
    }
}
