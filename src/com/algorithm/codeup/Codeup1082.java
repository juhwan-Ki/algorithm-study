package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hexVal = sc.nextInt(16); // nextInt(16)으로 하게되면 16진수로 받아 올 수 있음
        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", hexVal, i, hexVal * i);
        }

    }
}
