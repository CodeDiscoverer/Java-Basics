package Zoho;

public class OddEvenPattern {
    public static void main(String[] args) {

        String word = "PROGRAM";

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {

                if (j == i || i + j == word.length()-1) {
                    System.out.print(word.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
