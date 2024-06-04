package BasicInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        String Sentence1 = bRead.readLine();
        String Sentence2 = bRead.readLine();

        System.out.println(Sentence1);
        System.out.println(Sentence2);
    }
}
