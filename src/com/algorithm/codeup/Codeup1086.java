package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        double r = Integer.parseInt(arr[0]);
        double g = Integer.parseInt(arr[1]);
        double b = Integer.parseInt(arr[2]);
        double save = r * g * b / 8 / 1024 / 1024;
        System.out.printf("%.2f MB", save);
    }
}
