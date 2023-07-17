package com.algorithm.programmers;

public class Pro12945 {
    public int solution(int n) {
        // 피보나치 수를 담을 배열
        int[] arr = new int[n + 1];
        // F(0) = 0
        arr[0] = 0;
        // F(1) = 1
        arr[1] = 1;

        // 문제에서 2부터 시작한다하여 2로 시작
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i -1] + arr[i -2]) % 1234567;
        }

        return arr[n];
    }
}
