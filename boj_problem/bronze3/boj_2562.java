package boj_problem.bronze3;

import java.util.Scanner;

public class boj_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = scanner.nextInt();

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < 9; i++) {
            if (arr[i] == max) {
                System.out.println(i + 1);
            }
        }
    }
}
