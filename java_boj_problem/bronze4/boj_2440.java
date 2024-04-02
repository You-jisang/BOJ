package boj_problem.bronze4;

import java.util.Scanner;

public class boj_2440 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int star = Integer.parseInt(scanner.nextLine());
        int count = star;

        for (int i = 0; i < star ; i++) {
           for (int j = 0; j < count ; j++){
               System.out.print("*");
           }
           count--;
           System.out.println();
        }
    }
}
