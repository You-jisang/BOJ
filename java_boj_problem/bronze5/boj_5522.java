package boj_problem.bronze5;

import java.util.Scanner;

public class boj_5522 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int score = scanner.nextInt();
            sum += score;
        }

        System.out.println(sum);
    }
}
