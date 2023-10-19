package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstVal = sc.nextInt();
        int secondVal = sc.nextInt();

        for(int i = 1; i <= firstVal; i++){
           for(int j = 1; j <= secondVal; j++){
               System.out.println(i + " " + j);
           }
        }
    }
}
