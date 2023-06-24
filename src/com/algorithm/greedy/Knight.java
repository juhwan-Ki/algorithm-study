package com.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Knight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        // 현재 위치를 입력받고 int형으로 변경
        int row = input.charAt(1) -'0';
        int col = input.charAt(0) -'a' + 1;

        // 이동할 수 있는 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1 ,-1, -2};
        int[] dy = {-1, -2, -2, -1, 1 ,2 ,2, 1};

        int result = 0;
        // 이동 경로를 확인하여 경우의수를 추가
        for(int i = 0; i < 8; i++){
            int nx = row + dx[i];
            int ny = col + dy[i];
            if(nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8) result++;
        }

        System.out.println(result);
    }
}
