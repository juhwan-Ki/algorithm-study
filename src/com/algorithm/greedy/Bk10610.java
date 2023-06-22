package com.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bk10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int[] arr = new int[n.length()];
        int sum = 0;
        // 입력 받은 값을 하나하나 int형으로 변경
        for (int i = 0; i < n.length(); i++) {
            arr[i] = n.charAt(i) - '0';
            sum += arr[i];
        }
        // 오름차순으로 정렬
        Arrays.sort(arr);

        // 3의 배수인지 확인
        // 1. 입력받은 값을 모두 더해서 3으로 나눠지는지?
        // 2. 0이 포함되어 있는지?
        if (sum % 3 == 0 && arr[0] == 0) {
            for (int i = arr.length -1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        } else {
            System.out.println(-1);
        }
    }
}
