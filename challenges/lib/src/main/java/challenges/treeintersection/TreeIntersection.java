package challenges.treeintersection;

import challenges.tree.BinarySearchTree;
import challenges.tree.Tree;

import java.util.HashSet;
import java.util.Set;

public class TreeIntersection {
    public static<T extends Comparable<T>> Set<T> treeIntersection(BinarySearchTree<T> tree1, BinarySearchTree<T> tree2){
        Set<T> result = new HashSet<>();
        tree1.breadthTraversal().forEach(val -> {
            if (tree2.contains(val)) result.add(val);
        });
        return result;
    }
}
