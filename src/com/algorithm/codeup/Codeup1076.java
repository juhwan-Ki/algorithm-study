package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);

        for(char i = 'a'; i<= alphabet; i++){
            System.out.print(i + " ");
        }

    }
}
