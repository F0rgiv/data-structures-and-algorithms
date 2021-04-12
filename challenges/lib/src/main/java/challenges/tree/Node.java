package challenges.tree;

public class Node<T> {
    T value;
    Node<T> right;
    Node<T> left;

    Node(T input) {
        this.value = input;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left.value +
                ", right=" + right.value +
                '}';
    }
}
