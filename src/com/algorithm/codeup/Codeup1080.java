package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int result = 0;

        for(int i = 1; i < val; i++){
            result += i;
            if(result >= val){
                System.out.println(i);
                break;
            }
        }
    }
}
