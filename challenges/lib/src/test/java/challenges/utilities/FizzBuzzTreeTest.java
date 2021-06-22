package challenges.utilities;

import challenges.tree.Node;
import challenges.tree.Tree;
import org.junit.Test;

import java.util.List;

import static challenges.utilities.FizzBuzzTree.fizzBuzzifyTree;
import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzifyTreeTest() {
        Tree<Integer> testTree1 = new Tree<>();
        Tree<Integer> testTree2 = new Tree<>();
        Tree<Integer> testTree3 = new Tree<>();

        testTree1.setRoot(
                new Node<>(1,
                    new Node<>(2,
                    new Node<>(3),
                        new Node<>(4,
                            new Node<>(5),
                            new Node<>(6))),
                new Node<>(15)));

        List<String> result = fizzBuzzifyTree(testTree1).breadthTraversal();
        String[] expected = {"1","2","FizzBuzz","Fizz","4","Buzz","Fizz"};
        assertArrayEquals(expected, result.toArray(new String[result.size()]));

        List<String> result2 = fizzBuzzifyTree(testTree2).breadthTraversal();
        String[] expected2 = {};
        assertArrayEquals(expected2, result2.toArray(new String[result2.size()]));

        testTree3.setRoot(
                new Node<>(15,
                    null,
                    new Node<>(28,
                    null,
                        new Node<>(4123,
                            null,
                            new Node<>(6123)))));

        List<String> result3 = fizzBuzzifyTree(testTree3).breadthTraversal();
        String[] expected3 = {"FizzBuzz","28","4123","Fizz"};
        assertArrayEquals(expected3, result3.toArray(new String[result3.size()]));

    }
}