package boj_problem.silver4;

import java.util.Scanner;

public class boj_2839 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sugar = scanner.nextInt();
        int big = sugar / 5;
        int small = 0;
        int flag = 0;

        if (big >= 0) {
            int sub = sugar - (big * 5);

            for (int i = big; i >= 0; i--) {
                if ( sub % 3 != 0 ) {
                    big--;
                    sub = sugar - (big * 5);
                }
                else {
                    small = sub / 3;
                    flag = 1;
                    break;
                }
            }
        }


        if (flag == 1) {
            System.out.println(big + small);
        }
        else System.out.println(-1);

    }
}
