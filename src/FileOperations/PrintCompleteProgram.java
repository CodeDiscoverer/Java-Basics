package FileOperations;

import java.io.FileReader;

public class PrintCompleteProgram {

    public static void main(String[] args) {

        char[] arr = new char[1000];
        System.err.println("The Source of the File is Printed Below 👇");
        // Oops you are viewing File...
        try (FileReader reader = new FileReader("D:\\IntelliJ Idea\\TechnicalTraining\\JavaFundamentals\\src\\FileOperations\\PrintCompleteProgram.java")) {

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
