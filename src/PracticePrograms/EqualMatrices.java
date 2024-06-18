// Check if Two Matrices are Equal

package PracticePrograms;

import java.util.Scanner;
public class EqualMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        int[][] a = readMatrix(scanner);
        int row1 = a.length;
        int col1 = a[0].length;
        int[][] b = readMatrix(scanner);
        int row2 = b.length;
        int col2 = b[0].length;
        scanner.close();

        if (row1 != row2 || col1 != col2) {
            System.out.println("Matrices are not equal");
        } else {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    if (a[i][j] != b[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println("Matrices are equal");
            } else {
                System.out.println("Matrices are not equal");
            }
        }
    }

    public static int[][] readMatrix(Scanner scanner) {
        int rows = 0;
        int cols = 0;
        int[][] tempMatrix = new int[100][100];

        String line;
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
