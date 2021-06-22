package challenges.tree;

public class Node<T> {
    T value;
    Node<T> right;
    Node<T> left;

    public Node(T input) {
        this.value = input;
    }

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.right = right;
        this.left = left;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left.value +
                ", right=" + right.value +
                '}';
    }

    public T getValue() {
        return value;
    }

    public Node<T> getRight() {
        return right;
    }

    public Node<T> getLeft() {
        return left;
    }
}
