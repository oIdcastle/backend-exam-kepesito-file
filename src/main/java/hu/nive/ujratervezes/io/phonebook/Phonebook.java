package hu.nive.ujratervezes.io.phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Phonebook {

    void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Invalid parameter");
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
            for (Map.Entry<String, String> e : contacts.entrySet()) {
                bw.write(e.getKey() + ": " + e.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }

}