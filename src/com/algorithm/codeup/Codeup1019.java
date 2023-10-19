package com.example.javaproject.codeup;

import java.text.ParseException;
import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String[] val1 = sc.next().split("\\.");
        int year = Integer.parseInt(val1[0]);
        int month = Integer.parseInt(val1[1]);
        int day = Integer.parseInt(val1[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
