package boj_problem.bronze3;

import java.util.Scanner;

public class boj_15667 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K =scanner.nextInt();

        for (int i = 0; ;i++) {
            int fire = (i * i) + i + 1;
            if(K == fire) {
                System.out.println(i);
                break;
            }
        }
    }
}
