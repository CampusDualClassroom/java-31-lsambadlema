package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise31 {
    public static void main(String[] args) {

        String filePath = "src/main/resources/lorem.txt";


        readFileAndPrint(filePath);
    }


    public static void readFileAndPrint(String filePath) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Imprime cada línea del archivo
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

