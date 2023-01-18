package boj_problem.bronze4;

import java.util.Scanner;

public class boj_1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean n = true;

        int k = 0;
        while (n) {
            int count = 0;
            String str = scanner.nextLine();

            if (str.equals("#")) {
                n = false;
                break;
            }


            for(int i = 0; i < str.length(); i++){

                if(str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'e') {
                    count++;
                } else if (str.charAt(i) == 'A' || str.charAt(i) == 'O' || str.charAt(i) == 'I' || str.charAt(i) == 'U' || str.charAt(i) == 'E') {
                    count++;
                } else continue;
            }
            System.out.println(count);

        }
    }
}
