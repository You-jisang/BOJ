package boj_problem.bronze5;

import java.util.Scanner;

public class boj_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = scanner.nextInt();
        int totalBuy = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < totalBuy; i++) {
            int price = scanner.nextInt();
            int buy = scanner.nextInt();
            sum += price * buy;
        }


        if(totalPrice == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
