package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.printf("%.02f\n", (num1 + num2 + num3) / 3.0);
    }
}
