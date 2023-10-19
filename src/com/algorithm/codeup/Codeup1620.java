package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num >= 10) { // 한 자리가 될 때까지 반복
            int sum = 0;
            while (num > 0) { // 각 자릿수의 합 계산
                sum += num % 10;
                num /= 10;
            }
            num = sum; // 합을 다시 n으로 대입
        }

        System.out.println(num);
    }
}
