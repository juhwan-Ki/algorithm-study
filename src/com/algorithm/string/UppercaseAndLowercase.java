package com.algorithm.string;

import java.util.Scanner;

import static java.lang.Character.*;

public class UppercaseAndLowercase {

    public String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()) {
//            if(isLowerCase(x)) {
//                answer += toUpperCase(x);
//            } else {
//                answer += toLowerCase(x);
//            }
            // 아스키 코드로
            // 소문자는 97 ~ 122
            // 대문자는 65 ~ 90
            // 대문자와 소문자의 차이는 32
            if(x >= 97 && x <= 122) {
                // 소문자 이면 -32를 해서 대문자로 변경
                answer += (char) (x - 32);
            } else {
                // 대문자면 +32를 해서 소문자로 변경
                answer += (char) (x + 32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(new UppercaseAndLowercase().solution(str));
    }
}
