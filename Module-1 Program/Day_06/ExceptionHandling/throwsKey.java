package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class throwsKey {

    public static void readFile() throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader fr = new FileReader(file);
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception delegated via 'throws': " + e.getMessage());
        }
    }
}