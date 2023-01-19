package boj_problem.bronze3;

import java.util.Scanner;

public class boj_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];



        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();

        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < count; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.print(min + " ");
        System.out.print(max);

    }
}
