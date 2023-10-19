package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String answer = "";

        for (int i = 1; i <= num ; i++) {
            if(num % i == 0){
                answer += i + " ";
            }
        }
        System.out.println(answer);
    }
}
