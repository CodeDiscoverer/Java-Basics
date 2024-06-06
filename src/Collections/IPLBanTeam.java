package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class IPLBanTeam {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        List<String> team = new ArrayList<>();
        HashMap<Integer, String> win = new HashMap<>();
        HashMap<Integer, String> lose = new HashMap<>();

        System.out.print("No of Teams Available and their name: ");
        int n = read.nextInt();

        List <Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            team.add(read.next());
        }
        System.out.print("Enter number of years; ");
        int y = read.nextInt();
        for(int i=0; i<y; i++){
            System.out.print("Winning Year and Team: ");
            win.put(read.nextInt(), read.next());
            System.out.print("Losing Year and Team: ");
            lose.put(read.nextInt(), read.next());
        }

    }
}
