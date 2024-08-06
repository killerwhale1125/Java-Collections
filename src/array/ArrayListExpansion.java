package array;

import java.util.Arrays;

public class ArrayListExpansion<E> {
    // 기본 수용량
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public ArrayListExpansion() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public ArrayListExpansion(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        // 코드 추가
        if(size == elementData.length) {
            grow();
        }

        elementData[size] = e;
        size++;
    }

    public void add(int index, E e) {
        // 코드 추가
        if(size == elementData.length) {
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);

        elementData[index] = e;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i -1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        // 배열 새로 생성 후 기존 배열 -> 새로운 배열 복사
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for(int i=index; i<size; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +" size=" + size + ", capacity=" + elementData.length;
    }
}
