package com.pedro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Paths.get("src/main/resources/WEG-CFW.txt")); // Lê o arquivo
        System.out.println("Texto processado: " + content);
    }
}