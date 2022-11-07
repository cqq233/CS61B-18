public class ArrayDeque<T> {

    private T[] items;
    private int size;

    public ArrayDeque() {
        items = (T[]) new Object[8];
        size = 0;
    }

    public void addLast(T x) {
        if (size >= items.length) {
            resize(size + 1);
        }

        items[size] = x;
        size += 1;
    }
    

    public T getLast() {
        T ret = items[size - 1];
        return ret;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            return null;
        }

        T ret = items[index];
        return ret;
    }

    public int size() {
        return size;
    }

    public T removeLast() {
        if (size == 0) {
            return null;
        }

        T ret = items[size - 1];
        size -= 1;

        return ret;
    }

    private void resize(int capacity) {
        T[] newItems = (T[]) new Object[capacity];
        System.arraycopy(items, 0, newItems, 0, size);
        items = newItems;
    }

    public static void main(String[] args) {

    }
}
