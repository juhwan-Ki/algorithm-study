package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();
        for(int i = 0; i < val.length(); i++){
            System.out.printf("'%s'\n" ,val.charAt(i));
        }
    }
}
