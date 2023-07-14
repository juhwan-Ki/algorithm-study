package com.algorithm.programmers;

public class Pro12943 {
    public int solution(long num) {
        int answer = 0;
        // 1일떄 까지 반복
        while (num != 1) {
            // 짝수라면 2로 나눔
            if (num % 2 == 0) {
                num /= 2;
            } else {
            // 홀수라면 3을 곱하고 1을 더함
                num = (num * 3) + 1;
            }
            answer++;
            // 500번이 넘으면 -1을 반환
            if (answer >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
