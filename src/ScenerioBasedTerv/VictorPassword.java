package ScenerioBasedTerv;

import java.util.Scanner;

public class VictorPassword {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                if(i+j == n){
                    System.out.println(i + "" + j);
                    return;
                }
            }
        }
    }
}
