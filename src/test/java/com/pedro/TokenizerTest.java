package com.pedro;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenizerTest {

    @Test
    public void testTokenizeSentences() {
        String text = "Hello, world! This is a test.";
        String[] sentences = Tokenizer.tokenizeSentences(text);
        assertEquals(2, sentences.length);
    }

    @Test
    public void testTokenizeWords() {
        String text = "Hello, world!";
        String[] words = Tokenizer.tokenizeWords(text);
        assertEquals(2, words.length);
    }
}