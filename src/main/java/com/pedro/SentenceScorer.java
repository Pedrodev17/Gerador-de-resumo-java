// src/main/java/com/pedro/SentenceScorer.java
package com.pedro;

import java.util.HashMap;
import java.util.Map;

public class SentenceScorer {

    public static Map<String, Integer> scoreSentences(String[] sentences, Map<String, Integer> wordFrequencies) {
        Map<String, Integer> sentenceScores = new HashMap<>();
        for (String sentence : sentences) {
            int score = 0;
            String[] words = sentence.split("\\s+");
            for (String word : words) {
                score += wordFrequencies.getOrDefault(word.toLowerCase(), 0);
            }
            sentenceScores.put(sentence, score);
        }
        return sentenceScores;
    }
}