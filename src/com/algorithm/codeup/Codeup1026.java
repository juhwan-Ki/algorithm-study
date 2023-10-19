package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputValue = sc.next().split(":");
        System.out.printf("%d", Integer.parseInt(inputValue[1]));
    }
}
