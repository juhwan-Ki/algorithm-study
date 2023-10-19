package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        double h = Integer.parseInt(arr[0]);
        double b = Integer.parseInt(arr[1]);
        double c = Integer.parseInt(arr[2]);
        double s = Integer.parseInt(arr[3]);
        double save = h * b * c * s / 8 / 1024 / 1024;
        System.out.printf("%.1f MB", save);
    }
}
