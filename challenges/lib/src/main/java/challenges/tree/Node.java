package challenges.tree;

public class Node<T> {
    T value;
    Node<T> right;
    Node<T> left;

    Node(T input, Node<T> left, Node<T> right) {
        this.value = input;
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
}
