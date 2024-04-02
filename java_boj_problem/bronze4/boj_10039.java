package boj_problem.bronze4;

import java.util.Scanner;

public class boj_10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sup = 40;
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            int score = scanner.nextInt();
            if (score < sup) score = sup;
            sum += score;
        }

        int avg = sum / 5;
        System.out.println(avg);
    }
}
