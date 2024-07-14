import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

    public static void main(String[] args) {
        try {
            readFile("path/to/file.txt");
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void readFile(String filePath) {
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Throwing a runtime exception if the file cannot be read
            throw new RuntimeException("El archivo no se puede leer", e);
        }
    }
}
