package boj_problem.bronze3;

import java.util.Scanner;

public class boj_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int addMinute = scanner.nextInt();
        int total = minute + addMinute;
        if (total >= 60) {
            if ((total / 60) + hour > 23){
                System.out.println(((hour + (total / 60)) % 24) + " " + (total % 60));
            } else System.out.println((hour + (total / 60) + " " + (total % 60)));
        } else System.out.print(hour + " " + total);
    }
}
