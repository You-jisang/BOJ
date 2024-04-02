package boj_problem.bronze2;

import java.util.Scanner;

public class boj_1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (B >= C) {
            System.out.println(-1);
        } else {
            System.out.println(A / (C - B) + 1);
        }


    }
}
