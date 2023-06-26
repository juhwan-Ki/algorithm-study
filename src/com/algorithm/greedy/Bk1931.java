package com.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Bk1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int meetingCnt = Integer.parseInt(reader.readLine());
        StringTokenizer st;
        // 회의 시간 배열 생성
        int[][] meetingTimeArr = new int[meetingCnt][2];
        // 회의 시작 종료 시간으로 값 할당
        for (int i = 0; i < meetingCnt; i++) {
            st = new StringTokenizer(reader.readLine());
            meetingTimeArr[i][0] = Integer.parseInt(st.nextToken());
            meetingTimeArr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 회의 종료시간을 기준으로 정렬
        Arrays.sort(meetingTimeArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        int cnt = 0;
        int endTime = 0;
        // 회의 종료시간이 회의 시작시간과 작거나 같을 때 회의 시작
        for (int i = 0; i < meetingCnt; i++) {
            if(endTime <= meetingTimeArr[i][0]){
                // 해당 회의 종료시간을 다시 할당
                endTime = meetingTimeArr[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
