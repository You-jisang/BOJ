package boj_problem.bronze2;

import java.util.Scanner;

public class boj_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();

        int multi = a * b * c;

        String num = String.valueOf(multi);
        int[] arr = new int[10];

        for (int i = 0; i < num.length(); i++){
            if (num.charAt(i) == '0'){
                arr[0]++;
            } else if (num.charAt(i) == '1') {
                arr[1]++;
            } else if (num.charAt(i) == '2') {
                arr[2]++;
            } else if (num.charAt(i) == '3') {
                arr[3]++;
            } else if (num.charAt(i) == '4') {
                arr[4]++;
            } else if (num.charAt(i) == '5') {
                arr[5]++;
            } else if (num.charAt(i) == '6') {
                arr[6]++;
            } else if (num.charAt(i) == '7') {
                arr[7]++;
            } else if (num.charAt(i) == '8') {
                arr[8]++;
            } else arr[9]++;
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }


    }
}
