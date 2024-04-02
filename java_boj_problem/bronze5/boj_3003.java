package boj_problem.bronze5;

import java.util.*;
public class boj_3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] find = new int[6];
        int[] how = new int[6];

        for (int i = 0; i < find.length; i++) {
            find[i] = scanner.nextInt();
            how[i] = chess[i] - find[i];
        }
        for (int i : how) {
            System.out.print(i + " ");
        }
    }
}
/*
int king;
        int queen;
        int rooks 2;
        int bishops 2;
        int knights 2;
        int pawns 8;
 */