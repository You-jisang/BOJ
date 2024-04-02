package boj_problem.bronze1;

import java.util.Scanner;

public class boj_2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd = gcd(a, b);
        int lcm = gcd * (a / gcd) * (b / gcd);

        System.out.println(gcd);
        System.out.println(lcm);

    }
    //유클리드 호제법
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
