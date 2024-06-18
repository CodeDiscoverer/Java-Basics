//Display Lower Triangular Matrix
package PracticePrograms;

import java.util.Scanner;

public class LowerTriMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            System.out.println("Matrix should be a square matrix");
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] readMatrix(Scanner scanner) {
        String line;
        int[][] tempMatrix = new int[100][100];
        int rows = 0;
        int cols = 0;

        while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
            String[] values = line.split(" ");
            cols = values.length;
            for (int j = 0; j < cols; j++) {
                tempMatrix[rows][j] = Integer.parseInt(values[j]);
            }
            rows++;
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