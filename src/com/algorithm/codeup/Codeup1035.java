package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sVal = sc.next();
        int iVal = Integer.parseInt(sVal, 16);
        String result = Integer.toOctalString(iVal);
        System.out.print(result);
    }
}
