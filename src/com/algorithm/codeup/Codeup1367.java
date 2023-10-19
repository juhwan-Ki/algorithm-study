package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String star = "";
        String blank = "";
        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            star += "*";
        }

        for (int i = 0; i < num ; i++) {
            arr[i] = blank + star;
            blank += " ";
        }

        for (int i = num -1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
