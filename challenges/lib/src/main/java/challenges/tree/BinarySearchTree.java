package challenges.tree;

import challenges.stacksandqueues.Queue;

public class BinarySearchTree<T extends Comparable<T>> extends Tree<T> {
    public void add(T value) {
        if (this.root == null) {
            this.root = new Node<>(value);
            return;
        }
        add(value, this.root);
    }

    private void add(T value, Node<T> node) {
        if (node.value.compareTo(value) < 0) {
            if (node.right == null) {
                node.right = new Node<>(value);
                return;
            }
            add(value, node.right);
            return;
        }
        if (node.left == null) {
            node.left = new Node<>(value);
            return;
        }
        add(value, node.left);
    }

    public boolean contains(T value) {
        Node<T> node = this.root;
        while (node != null) {
            if (node.value == value) return true;
            if (node.value.compareTo(value) < 0) {
                node = node.right;
                continue;
            }
            node = node.left;
        }
        return false;
    }

    @Override
    public T findMaximumValue() {
        if (this.root == null) return null;
        Node<T> current = this.root;
        while (current.right != null) current = current.right;
        return current.value;
    }
}
