package com.pedro;
import java.io.IOException;
import java.util.*;

public class Summarizer {
    public static String generateSummary(String text, int numberOfSentences) throws IOException {
        text = TextPreprocessor.preprocess(text);

        String[] sentences = Tokenizer.tokenizeSentences(text);
        String[] words = Tokenizer.tokenizeWords(text);

        Map<String, Integer> wordFrequencies = WordFrequencyCounter.calculateWordFrequencies(words);
        Map<String, Integer> sentenceScores = SentenceScorer.scoreSentences(sentences, wordFrequencies);

        List<Map.Entry<String, Integer>> sortedSentences = new ArrayList<>(sentenceScores.entrySet());
        sortedSentences.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        StringBuilder summary = new StringBuilder();
        for (int i = 0; i < numberOfSentences && i < sortedSentences.size(); i++) {
            summary.append(sortedSentences.get(i).getKey()).append(". ");
        }

        return summary.toString();
    }

    public static void main(String[] args) {
        try {
            String text = TextReader.readTextFromFile("sample.txt");
            String summary = generateSummary(text, 3);
            System.out.println(summary);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}