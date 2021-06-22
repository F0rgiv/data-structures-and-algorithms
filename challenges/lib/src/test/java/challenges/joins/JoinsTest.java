package challenges.joins;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class JoinsTest {
    Hashtable<String, String> leftMap1 = new Hashtable<>();
    Hashtable<String, String> leftMap2 = new Hashtable<>();
    Hashtable<String, String> rightMap1 = new Hashtable<>();
    Hashtable<String, String> rightMap2 = new Hashtable<>();

    @Before
    public void setUp() {
        leftMap1.put("fond", "enamored");
        leftMap1.put("wrath", "anger");
        leftMap1.put("diligent", "employed");
        leftMap1.put("outfit", "garb");
        leftMap1.put("guide", "usher");
        rightMap1.put("fond", "averse");
        rightMap1.put("wrath", "delight");
        rightMap1.put("diligent", "idle");
        rightMap1.put("guide", "follow");
        rightMap1.put("flow", "jam");
        leftMap2.put("fond", "enamored");
        leftMap2.put("wrath", "anger");
        leftMap2.put("diligent", "employed");
        rightMap2.put("guide", "jam");
    }

    @Test
    public void leftJoin() {
        List<String[]> expected1 = new ArrayList<>();
        expected1.add(new String[]{"fond", "enamored", "averse"});
        expected1.add(new String[]{"wrath", "anger", "delight"});
        expected1.add(new String[]{"diligent", "employed", "idle"});
        expected1.add(new String[]{"outfit", "garb", null});
        expected1.add(new String[]{"guide", "usher", "follow"});
        List<String[]> result1 = Joins.leftJoin(leftMap1, rightMap1);
        assertTrue(listsOfStringsMatch(expected1, result1));

        List<String[]> expected2 = new ArrayList<>();
        expected2.add(new String[]{"fond", "enamored", "averse"});
        expected2.add(new String[]{"wrath", "anger", "delight"});
        expected2.add(new String[]{"diligent", "employed", "idle"});
        List<String[]> result2 = Joins.leftJoin(leftMap2, rightMap1);
        assertTrue(listsOfStringsMatch(expected2, result2));

        List<String[]> expected3 = new ArrayList<>();
        expected3.add(new String[]{"fond", "enamored", null});
        expected3.add(new String[]{"wrath", "anger", null});
        expected3.add(new String[]{"diligent", "employed", null});
        expected3.add(new String[]{"outfit", "garb", null});
        expected3.add(new String[]{"guide", "usher", "jam"});
        List<String[]> result3 = Joins.leftJoin(leftMap1, rightMap2);
        assertTrue(listsOfStringsMatch(expected3, result3));
    }

    private boolean listsOfStringsMatch(List<String[]> expected1, List<String[]> result1) {
        if (expected1.size() != result1.size()) return false;
        return sameContent(expected1, result1);
    }

    private boolean sameContent(List<String[]> expected1, List<String[]> result1) {
        boolean result = true;
        for (String[] array1 : expected1) {
            boolean resultInner = false;
            for (String[] array2 : result1) {
                if (Arrays.equals(array1, array2)) {
                    resultInner = true;
                    break;
                }
            }
            if (!resultInner) return false;
        }
        return result;
    }

    @Test
    public void rightJoin() {
    }

    @Test
    public void fullJoin() {
        List<String[]> expected1 = new ArrayList<>();
        expected1.add(new String[]{"fond", "enamored", "averse"});
        expected1.add(new String[]{"wrath", "anger", "delight"});
        expected1.add(new String[]{"diligent", "employed", "idle"});
        expected1.add(new String[]{"outfit", "garb", null});
        expected1.add(new String[]{"guide", "usher", "follow"});
        expected1.add(new String[]{"flow", null, "jam"});
        List<String[]> result1 = Joins.fullJoin(leftMap1, rightMap1);
        assertTrue(listsOfStringsMatch(expected1, result1));
    }
}