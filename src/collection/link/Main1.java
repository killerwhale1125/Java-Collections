package collection.link;

public class Main1 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        printAll(first);
        System.out.println(getLastNode(first));

        // 인덱스 지정 노드 가져오기
        int index = 2;
        System.out.println(getNode(first, index));
        
        // 데이터 추가
        add(first, "D");
        add(first, "E");
        System.out.println(first);
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while(x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for(int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String value) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(value);
    }
}
