package Practice2;

import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = read.nextInt();

        int[] arr= new int[n];
        int oddCount = 0, evenCount = 0;

        for(int i=0; i<n; i++){
            arr[i] = read.nextInt();

            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("oddCount: " + oddCount);
        System.out.println("evenCount: " + evenCount);
    }
}
