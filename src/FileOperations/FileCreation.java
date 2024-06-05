package FileOperations;

import java.io.File;

public class FileCreation {

    public static void main(String[] args) {

        File file = new File("d:\\delete\\del.txt");

        {
            try {
                boolean fileStatus = file.createNewFile();

                if(fileStatus)
                    System.out.println("Wow! The File is been created...");
                else
                    System.err.println("Oops! Either the file Exist or not created...");

            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
