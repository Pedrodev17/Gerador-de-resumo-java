package com.pedro;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

public class WordFrequencyCounterTest {

    @Test
    public void testCalculateWordFrequencies() {
        String[] words = {"hello", "world", "hello", "java"};
        Map<String, Integer> frequencies = WordFrequencyCounter.calculateWordFrequencies(words);
        assertEquals(2, (int) frequencies.get("hello"));
        assertEquals(1, (int) frequencies.get("world"));
        assertEquals(1, (int) frequencies.get("java"));
    }
}