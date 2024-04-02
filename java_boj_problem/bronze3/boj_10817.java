package boj_problem.bronze3;

import java.util.Scanner;

public class boj_10817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[3];

        int max = 0;
        int min = 100;

        for (int i = 0; i  < 3; i++) {
            num[i] = scanner.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < 2; i++){
            if (num[i] > num[i + 1]) {
                temp = num[i];
                num[i] = num[i + 1];
                num[i + 1] = temp;
            }
        }
        if (num[0] > num[1]) {
            temp = num[0];
            num[0] = num[1];
            num[1] = temp;
        }
        System.out.println(num[1]);

    }
}
