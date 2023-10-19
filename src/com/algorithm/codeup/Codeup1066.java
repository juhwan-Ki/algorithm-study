package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        int[] iArrs = new int[]{iVal1,iVal2,iVal3};
        for(int i = 0; i < iArrs.length; i++){
            if(iArrs[i] % 2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
