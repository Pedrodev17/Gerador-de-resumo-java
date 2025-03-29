// src/test/java/com/pedro/SummarizerTest.java
package com.pedro;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class SummarizerTest {

    @Test
    public void testGenerateSummary() throws IOException { // Removido try-catch
        String text = TextReader.readTextFromFile("src/test/resources/sample.txt");
        String summary = Summarizer.generateSummary(text, 3);
        assertNotNull(summary);
        assertFalse(summary.isEmpty());
    }
}