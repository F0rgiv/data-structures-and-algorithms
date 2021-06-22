package challenges.stacksandqueues;

public class Node<T> {
    T value;
    Node<T> next;

    Node(T input, Node<T> next) {
        this.value = input;
        this.next = next;
    }

    Node(T input) {
        this.value = input;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
