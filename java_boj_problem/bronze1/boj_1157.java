package boj_problem.bronze1;

import java.util.Scanner;

public class boj_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int[] alpha = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
                alpha[str.charAt(i) - 65] ++;
            } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                alpha[str.charAt(i) - 97] ++;
            }
        }
        int max = 0;
        int flag = 0;
        char count = ' ';
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] > max){
                max = alpha[i];
                count = (char) i;
                flag = 0;
            } else if (alpha[i] == max && max != 0) {
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.println("?");
        } else System.out.println((char) (count + 65));

    }
}
