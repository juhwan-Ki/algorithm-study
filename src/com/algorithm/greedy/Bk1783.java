package com.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bk1783 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int col = Integer.parseInt(st.nextToken()); // 열(세로)
        int row = Integer.parseInt(st.nextToken()); // 행(가로)
        int sum = 0;

        // col 1이면 아무데도 못감
        if (col == 1) {
            sum = 1;
        } else if (col == 2) {
            // col 2이면 오른쪽으로 밖에 못감
            sum = Math.min(4,(row+1)/2);
        } else {
            // row가 7이상이여야 모두 이동할 수 있음
            if (row < 7) sum = Math.min(4,row);
            else sum = row-2;
        }
        System.out.println(sum);
    }
}
