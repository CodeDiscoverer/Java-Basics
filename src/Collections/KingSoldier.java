package Collections;

import java.util.*;

public class KingSoldier {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a sentence:");
        String sentence = read.nextLine();

        String[] words = sentence.split(" ");

        HashMap<Integer, String> wordLengthMap = new HashMap<>();

        for (String word : words) {
            int length = word.length();
            if(!wordLengthMap.containsKey(length)){
                wordLengthMap.put(length, word);
            }

        }

        List<Integer> lengths = new ArrayList<>(wordLengthMap.keySet());
        Collections.sort(lengths);

        int max = lengths.getLast();
        System.out.println("The King is " + wordLengthMap.get(max));


        int secondMax = lengths.get(lengths.size() - 2);
        System.out.println("The Soldier is " + wordLengthMap.get(secondMax));


        int min = lengths.get(0);
        System.out.println("The Beggar is " + wordLengthMap.get(min));
    }
}
