package boj_problem.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[] arr = new int[count];
        int max = 0;
        for (int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        br.close();
        int[] counting = new int[max + 1];

        for(int i = 0 ; i < count ; i++) {
            counting[arr[i]]++;
        }

        for(int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }
        int[] result = new int[count];

        StringBuilder sb = new StringBuilder();

        for (int i = count - 1; i >= 0; i--) {
            int value = counting[arr[i]] - 1;
            counting[arr[i]]--;
            result[value] += arr[i];

        }
        for(int i = 0; i< result.length;i++){
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);

    }
}
