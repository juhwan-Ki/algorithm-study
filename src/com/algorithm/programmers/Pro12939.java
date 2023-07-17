package com.algorithm.programmers;

public class Pro12939 {
    public String solution(String s) {
        String answer = "";
        String[] splitArr = s.split(" ");

        int max = Integer.parseInt(splitArr[0]);
        int min = Integer.parseInt(splitArr[0]);

        for(int i = 0; i < splitArr.length; i++) {
            int num = Integer.parseInt(splitArr[i]);
            if(max < num) {
                max = num;
            } else if(min > num) {
                min = num;
            }
        }
        answer = min +  " " + max;
        return answer;
    }
}
