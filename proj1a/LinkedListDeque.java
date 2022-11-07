public class LinkedListDeque<T> {

    private class Node {
        T item;
        Node next;
        Node prev;

        Node(T i, Node p, Node n) {
            item = i;
            prev = p;
            next = n;
        }

        Node(Node p, Node n) {
            prev = p;
            next = n;
        }
    }

    private int size;
    private Node sentinel;

    LinkedListDeque() {
        sentinel = new Node(null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public void addFirst(T item) {
        Node newNode = new Node(item, sentinel, sentinel.next);
        sentinel.next.prev = newNode;
        sentinel.next = newNode;
        size += 1;

    }

    public void addLast(T item) {
        Node newNode = new Node(item, sentinel.next, sentinel);
        sentinel.prev.next = newNode;
        sentinel.prev = newNode;
        size += 1;

    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        Node ptr = sentinel.next;
        while (ptr != sentinel) {
            System.out.print(ptr.item);
            System.out.print(" ");
            ptr = ptr.next;

        }

    }

    public T removeFirst() {
        if (size == 0) {
            return null;
        }

        Node newNode = new Node(sentinel.next.item, null, null);

        sentinel.next.next.prev = sentinel;
        sentinel.next = sentinel.next.next;
        size -= 1;


        return newNode.item;
    }

    public T removeLast() {
        if (size == 0) {
            return null;
        }

        Node newNode = new Node(sentinel.prev.item, null, null);

        sentinel.prev.prev.next = sentinel;
        sentinel.prev = sentinel.prev.prev;
        size -= 1;
        return newNode.item;

    }

    public T get(int index) {
        if (index >= size) {
            return null;
        }

        int count = 0;
        while (count < index) {
            sentinel = sentinel.next;
            count += 1;
        }
        return sentinel.next.item;
    }

    private T getRecursiveHelp(Node start, int index) {
        if (index == 0) {
            return (T) start.item;
        } else {
            return getRecursiveHelp(start.next, index - 1);
        }
    }

    public T getRecursive(int index) {
        if (index >= size) {
            return null;
        }
        return getRecursiveHelp(sentinel.next, index);
    }

}
