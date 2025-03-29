// src/test/java/com/pedro/SentenceScorerTest.java
package com.pedro;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class SentenceScorerTest {

    @Test
    public void testScoreSentences() {
        String[] sentences = {"Hello world", "Hello Java"};
        Map<String, Integer> wordFrequencies = new HashMap<>();
        wordFrequencies.put("hello", 2);
        wordFrequencies.put("world", 1);
        wordFrequencies.put("java", 1);

        Map<String, Integer> sentenceScores = SentenceScorer.scoreSentences(sentences, wordFrequencies);
        assertEquals(3, (int) sentenceScores.get("Hello world"));
        assertEquals(3, (int) sentenceScores.get("Hello Java"));
    }
}