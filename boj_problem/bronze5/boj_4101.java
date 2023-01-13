package boj_problem.bronze5;

import java.util.Scanner;

public class boj_4101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println(num1);
            System.out.println(num2);

            if(num1 == 0 && num2 == 0) break;

            if(num1 > num2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
