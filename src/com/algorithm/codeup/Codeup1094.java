package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int[] arr = new int[val1];

        for(int i = 0; i < val1; i++){
            int val2 = sc.nextInt();
            arr[i] = val2;
        }

        for(int i = val1 - 1; i >= 0 ; i--){
            System.out.printf("%d ", arr[i]);
        }
    }
}