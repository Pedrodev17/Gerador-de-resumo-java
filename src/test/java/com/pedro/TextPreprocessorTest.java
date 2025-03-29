package com.pedro;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextPreprocessorTest {

    @Test
    public void testPreprocessText() {
        String rawText = "Hello, World! This is a test.";
        String expectedText = "hello world this is a test";
        String processedText = TextPreprocessor.preprocess(rawText);
        assertEquals(expectedText, processedText);
    }
}