package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt(); // 시작
        int multiplyNum = sc.nextInt(); // 곱할 값
        int plusNum = sc.nextInt(); // 더할 값
        int endNum = sc.nextInt(); // 끝
        long result = startNum; // 결과값

        for(int i = 1; i < endNum; i++){
            result = (result * multiplyNum) + plusNum;
        }
        System.out.println(result);
    }
}