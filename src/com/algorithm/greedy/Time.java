package com.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int hour = Integer.parseInt(reader.readLine());
        int cnt = 0;

        // 3이 포함된 문자열 탐색
        int count = 0;
        for (int h = 0; h <= hour; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    String str = Integer.toString(h) + Integer.toString(m) + Integer.toString(s);
                    if (str.contains("3"))
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
