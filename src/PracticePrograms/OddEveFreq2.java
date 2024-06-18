package PracticePrograms;

import java.util.Scanner;

public class OddEveFreq2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);
        scanner.close();
        int rows = matrix.length;
        int cols = matrix.length > 0 ? matrix[0].length : 0;

        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
        }

        System.out.println("Frequency of odd numbers: " + countOdd);
        System.out.println("Frequency of even numbers: " + countEven);
    }

    public static int[][] readMatrix(Scanner scanner) {
        int[][] tempMatrix = new int[100][100];
        int rows = 0;
        int cols = 0;
        boolean endInput = false;
        while (!endInput && scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                endInput = true;
            } else {
                String[] values = line.split(" ");
                cols = values.length;
                for (int j = 0; j < cols; j++) {
                    tempMatrix[rows][j] = Integer.parseInt(values[j]);
                }
                rows++;
            }
        }
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = tempMatrix[i][j];
            }
        }

        return matrix;
    }
}
