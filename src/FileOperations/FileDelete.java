package FileOperations;

import java.io.File;

public class FileDelete {

    public static void main(String[] args) {

        File file = new File("d:\\delete\\del.txt");
        //File file = new File("d:\\delete\\"); // Delete the folder

        boolean fileStatus = file.delete();

        if(fileStatus)
            System.out.println("Wow! The File has deleted...");
        else
            System.err.println("Oops! Either the file does not Exist or unable able to delete...");
    }
}
