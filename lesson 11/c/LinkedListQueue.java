
public class LinkedListQueue<T> implements Queue<T> {

    private Node<T> head, tail;
    private int size;

    public LinkedListQueue() {
        head = tail = null;
        size = 0;
    }

    @Override
    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (size > 0) {
            tail.setLink(newNode);
        }
        tail = newNode;
        size++;
        if (size == 1) {
            head = newNode;
        }
    }

    @Override
    public T dequeue() throws Exception {
        if (size <= 0)
            throw new Exception("Queue is empty");
        T result = head.getValue();
        head = head.getLink();
        size--;
        if (size == 0) {
            tail = null;
        }
        return result;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        String res = "";
        Node<T> tmp = this.head;
        boolean first = true;
        while (tmp != null) {
            if (!first) {
                res += ", ";
            } else
                first = false;
            res += tmp.getValue().toString();
            tmp = tmp.getLink();
        }
        return "[" + res + "]";
    }
}
