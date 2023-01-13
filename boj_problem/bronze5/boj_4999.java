package boj_problem.bronze5;

import java.util.Scanner;

public class boj_4999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String me = scanner.nextLine();
        String doctor = scanner.nextLine();

        if (me.length() < doctor.length()) {
            System.out.println("no");
        } else System.out.println("go");
    }
}
