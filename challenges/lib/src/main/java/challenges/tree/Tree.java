package challenges.tree;

import challenges.stacksandqueues.Queue;
import challenges.stacksandqueues.Stack;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tree<T> {
    Node<T> root;

    public List<T> breadthTraversal() {
        List<T> result = new LinkedList<>();
        Queue<Node<T>> queue = new Queue<>();

        if (root != null) queue.enqueue(this.root);
        while (!queue.isEmpty()) {
            Node<T> node = queue.dequeue();
            result.add(node.value);
            if (node.left != null) queue.enqueue(node.left);
            if (node.right != null) queue.enqueue(node.right);
        }
        return result;
    }

    public List<T> preOrder() {
        List<T> result = new LinkedList<>();
        Stack<Node<T>> stack = new Stack<>();

        if (root != null) stack.push(this.root);
        while (!stack.isEmpty()) {
            Node<T> node = stack.pop();
            result.add(node.value);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return result;
    }

    public List<T> inOrder() {
        List<T> result = new LinkedList<>();
        inOrder(this.root, result);
        return result;
    }

    private void inOrder(Node<T> node, List<T> list) {
        if (node == null) return;
        inOrder(node.left, list);
        list.add(node.value);
        inOrder(node.right, list);
    }

    public List<T> postOrder() {
        List<T> result = new LinkedList<>();
        postOrder(this.root, result);
        return result;
    }

    private void postOrder(Node<T> node, List<T> list) {
        if (node == null) return;
        postOrder(node.left, list);
        postOrder(node.right, list);
        list.add(node.value);
    }
}
