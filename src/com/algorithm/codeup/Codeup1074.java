package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countNum = sc.nextInt();
        int loopNum = countNum;

        for(int i = 0; i < loopNum; i++){
            System.out.println(countNum--);
        }
    }
}
