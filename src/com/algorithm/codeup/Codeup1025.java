package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputValue = sc.next().split("");
        System.out.println("[" + Integer.parseInt(inputValue[0]) * 10000+ "]");
        System.out.println("[" + Integer.parseInt(inputValue[1]) * 1000+ "]");
        System.out.println("[" + Integer.parseInt(inputValue[2]) * 100 + "]");
        System.out.println("[" + Integer.parseInt(inputValue[3]) * 10+ "]");
        System.out.println("[" + Integer.parseInt(inputValue[4])+ "]");
    }
}
