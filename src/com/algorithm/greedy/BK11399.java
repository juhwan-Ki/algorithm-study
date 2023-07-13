package com.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK11399 {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 사람의 수
        int person = Integer.parseInt(reader.readLine());
        // 걸리는 시간
        int[] times = new int[person];

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < person; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }
        return 0;
    }
}
