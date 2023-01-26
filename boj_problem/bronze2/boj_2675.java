package boj_problem.bronze2;

import java.util.Scanner;

public class boj_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int i = 0; i < count; i ++) {
            int repeat = scanner.nextInt();

            String str = scanner.next();
            int len = str.length();


            for (int j = 0; j < len; j++) {
                for (int k = 0; k < repeat; k ++) {
                    System.out.print(str.charAt(j));
                }

            }
            System.out.println();
        }
    }
}
