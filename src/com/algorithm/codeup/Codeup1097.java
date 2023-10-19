package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        // 바둑판을 입력받는다.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               int val1= sc.nextInt();
                arr[i][j] = val1;
            }
        }
        // 바꿀좌표의 숫자입력
        int num = sc.nextInt();
        // 좌표입력
        for (int i = 0; i < num; i++) {
            int val1 = sc.nextInt() -1;
            int val2 = sc.nextInt() -1;
            // 가로를 0이면 1로 바꾸고 1이면 0으로 변경
            for (int j = 0; j < arr.length; j++) {
                if(arr[val1][j] == 0) {
                    arr[val1][j] = 1;
                } else {
                    arr[val1][j] = 0;
                }
            }
            // 세로를 0이면 1로 바꾸고 1이면 0으로 변경
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][val2] == 0) {
                    arr[j][val2] = 1;
                } else {
                    arr[j][val2] = 0;
                }
            }
        }
        // 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}