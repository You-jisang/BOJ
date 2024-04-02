package boj_problem.bronze2;

import java.util.Scanner;

public class boj_2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.next();
        String num2 = scanner.next();

        StringBuffer str1 = new StringBuffer(num1);
        String newNum1 = str1.reverse().toString();

        StringBuffer str2 = new StringBuffer(num2);
        String newNum2 = str2.reverse().toString();

        if (Integer.parseInt(newNum1) > Integer.parseInt(newNum2)) {
            System.out.println(newNum1);
        } else System.out.println(newNum2);




    }

}

