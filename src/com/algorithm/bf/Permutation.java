package com.algorithm.bf;

public class Permutation {
    public static void main(String[] args) {
        // 0 ~ 2 사이의 3개의 숫자가 있다.
        // 겹치지 않도록 3개를 골라 나열한 모든 경우의 수를 출력해보자
        // 1. 첫번째 숫자를 for 반복으로 구한다
        for (int i = 0; i < 3; i++) {
            // 2. 두번째 숫자를 for 반복으로 구함
            for (int j = 0; j < 3; j++) {
                // 만약 이미 고른 숫자라면 스킵
                if(i == j) continue;
                // 3. 세번째 숫자를 for 반복으로 구함
                for (int k = 0; k < 3; k++) {
                    // 만약 이미 고른 숫자라면 스킵
                    if(k == i || k == j) continue;
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

        // 숫자 야구 용 순열 생성기
        for (int i = 1; i < 10; i++) {  // 1부터 9까지
            for (int j = 1; j < 10; j++) {
                if (i == j) continue;
                for (int k = 1; k < 10; k++) {
                    if (k == i || k == j) continue;
                    // TODO 주어진 조건을 만족하는지 테스트
                }
            }
        }
    }
}
