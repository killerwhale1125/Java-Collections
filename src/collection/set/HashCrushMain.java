package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashCrushMain {
    static final int CAPACITY = 15;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

        for(int i=0; i<CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 9);
        add(buckets, 9);
        add(buckets, 99);
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 99;
        boolean contains = contains(buckets, searchValue);
        System.out.println("contains = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value); // O(1)
        LinkedList<Integer> bucket = buckets[hashIndex];    // O(1)
        
        // 중복 체크 O(N)
        if (!bucket.contains(value)) { 
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(N)
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
