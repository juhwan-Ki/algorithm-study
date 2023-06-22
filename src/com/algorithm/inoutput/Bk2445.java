package com.algorithm.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bk2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());

        //상단 별찍기
        for(int i = 1 ; i <= val; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for(int k = 2 * val-i; k > 0; k--) {
                if(k>i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 하단 별찍기
        for(int i = 2; i <= val; i++) {
            for(int j = i; j <= val; j++) {
                System.out.print("*");
            }
            for(int k = 1; k < i*2-1; k++) {
                System.out.print(" ");
            }
            for(int h = val; h >= i; h--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
