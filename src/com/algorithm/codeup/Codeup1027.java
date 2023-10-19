package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputValue = sc.next().split("\\.");
        int year = Integer.parseInt(inputValue[0]);
        int month = Integer.parseInt(inputValue[1]);
        int day = Integer.parseInt(inputValue[2]);
        System.out.printf("%02d-%02d-%4d",day,month,year);
    }
}
