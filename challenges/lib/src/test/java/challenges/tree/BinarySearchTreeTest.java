package challenges.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree<Character> binarySearchTree1 = new BinarySearchTree<>();
    BinarySearchTree<Integer> binarySearchTree2 = new BinarySearchTree<>();

    @Test
    public void add() {
        binarySearchTree1.add('a');
        binarySearchTree1.add('d');
        binarySearchTree1.add('c');
        binarySearchTree1.add('g');
        binarySearchTree1.add('f');
        binarySearchTree1.add('i');
        binarySearchTree1.add('l');
        binarySearchTree1.add('m');
        binarySearchTree1.add('k');
        binarySearchTree1.add('j');
        binarySearchTree1.add('p');
        binarySearchTree1.add('n');
        binarySearchTree1.add('h');

        List<Character> result = binarySearchTree1.breadthTraversal();
        Character[] expected = {'h','f','n','c','g','j','p','a','d','i','k','m','l'};
        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
        List<Character> result2 = binarySearchTree1.preOrder();
        Character[] expected2 = {'h','f','c','a','d','g','n','j','i','k','m','l','p'};
        assertArrayEquals(expected2, result2.toArray(new Character[result.size()]));
        List<Character> result3 = binarySearchTree1.inOrder();
        Character[] expected3 = {'a','c','d','f','g','h','i','j','k','l','m','n','p'};
        assertArrayEquals(expected3, result3.toArray(new Character[result.size()]));
        List<Character> result4 = binarySearchTree1.postOrder();
        Character[] expected4 = {'a','d','c','g','f','i','l','m','k','j','p','n','h'};
        assertArrayEquals(expected4, result4.toArray(new Character[result.size()]));

        binarySearchTree2.add(1);
        binarySearchTree2.add(20);
        binarySearchTree2.add(3);
        binarySearchTree2.add(4);
        binarySearchTree2.add(5);
        binarySearchTree2.add(0);
    }

    @Test
    public void contains() {
        binarySearchTree1.add('a');
        binarySearchTree1.add('d');
        binarySearchTree1.add('c');
        assertTrue(binarySearchTree1.contains('a'));
        assertTrue(binarySearchTree1.contains('c'));
        assertTrue(binarySearchTree1.contains('d'));
        assertFalse(binarySearchTree1.contains('x'));
        assertFalse(binarySearchTree1.contains('y'));
        assertFalse(binarySearchTree1.contains('z'));

        binarySearchTree2.add(1);
        binarySearchTree2.add(2);
        binarySearchTree2.add(3);
        assertTrue(binarySearchTree2.contains(1));
        assertTrue(binarySearchTree2.contains(2));
        assertTrue(binarySearchTree2.contains(3));
        assertFalse(binarySearchTree2.contains(0));
        assertFalse(binarySearchTree2.contains(30));
        assertFalse(binarySearchTree2.contains(35));
    }
}