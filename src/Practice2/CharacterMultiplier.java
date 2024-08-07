package Practice2;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String value = read.next();
        read.close();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < value.length(); i += 2) {
            char character = value.charAt(i);
            int repeatCount = Character.getNumericValue(value.charAt(i + 1));

            result.append(String.valueOf(character).repeat(Math.max(0, repeatCount)));
        }
        System.out.println(result);
    }
}
