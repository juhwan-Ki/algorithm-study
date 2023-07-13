package com.algorithm.programmers;

import java.util.Arrays;

public class Pro86051 {
    public int solution(int[] numbers) {
        int answer = 45;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return answer - sum;
    }

    public static void main(String[] args) {
        System.out.println(new Pro86051().solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }
}
