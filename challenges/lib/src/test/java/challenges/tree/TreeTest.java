package challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Note that these methods are tested further with additional tree structures used in the BinarySearchTreeTest file.
 */
public class TreeTest {
    Tree<Character> tree = new Tree<>();

    @Before
    public void createTree(){
        tree.root = new Node<>('h');
        tree.root.left = new Node<>('f');
        tree.root.left.left = new Node<>('c');
        tree.root.left.left.left = new Node<>('a');
        tree.root.left.left.right = new Node<>('d');
        tree.root.left.right = new Node<>('g');
        tree.root.right = new Node<>('n');
        tree.root.right.right = new Node<>('p');
        tree.root.right.left = new Node<>('j');
        tree.root.right.left.left = new Node<>('i');
        tree.root.right.left.right = new Node<>('k');
        tree.root.right.left.right.right = new Node<>('m');
        tree.root.right.left.right.right.left = new Node<>('l');
    }

    @Test
    public void breadthTraversal() {
        List<Character> result = tree.breadthTraversal();
        Character[] expected = {'h','f','n','c','g','j','p','a','d','i','k','m','l'};
        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
    }

    @Test
    public void preOrder() {
        List<Character> result = tree.preOrder();
        Character[] expected = {'h','f','c','a','d','g','n','j','i','k','m','l','p'};
        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
    }

    @Test
    public void inOrder() {
        List<Character> result = tree.inOrder();
        Character[] expected = {'a','c','d','f','g','h','i','j','k','l','m','n','p'};
        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
    }

    @Test
    public void postOrder() {
        List<Character> result = tree.postOrder();
        Character[] expected = {'a','d','c','g','f','i','l','m','k','j','p','n','h'};
        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
    }
}