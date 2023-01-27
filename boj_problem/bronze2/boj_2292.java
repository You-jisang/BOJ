package boj_problem.bronze2;

import java.util.Scanner;

public class boj_2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count  = 1;
        int round = 1;
        while (count < num) {
            count += 6 * round;
            round++;
        }
        System.out.println(round);
    }
}
