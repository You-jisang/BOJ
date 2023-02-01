package boj_problem.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String test = bufferedReader.readLine();

        StringTokenizer st = new StringTokenizer(test);
        int plus = Integer.parseInt(st.nextToken());
        int minus = Integer.parseInt(st.nextToken());
        int high = Integer.parseInt(st.nextToken());

        int snail = plus - minus;

        int day = (high-minus) / snail;
        if ((high-minus) % snail != 0) day++;

        System.out.println(day);
    }
}
