package com.pedro;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class TextReaderTest {

    @Test
    public void testReadTextFromFile() {
        try {
            String text = TextReader.readTextFromFile("src/test/resources/sample.txt");
            assertNotNull(text);
            assertFalse(text.isEmpty());
        } catch (IOException e) {
            fail("IOException should not have occurred");
        }
    }
}