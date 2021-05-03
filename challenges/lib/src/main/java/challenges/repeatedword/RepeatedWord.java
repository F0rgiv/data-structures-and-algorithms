package challenges.repeatedword;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatedWord {
    static String regex = "([^a-zA-Z]\\s|\\s)";

    static public String getFirstRepeatingWord(String input){
        Set<String> setOfWords = new HashSet<>();

        List<String> listOfWords = Stream.of(input.split(regex))
                .map (word -> word.toLowerCase(Locale.ROOT))
                .collect(Collectors.toList());

        for (String listOfWord : listOfWords) {
            if (setOfWords.contains(listOfWord)) return listOfWord;
            setOfWords.add(listOfWord);
        }
        return null;
    }

    static public HashMap<String, Integer> getWordCounts(String input){
        HashMap<String, Integer> words = new HashMap<>();

        Stream.of(input.split(regex))
                .forEach (word -> {
                    int count = words.getOrDefault(word.toLowerCase(Locale.ROOT), 0);
                    words.put(word, count + 1);
                });
        return words;
    }

    static public List<String> getMostCommonWords(String input, int amount){
        HashMap<String, Integer> words = new HashMap<>();

        Stream.of(input.split(regex))
                .forEach (word -> {
                    int count = words.containsKey(word.toLowerCase(Locale.ROOT)) ? words.get(word.toLowerCase(Locale.ROOT)) : 0;
                    words.put(word, count + 1);
                });

        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer> >(words.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        List<String> result = new LinkedList<>();
        return new LinkedList<>();
    }

    List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap();
        for (String word: words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                        w2.compareTo(w1) : count.get(w1) - count.get(w2) );

        for (String word: count.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }

        List<String> ans = new ArrayList();
        while (!heap.isEmpty()) ans.add(heap.poll());
        Collections.reverse(ans);
        return ans;
    }
}
