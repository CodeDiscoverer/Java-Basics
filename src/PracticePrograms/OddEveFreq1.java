package PracticePrograms;

import java.util.Scanner;

public class OddEveFreq1 {
    public static void solve(int[] tarr, int row, int col) {

        int[][] arr = new int[row][col];
        int k = 0, oddCount = 0, evenCount = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = tarr[k];
                k++;
                if(arr[i][j]%2 != 0){
                    oddCount++;
                }
                else{
                    evenCount++;
                }
            }
        }

        System.out.println("Frequency of odd numbers: " + oddCount);
        System.out.println("Frequency of even numbers: " + evenCount);
    }

    public static void main(String[] args) {

        int[] temp = new int[100];

        Scanner read = new Scanner(System.in);
        int tLen = 0;

        while(read.hasNextInt()){
            temp[tLen] = read.nextInt();
            tLen++;
        }

        int row = 0, col = 0;

        if(tLen == 4){
            row = 2;
            col = 2;
        }
        else if(tLen == 9){
            row = 3;
            col = 3;
        }
        else if(tLen == 16){
            row = 4;
            col = 4;
        }
        else if(tLen == 6){
            row = 2;
            col = 3;
        }
        else if(tLen == 12){
            row = 3;
            col = 4;
        }

        solve(temp, row, col);
    }
}
