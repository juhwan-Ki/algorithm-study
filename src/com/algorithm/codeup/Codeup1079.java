package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char val;

        while (true) {
            val = sc.next().charAt(0);
            if (val == 'q') {
                System.out.println(val);
                break;
            } else {
                System.out.println(val);
            }
        }
    }
}
