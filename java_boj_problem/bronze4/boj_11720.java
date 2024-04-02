package boj_problem.bronze4;

import java.util.Scanner;

public class boj_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length  = Integer.parseInt(scanner.nextLine());
        String arr = scanner.nextLine();
        int sum = 0;
        //48~57
        for (int i = 0; i < length; i++) {
            sum += arr.charAt(i) - 48;
        }

        System.out.println(sum);
    }
}
