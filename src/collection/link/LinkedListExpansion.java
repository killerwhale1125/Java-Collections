package collection.link;

public class LinkedListExpansion {
    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node node = new Node(e);
        if(first == null) first = node;
        else {
            Node lastNode = getLastNode();
            lastNode.next = node;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }

    public void add(int index, Object e) {
        Node node = new Node(e);
        if(index == 0) {
            node.next = first;
            first = node;
        } else {
            // 이전 노드를 찾아서 next에 추가
            Node prev = getNode(index-1);
            node.next = prev;
            prev.next = node;
        }
        size++;
    }

    public void remove(int index) {
        Node removeNode = getNode(index);
        Object removeItem = removeNode.item;
        if(index == 0) {
            first = removeNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        // 더는 삭제 노드를 참조하는 곳이 없다. 삭제 노드는 이후 GC의 대상이 되어서 제거된다.
        removeNode.item = null;
        removeNode.next = null;
        size--;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for(int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for(Node x = first; x != null; x = x.next) {
            if(o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "LinkedListExpansion{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
