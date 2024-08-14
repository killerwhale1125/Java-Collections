package collection.set.expansion;

import java.util.Arrays;
import java.util.LinkedList;

// MyHashSetV2
public class HashSetExpansion2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public HashSetExpansion2() {
        initBuckets();
    }

    public HashSetExpansion2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for(int i = 0; i< capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // O(1)
    public boolean add(Object value) {
        LinkedList<Object> bucket = buckets[hashIndex(value)];
        if(bucket.contains(value)) return false;    // O(N)이지만 데이터가 1개 또는 2개만 들어가있음
        bucket.add(value);
        size++;
        return true;
    }

    // O(N)
    public boolean contains(Object searchValue) {
        LinkedList<Object> bucket = buckets[hashIndex(searchValue)];
        return bucket.contains(searchValue); // O(N)이지만 데이터가 1개 또는 2개만 들어가있음
    }

    // O(N)
    public boolean remove(Object value) {
        LinkedList<Object> bucket = buckets[hashIndex(value)];
        // LinkedList에서 기본 숫자타입을 넣으면 그 숫자의 인덱스가 삭제된다.
        // LinkedList는 순서가 있기 때문에 참조형으로 바꿔서 삭제해야한다
        boolean remove = bucket.remove(value);
        if (remove) {
            size--;
            return true;
        } else
            return false;
    }

    public int getSize() {
        return size;
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    @Override
    public String toString() {
        return "HashSetExpansion2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
