package com.algorithm.string;

import java.util.Scanner;

public class LongestWord {
    public String solution(String str) {
        String answer = "";
        String[] strArr = str.split(" ");
        int cnt = Integer.MIN_VALUE;

        for (String x : strArr) {
            int length = x.length();
            if(cnt < length) {
                cnt = length;
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new LongestWord().solution(str));
    }
}
