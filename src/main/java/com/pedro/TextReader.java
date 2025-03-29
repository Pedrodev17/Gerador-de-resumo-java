package com.pedro;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextReader {
    public static String readTextFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public static void main (String[] args){
        try {
            String text = readTextFromFile("");
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
