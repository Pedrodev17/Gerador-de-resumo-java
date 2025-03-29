package com.pedro;

public class TextPreprocessor {
    public static String preprocess(String text) {
        text = text.replaceAll("[^a-zA-Z0-9\\s]", "");
        text = text.toLowerCase();
        return text;
    }

    public static void main(String[] args) {
        String rawText = "Hello, World! This is a test.";
        String processedText = preprocess(rawText);
        System.out.println(processedText);
    }
}