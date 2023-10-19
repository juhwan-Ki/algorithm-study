package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = "";

        for(int i = 1; i <= num; i++){
            if(i % 3 != 0){
                result += i + " ";
            }
        }
        System.out.println(result);
    }
}
