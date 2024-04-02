package boj_problem.bronze1;

import java.util.Scanner;

public class boj_1110 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();

        if (num.length() == 1) {
            num = "0" + num;
        }

        String str = num;

        int count = 0;
        while (true) {
            count ++;
            int x = 0;

            x = (str.charAt(0) - 48) + (str.charAt(1) - 48);

            if (x > 9) {
                int temp = String.valueOf(x).charAt(1) - 48;
                str = str.charAt(1) + String.valueOf(temp);
            } else {
                str = str.charAt(1) + String.valueOf(x);
            }

            if (str.equals(num)) {
                System.out.println(count);
                break;
            }

        }
    }
}
