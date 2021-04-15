package challenges.utilities;

import challenges.tree.Node;
import challenges.tree.Tree;

public class FizzBuzzTree {
    public static Tree<String> fizzBuzzifyTree(Tree<Integer> sourceTree){
        Tree<String> result = new Tree<>();
        result.setRoot(fizzBuzzifyTree(sourceTree.getRoot()));
        return result;
    }

    private static Node<String> fizzBuzzifyTree(Node<Integer> node) {
        if (node == null) return null;
        return new Node<String>(fizzBuzz(node.getValue()), fizzBuzzifyTree(node.getLeft()), fizzBuzzifyTree(node.getRight()));
    }

    private static String fizzBuzz(Integer num){
        if (num % 15 == 0) return "FizzBuzz";
        if (num % 5 == 0) return "Buzz";
        if (num % 3 == 0) return "Fizz";
        return num.toString();
    }
}
