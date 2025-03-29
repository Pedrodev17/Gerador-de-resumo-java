package com.pedro;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static Map<String, Integer> calculateWordFrequencies(String[] words) {
        Map<String, Integer> wordFrequencies = new HashMap<>();
        for (String word : words) {
            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
        }
        return wordFrequencies;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "hello", "java"};
        Map<String, Integer> frequencies = calculateWordFrequencies(words);
        for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
