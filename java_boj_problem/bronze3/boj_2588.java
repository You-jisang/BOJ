package boj_problem.bronze3;

import java.util.Scanner;

public class boj_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int one = x * (y%10);
        int ten = x * ((y/10)%10);
        int hun = x *(y/100);

        System.out.println(one);
        System.out.println(ten);
        System.out.println(hun);
        System.out.println(x*y);
    }
}
