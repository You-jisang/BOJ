package boj_problem.bronze2;

import java.util.Scanner;

public class boj_8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++){
            String caseCount = scanner.nextLine();
            int len = caseCount.length();
            int sum = 0;
            int flag = 0;
            int add = 1;

            for (int j = 0; j < len; j++) {
                if (caseCount.charAt(j) == 'O') {
                    if (flag == 1){
                        add++;
                    }
                    sum += add;
                    flag = 1;
                } else if (caseCount.charAt(j) == 'X') {
                    add = 1;
                    flag = 0;
                }
            }

            System.out.println(sum);
        }
    }
}
