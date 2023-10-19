package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String star = "**";
        String blank = "";

        for (int i = 0; i < num; i++) {
            System.out.println(blank + star);
            blank += " ";
        }
    }
}
