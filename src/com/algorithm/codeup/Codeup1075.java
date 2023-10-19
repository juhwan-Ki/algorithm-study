package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countNum = sc.nextInt() -1;
        int loopNum = countNum;

        for(int i = 0; i <= loopNum; i++){
            System.out.println(countNum--);
        }
    }
}
