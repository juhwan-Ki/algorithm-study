package com.algorithm.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bk2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());

        for (int i = 0; i < val; i++) {
            for (int j = val - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
