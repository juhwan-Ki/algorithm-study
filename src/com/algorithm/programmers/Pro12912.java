package com.algorithm.programmers;

public class Pro12912 {
    public long solution(int a, int b) {
        long answer = 0;
        // b가 더 큰 수 일때 a와 b를 바꿔줌
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;

        }
        // 합을 구함
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}
