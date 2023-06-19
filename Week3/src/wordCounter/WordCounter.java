package wordCounter;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void Word(String str) {
        String[] words = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }
}
