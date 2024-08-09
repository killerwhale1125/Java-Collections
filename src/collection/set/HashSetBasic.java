package collection.set;

import java.util.Arrays;

public class HashSetBasic {

    private int[] elementData = new int[10];
    private int size = 0;

    // O(N)
    public boolean add(int value) {
        if(contains(value)) {
            return false;
        }

        elementData[size] = value;
        size++;
        return true;
    }

    // O(N)
    public boolean contains(int value) {
        for (int data : elementData) {
            if(data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "HashSetBasic{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
