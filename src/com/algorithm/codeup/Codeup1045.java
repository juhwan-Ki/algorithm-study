package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] twoNum = sc.nextLine().split(" ");
        System.out.printf("%d\n", Integer.parseInt(twoNum[0]) + Integer.parseInt(twoNum[1]));
        System.out.printf("%d\n", Integer.parseInt(twoNum[0]) - Integer.parseInt(twoNum[1]));
        System.out.printf("%d\n", Integer.parseInt(twoNum[0]) * Integer.parseInt(twoNum[1]));
        System.out.printf("%d\n", Integer.parseInt(twoNum[0]) / Integer.parseInt(twoNum[1]));
        System.out.printf("%d\n", Integer.parseInt(twoNum[0]) % Integer.parseInt(twoNum[1]));
        System.out.printf("%.2f\n", Float.parseFloat(twoNum[0]) / Float.parseFloat(twoNum[1]));
    }
}
