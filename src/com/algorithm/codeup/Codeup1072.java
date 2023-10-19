package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCnt = sc.nextInt();
        sc.nextLine();
        String[] numArrs = sc.nextLine().split(" ");

        for(int i = 0; i < numArrs.length; i++){
            System.out.println(numArrs[i]);
        }
    }
}
