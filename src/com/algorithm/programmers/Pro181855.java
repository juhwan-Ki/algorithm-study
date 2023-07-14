package com.algorithm.programmers;

public class Pro181855 {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] answerArr = new int[30];

        for (int i = 0; i < strArr.length; i++) {
            int size = strArr[i].length();
            answerArr[size -1] += 1;
        }

        for (int i = 0; i < answerArr.length; i++) {
            if(answer == 0) {
                answer = answerArr[i];
            } else if(answer < answerArr[i]){
                answer = answerArr[i];
            }
        }
        return answer;
    }
}
