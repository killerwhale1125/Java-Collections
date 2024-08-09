package collection.link;

public class ExpansionMain {
    public static void main(String[] args) {
        LinkedListExpansion list = new LinkedListExpansion();

        // 추가 시 O(N)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        
        // 첫번째 항목 추가 O(1)
        list.add(0, "d");
        System.out.println(list);

        // 첫번째 항목 삭제 O(1)
        list.remove(0);
        System.out.println(list);
        // 중간 항목 추가
        list.add(1, "e");
        System.out.println(list);
        // 중간 항목 삭제
        list.remove(1);
        System.out.println(list);
    }
}
