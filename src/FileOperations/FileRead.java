package FileOperations;

import java.io.FileReader;

public class FileRead {

    public static void main(String[] args) {

        char[] arr = new char[1000];

        try (FileReader reader = new FileReader("d:\\delete\\del.txt")) {
            System.out.print("Data in the file: ");
            int charsRead = reader.read(arr);
            if (charsRead != -1) {
                String fileContent = new String(arr, 0, charsRead);
                System.out.println(fileContent);
            }
        } catch (Exception e) {
            System.err.println("Oops! An Error occurred while Reading the file...");
            e.getStackTrace();
        }
    }
}

