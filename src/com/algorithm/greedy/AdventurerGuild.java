package com.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AdventurerGuild {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int adventurerNum = Integer.parseInt(reader.readLine());
        int[] adventurerArr = new int[adventurerNum];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int result = 0;
        // 공포도 배열에 값 초기화
        for (int i = 0; i < adventurerNum; i++) {
            adventurerArr[i] = Integer.parseInt(st.nextToken());
        }
        // 오름차순 정렬
        Arrays.sort(adventurerArr);

        // 그룹 인원수
        int cnt = 0;
        for (int i = 0; i < adventurerNum; i++) {
            cnt++;
            if(cnt >= adventurerArr[i]){
                result++;
                cnt = 0;
            }
        }
        System.out.println(result);
    }
}
