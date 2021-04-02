package challenges.stacksandqueues;


import java.util.EmptyStackException;

public class Stack<T> {
    private Node<T> top;

    public void push(T value) {
        top = new Node<>(value, top);
    }

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T result = top.value;
        top = top.next;
        return result;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.value;
    }

    public boolean isEmpty() {
        if (top == null) return false;
        return true;
    }

    @Override
    public String toString() {
        return top.toString();
    }
}
