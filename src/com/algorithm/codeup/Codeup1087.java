package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int cnt = 1;

        while(true){
            if(result >= num){
                System.out.println(result);
                break;
            } else{
                result += cnt++;
            }
        }
    }
}
