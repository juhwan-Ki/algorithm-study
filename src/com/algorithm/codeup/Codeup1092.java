package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int person1 = sc.nextInt();
        int person2 = sc.nextInt();
        int person3 = sc.nextInt();
        int day = 1;

        while (day % person1 != 0 || day % person2 != 0 || day % person3 != 0){
            day++;
        }
        System.out.println(day);
    }
}