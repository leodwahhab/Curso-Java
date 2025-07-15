package org.example.fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/in.txt"))) {
            String line = br.readLine();
            do {
                System.out.println(line);
                line = br.readLine();
            } while (line != null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
