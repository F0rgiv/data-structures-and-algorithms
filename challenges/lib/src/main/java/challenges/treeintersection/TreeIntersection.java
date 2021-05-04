package challenges.treeintersection;

import challenges.tree.BinarySearchTree;
import challenges.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TreeIntersection {
    public static<T extends Comparable<T>> Set<T> treeIntersection(BinarySearchTree<T> tree1, BinarySearchTree<T> tree2){
        Set<T> result = new HashSet<>();
        Set<T> tree2Vals = new HashSet<>(tree2.breadthTraversal());
        tree1.breadthTraversal().forEach(val -> {
            if (tree2Vals.contains(val)) result.add(val);
        });
        return result;
    }
}
