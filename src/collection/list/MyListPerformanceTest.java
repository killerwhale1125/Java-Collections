package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50000;
        addLast(new MyArrayList<>(), size);
        addLast(new MyLinkedList<>(), size);
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<size; i++) {
            list.add(i/2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }
}
