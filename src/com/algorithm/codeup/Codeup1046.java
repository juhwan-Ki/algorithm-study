package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] threeNum = sc.nextLine().split(" ");
        int iOne =  Integer.parseInt(threeNum[0]);
        int iTwo =  Integer.parseInt(threeNum[1]);
        int iThree =  Integer.parseInt(threeNum[2]);
        System.out.printf("%d\n", iOne + iTwo + iThree);
        System.out.printf("%.1f\n", (iOne + iTwo + iThree) / 3.0);

    }
}
