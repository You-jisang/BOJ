package boj_problem.bronze1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class boj_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> arr = new ArrayList<>();
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            arr.add(scanner.nextDouble());
        }
        arr.sort(Comparator.reverseOrder());

        double sum = 0.0;
        for (Double i : arr) {
            sum += (i/arr.get(0)) * 100;
        }

        double avg =  sum / count;

        System.out.println(avg);
    }
}
