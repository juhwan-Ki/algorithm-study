package com.example.javaproject.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[19][19];

        for (int i = 0; i < num; i++) {
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();
            arr[val1 -1][val2 -1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}