package Collections;

import java.util.*;

public class KingSoldier {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a sentence:");
        String sentence = read.nextLine();

        String[] words = sentence.split(" ");

        HashMap<Integer, String> wordAsciiMap = new HashMap<>();

        for (String word : words) {
            int asciiSum = 0;
            for (char c : word.toCharArray()) {
                asciiSum += c;
            }
            wordAsciiMap.put(asciiSum, word);
        }

        List<Integer> asciiSums = new ArrayList<>(wordAsciiMap.keySet());
        Collections.sort(asciiSums);

        int maxAsciiSum = asciiSums.get(asciiSums.size() - 1);
        System.out.println("The King is " + wordAsciiMap.get(maxAsciiSum));

        int secondMaxAsciiSum = asciiSums.get(asciiSums.size() - 2);
        System.out.println("The Soldier is " + wordAsciiMap.get(secondMaxAsciiSum));

        int minAsciiSum = asciiSums.get(0);
        System.out.println("The Beggar is " + wordAsciiMap.get(minAsciiSum));
    }
}