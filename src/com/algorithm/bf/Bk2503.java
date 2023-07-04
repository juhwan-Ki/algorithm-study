package com.algorithm.bf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bk2503 {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tries = Integer.parseInt(reader.readLine());
        int[][] ballInfo = new int[tries][3];
        for (int i = 0; i < tries; i++) {
            StringTokenizer countTokens = new StringTokenizer(reader.readLine());
            ballInfo[i] = new int[]{
                    Integer.parseInt(countTokens.nextToken()),
                    Integer.parseInt(countTokens.nextToken()),
                    Integer.parseInt(countTokens.nextToken())
            };
        }
        int answer = 0;
        // for 반복문으로 자연수 세개를 나열한다.
        for (int i = 1; i < 10; i++) { // 제일 앞자리 숫자 1
            for (int j = 1; j < 10; j++) { // 두전째 자리 숫자
                if(j == i) continue; // 같은 숫자는 있어서는 안된다.
                for (int k = 1; k < 10; k++) {
                    if(k == i || k == j) continue;
                    // 답변 후보 배열
                    int[] answerCandi = new int[]{i, j, k};
                    boolean isAnswer = true;
                    // 질문들을 순회하며
                    for (int l = 0; l < tries; l++) {
                        int select = ballInfo[l][0];
                        // 답변 후보와 비교
                        int[] result = getCount(select, answerCandi);
                        // 실제 볼카운트와 동일한지 살펴본다.
                        if(result[0] != ballInfo[l][1] || result[1] != ballInfo[l][2]){
                            // 답이 될 수 없다.
                            isAnswer = false;
                            // 나머지 조건 확인 불필요
                            break;
                        }
                    }
                    if(isAnswer) answer++;
                }
            }
        }
        return answer;
    }

    // 두 숫자의 볼카운트를 반환하는 메소드
    public int[] getCount(int select, int[] answer) {
        int strikes = 0;
        int balls = 0;
        
        // 100의자리 10의자리 1의자리로 배열에 넣음 
        // ex 123 -> 1, 2, 3으로 배열에 넣음
        int[] selectNums = new int[]{select / 100, (select /10) % 10, select % 10};

        for (int i = 0; i < 3; i++) {
            // 1. 스트라이크 판정
            if(selectNums[i] == answer[i]) strikes++;
            // 2. 스트라이크가 아닐 때 볼 판정
            else {
                for (int j = 0; j < 3; j++) {
                    if(selectNums[i] == answer[j]) balls++;
                }
            }
        }
        return new int[]{strikes,balls};
    }
}