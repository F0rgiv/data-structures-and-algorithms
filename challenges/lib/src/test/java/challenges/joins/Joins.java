package challenges.joins;

import java.util.*;

public class Joins {
    public static List<String[]> leftJoin(Hashtable<String, String> leftMap, Hashtable<String, String> rightMap){
        List<String[]> result = new ArrayList<>();
        for (String key : leftMap.keySet()) {
            result.add(new String[]{key, leftMap.get(key), rightMap.get(key)});
        }
        return result;
    }

    public static List<String[]> rightJoin(Hashtable<String, String> leftMap, Hashtable<String, String> rightMap){
        List<String[]> result = new ArrayList<>();
        for (String key : rightMap.keySet()) {
            result.add(new String[]{key, rightMap.get(key), leftMap.get(key)});
        }
        return result;
    }

    public static List<String[]> fullJoin(Hashtable<String, String> leftMap, Hashtable<String, String> rightMap){
        List<String[]> result = new ArrayList<>();
        for (String key : leftMap.keySet()) {
            result.add(new String[]{key, leftMap.get(key), rightMap.remove(key)});
        }
        for (String key : rightMap.keySet()) {
            result.add(new String[]{key, null, rightMap.get(key)});
        }
        return result;
    }
}
