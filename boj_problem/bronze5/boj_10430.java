package boj_problem.bronze5;

import java.util.Scanner;

public class boj_10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int[] exam = new int[4];

        exam[0] = (A+B)%C;
        exam[1] = ((A%C) + (B%C))%C;
        exam[2] = (A*B)%C;
        exam[3] = ((A%C) * (B%C))%C;

        for(int x : exam) {
            System.out.println(x);
        }
    }
}
