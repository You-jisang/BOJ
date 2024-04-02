package boj_problem.bronze4;

import java.util.Scanner;

public class boj_11365 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            String str = scanner.nextLine();
            if (str.equals("END")) break;

            for (int i = str.length() - 1; i >= 0 ; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}
