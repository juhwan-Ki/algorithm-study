package com.algorithm.inoutput;

import java.util.Scanner;

public class Bk11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();

        for (int i = 0; i < val.length(); i++) {
            System.out.print(val.charAt(i));
            if(i % 10 == 9) System.out.println();
        }
    }
}
