package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sVal = sc.nextLine().split(" ");
        System.out.println(Long.parseLong(sVal[0]) + Long.parseLong(sVal[1]));
    }
}
