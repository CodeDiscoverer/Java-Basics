package Practice2;

import java.util.Arrays;
import java.util.Scanner;

class Ascending{

    private final int[] arr;
    private final int n;

    Ascending(int[] arr, int n){
        this.arr = arr;
        this.n = n;
    }

    public int[] asc(){
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

class Descending{
    private final int[] arr;
    private final int n;

    Descending(int[] arr, int n){
        this.arr = arr;
        this.n = n;
    }

    public int[] desc(){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

public class Sorting {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter No of elements: ");
        int n = read.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = read.nextInt();
        }

        Ascending a = new Ascending(arr, n);
        System.out.println(Arrays.toString(a.asc()));

        Descending d = new Descending(arr, n);
        System.out.println(Arrays.toString(d.desc()));
    }
}