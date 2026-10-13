package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class checked {
    public static void main(String[] args) {
        File file = new File("non_existent_file.txt");

        try {
            FileReader fr = new FileReader(file);
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Caught a Checked Exception: File not found!");
        }
    }
}