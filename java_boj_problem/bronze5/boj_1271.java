package boj_problem.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class boj_1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger money = new BigInteger(scanner.next());
        BigInteger people = new BigInteger(scanner.next());


        BigInteger dev = money.divide(people);
        BigInteger remain = money.remainder(people);


        System.out.println(dev);
        System.out.println(remain);
    }
}
