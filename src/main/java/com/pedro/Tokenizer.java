package com.pedro;
import java.util.StringTokenizer;

public class Tokenizer {
    public static String[] tokenizeSentences(String text) {
        return text.split("[.!?]\\s*");
    }

    public static String[] tokenizeWords(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, " ,.!?;:");
        String[] words = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            words[i++] = tokenizer.nextToken();
        }
        return words;
    }
}