package boj_problem.bronze3;

import java.util.Scanner;

public class boj_16673 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        int K = scanner.nextInt();
        int P = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < C+1; i++) {
            int add = (i * K) + (i * i * P);
            sum += add;
        }
        System.out.println(sum);
    }
}
