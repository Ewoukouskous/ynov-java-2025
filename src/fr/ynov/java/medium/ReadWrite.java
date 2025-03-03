package fr.ynov.java.medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite {

    public static void main(String[] args) {
        try {
            File testFile = new File("src/fr/ynov/java/medium/toRead.txt");

            PrintWriter writer = new PrintWriter("src/fr/ynov/java/medium/toWrite.txt");
            Scanner reader = new Scanner(testFile);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                writer.println(data);
            }

            reader.close();
            writer.close();
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
