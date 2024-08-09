package collection.list;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> first;
    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> node = new Node<>(e);
        if(first == null) first = node;
        else {
            Node<E> lastNode = getLastNode();
            lastNode.next = node;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }

    @Override
    public void add(int index, E e) {
        Node<E> node = new Node<E>(e);
        if(index == 0) {
            node.next = first;
            first = node;
        } else {
            // 이전 노드를 찾아서 next에 추가
            Node<E> prev = getNode(index-1);
            node.next = prev;
            prev.next = node;
        }
        size++;
    }

    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if(index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        // 더는 삭제 노드를 참조하는 곳이 없다. 삭제 노드는 이후 GC의 대상이 되어서 제거된다.
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for(int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for(Node<E> x = first; x != null; x = x.next) {
            if(o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
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

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }

}
