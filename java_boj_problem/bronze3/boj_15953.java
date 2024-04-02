package boj_problem.bronze3;

import java.util.Scanner;

public class boj_15953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++){
            int sum = 0;
            int first = scanner.nextInt();
            int second = scanner.nextInt();


            if (first == 1) {
                sum += 5000000;
            } else if (2<=first && first<=3) {
                sum += 3000000;
            } else if (4<=first && first<=6) {
                sum += 2000000;
            } else if (7<=first && first<=10) {
                sum += 500000;
            } else if (11<=first && first<=15) {
                sum += 300000;
            } else if (16<=first && first<=21) {
                sum += 100000;
            } else sum += 0;

            if (second == 1) {
                sum += 5120000;
            } else if (2<=second && second<=3) {
                sum += 2560000;
            } else if (4<=second && second<=7) {
                sum += 1280000;
            } else if (8<=second && second<=15) {
                sum += 640000;
            } else if (16<=second && second<=31) {
                sum += 320000;
            } else sum += 0;

            System.out.println(sum);
        }
    }
}
