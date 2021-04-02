package challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> front;
    private Node<T> back;

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (front == null) {
            front = newNode;
            back = newNode;
            return;
        }
        back.next = newNode;
        back = newNode;
    }

    public T dequeue() {
        if (front == null) throw new NoSuchElementException();
        T result = front.value;
        front = front.next;
        return result;
    }

    public T peek() {
        if (front == null) throw new NoSuchElementException();
        return front.value;
    }

    public boolean isEmpty() {
        if (front == null) return false;
        return true;
    }

    @Override
    public String toString() {
        return front.toString();
    }
}
