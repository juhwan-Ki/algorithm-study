package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[24];
        int val1 = sc.nextInt();

        for(int i = 0; i < val1; i++){
            int val2 = sc.nextInt();
            arr[val2 - 1] += 1;
        }

        for(int i = 0; i< 23; i++){
            System.out.print(arr[i] + " ");
        }
    }
}