package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();

        if (90 <= iVal && iVal < 101) {
            System.out.println("A");
        } else if(70 <= iVal && iVal < 90){
            System.out.println("B");
        } else if (40 <= iVal && iVal < 70) {
            System.out.println("C");
        } else if (0 <= iVal && iVal < 40) {
            System.out.println("D");
        }
    }
}
