package boj_problem.bronze1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj_4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int student = scanner.nextInt();

            List<Integer> score = new ArrayList<>();
            int sum = 0;
            for(int j = 0;  j < student ; j++) {
                score.add(scanner.nextInt());
                sum += score.get(j);
            }

            double avg = (double) sum / student;
            int avgUp = 0;
            for(int j : score) {
               if (j > avg) avgUp++;

            }
            double percent = (double) avgUp / student * 100;

            System.out.printf("%.3f", percent);
            System.out.println("%");
        }
    }
}
