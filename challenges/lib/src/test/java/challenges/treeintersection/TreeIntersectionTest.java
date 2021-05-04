package challenges.treeintersection;

import challenges.tree.BinarySearchTree;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static challenges.treeintersection.TreeIntersection.treeIntersection;
import static org.junit.Assert.assertEquals;

public class TreeIntersectionTest {
    BinarySearchTree<Integer> tree1 = new BinarySearchTree<>();
    BinarySearchTree<Integer> tree2 = new BinarySearchTree<>();
    BinarySearchTree<Integer> tree3 = new BinarySearchTree<>();

    BinarySearchTree<String> tree4 = new BinarySearchTree<>();
    BinarySearchTree<String> tree5 = new BinarySearchTree<>();


    @Test
    public void treeIntersectionTest() {
        tree1.add(1);
        tree1.add(2);
        tree1.add(3);
        tree1.add(4);
        tree1.add(5);
        tree2.add(4);
        tree2.add(5);
        tree2.add(6);
        Set<Integer> expected = Stream.of(4, 5)
                .collect(Collectors.toCollection(HashSet::new));
        assertEquals(expected, treeIntersection(tree1, tree2));

        tree3.add(1);
        tree3.add(11);
        tree3.add(12);
        tree3.add(5);
        Set<Integer> expected2 = Stream.of(1, 5)
                .collect(Collectors.toCollection(HashSet::new));
        assertEquals(expected2, treeIntersection(tree1, tree3));

        tree4.add("val1");
        tree4.add("val2");
        tree4.add("val3");
        tree4.add("val4");
        tree4.add("val5");
        tree4.add("val6");
        Set<String> expected3 = new HashSet<>();
        assertEquals(expected3, treeIntersection(tree4, tree5));
    }
}