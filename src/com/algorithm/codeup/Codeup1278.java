package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = 0;

        while(num > 0){
            num /= 10;
            digits++;
        }
        System.out.println(digits);
    }
}
