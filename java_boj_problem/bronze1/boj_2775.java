package boj_problem.bronze1;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj_2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        for (int j = 0; j < test; j++) {
            int floor = scanner.nextInt();
            int num = scanner.nextInt();
            int[][] arr = new int[floor+1][num];

            for (int i = 0; i < num; i ++) {
                arr[0][i] = i + 1;
            }

            for (int i = 1; i <floor + 1; i++) {
                for (int k = 0; k < num; k++) {
                    for (int l = 0; l <= k; l ++) {
                        arr[i][k] += arr[i-1][l];
                    }
                }
            }
            System.out.println(arr[floor][num-1]);
        }
    }
}
