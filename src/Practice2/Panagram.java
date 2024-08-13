package Practice2;

import java.util.HashSet;

public class Panagram {

    public static void main(String[] args) {

        String sentence = "The quick brown fox jumps over the lazy dog";

        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        }
        else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();

        HashSet<Character> letters = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        return letters.size() == 26;
    }
}

