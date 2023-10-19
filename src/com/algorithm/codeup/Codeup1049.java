package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] twoNum = sc.nextLine().split(" ");
        System.out.printf("%d", Integer.parseInt(twoNum[0]) > Integer.parseInt(twoNum[1])? 1 : 0);

    }
}
