package collection.list;

public class BatchProcessMain {

    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(100000);
    }
}
