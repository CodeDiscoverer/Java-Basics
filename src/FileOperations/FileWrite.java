package FileOperations;

import java.io.*;


public class FileWrite {

    public static void main(String[] args) throws IOException {

        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        String insertValue = bRead.readLine();

        try {
            FileWriter Insert = new FileWriter("d:\\delete\\del.txt");

            Insert.write(insertValue);
            System.out.println("Wow! The File is Written and closed Successfully...");

            Insert.close();

        } catch (Exception e) {
            System.err.println("Oops! An Error occurred while Writing the file...");
            e.getStackTrace();
        }
    }
}
