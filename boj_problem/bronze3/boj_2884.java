package boj_problem.bronze3;

import java.util.Scanner;

public class boj_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if (minute < 45) {
            minute = minute + 60 - 45;
            if (hour == 0) {
                hour = 23;
            } else hour -= 1;

        } else {
            minute -= 45;
        }

        System.out.print(hour + " " + minute);
    }
}
