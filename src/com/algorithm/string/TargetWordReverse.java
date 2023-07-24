package com.algorithm.string;

import java.util.Scanner;

public class TargetWordReverse {

    public String solution(String str) {
        String answer;
        char[] chaArr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            // lt가 알파벳이 아닐때 1증가
            if(!Character.isAlphabetic(chaArr[lt])) lt++;
            // rt가 알파벳이 아닐때 1감소
            else if (!Character.isAlphabetic(chaArr[rt])) rt--;
            // 알파벳이면 교환
            else {
                char temp = chaArr[lt];
                chaArr[lt] = chaArr[rt];
                chaArr[rt] = temp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(chaArr);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(new TargetWordReverse().solution(str));
    }
}
