package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        while (true) {
//            int val = sc.nextInt();
//            if (val == 0) {
//                return;
//            } else {
//                System.out.println(val);
//            }
//        }
        // do while로 풀기
        int num;
        do {
            num = sc.nextInt();
            if(num != 0) {
                System.out.println(num);
            }
        } while (num != 0);
    }
}
