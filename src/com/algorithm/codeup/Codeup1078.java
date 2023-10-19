package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int outputNum = 0;

        for(int i = 0; i <= num; i++) {
            if(i % 2 == 0){
                outputNum += i;
            }
        }
            System.out.println(outputNum);
    }
}
