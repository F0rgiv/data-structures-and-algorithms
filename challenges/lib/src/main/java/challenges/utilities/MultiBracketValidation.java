package challenges.utilities;

import challenges.stacksandqueues.Stack;

import java.util.Map;

public class MultiBracketValidation {
    static Map<Character, Character> bracketPairs = Map.ofEntries(
            Map.entry('(', ')'),
            Map.entry('{', '}'),
            Map.entry('[', ']')
    );

    public static boolean multiBracketValidation(String input) {
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (bracketPairs.keySet().contains(input.charAt(i))) brackets.push(input.charAt(i));
            if (bracketPairs.values().contains(input.charAt(i))) {
                if (brackets.isEmpty()) return false;
                if (!bracketPairs.get(brackets.pop()).equals(input.charAt(i))) return false;
            }
        }
        return brackets.isEmpty();
    }
}
