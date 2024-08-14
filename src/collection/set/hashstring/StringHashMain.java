package collection.set.hashstring;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        char charA = 'A';
        char charB = 'B';
        System.out.println("charB = " + (int) charB);
        System.out.println("charA = " + (int) charA);

        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(hashCode(\"AB\")) = " + hashIndex(hashCode("AB")));

    }

    static int hashCode(String str) {
        char[] chars = str.toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
