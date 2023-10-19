package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[h][w];

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() -1;
            int y = sc.nextInt() -1;
            if (d == 0) {
                for (int k = 0; k < l; k++) {
                    arr[x][y++] = 1;
                }
            } else {
                for (int k = 0; k < l; k++) {
                    arr[x++][y] = 1;
                }
            }
        }
        // 두번째 loop를 돌 때 arr.length가 아니라
        // arr[i].length로 해야 오류가 안남
        // 그 이유는 arr[i].length와 arr.length는 다르기 때문
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}