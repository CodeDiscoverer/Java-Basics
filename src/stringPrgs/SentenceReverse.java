package stringPrgs;

import java.util.Scanner;

public class SentenceReverse {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String original = read.nextLine();
        String[] words = original.split(" ");

        StringBuilder reversedSentence = new StringBuilder();

        for(int i = words.length-1; i >= 0; i--){
            //System.out.print(words[i] + " ");
            reversedSentence.append(words[i]);
            reversedSentence.append(" ");
        }
        System.out.println(reversedSentence);
    }
}
