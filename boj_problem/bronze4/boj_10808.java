package boj_problem.bronze4;

import java.util.Scanner;

public class boj_10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();
        int[] arr = new int[26];

        //97~122
        for (int i = 0; i  < length; i ++) {
            int count = s.charAt(i) - 97;
            arr[count] ++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
