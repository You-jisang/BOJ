package boj_problem.bronze2;

import java.util.Scanner;

public class boj_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[42];

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            arr[num % 42]++;
        }

        int count = 0;
        for (int i = 0; i < 42; i++) {
            if (arr[i] != 0) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
