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
        return inOrder(this.root);
    }

    private List<T> inOrder(Node<T> node) {
        List<T> result = new LinkedList<>();
        if (node == null) return result;
        result = inOrder(node.left);
        result.add(node.value);
        result = Stream.concat(result.stream(), inOrder(node.right).stream()).collect(Collectors.toList());

        return result;
    }

    public List<T> postOrder() {
        return postOrder(this.root);
    }

    private List<T> postOrder(Node<T> node) {
        List<T> result = new LinkedList<>();
        if (node == null) return result;
        result = postOrder(node.left);
        result = Stream.concat(result.stream(), postOrder(node.right).stream()).collect(Collectors.toList());
        result.add(node.value);
        return result;
    }
}
