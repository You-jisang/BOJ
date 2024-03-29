package boj_problem.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class boj_1181 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr);
        Arrays.sort(arr, Comparator.comparing(String::length));
        String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new);

        for (String s: resultArr) {
            System.out.println(s);
        }



    }
}
