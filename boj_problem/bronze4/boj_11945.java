package boj_problem.bronze4;


import java.util.Scanner;

public class boj_11945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[n];

        for(int i = 0; i < n; i++) {
            str[i] = scanner.nextLine();
        }

        for (String s : str) {
            for (int j = s.length() - 1; j >= 0; j--) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
