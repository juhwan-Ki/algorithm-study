package com.algorithm.inoutput;

import java.util.Scanner;

public class Bk11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int result = 0;
        String[] arr = sc.next().split("");

        for (int i = 0; i < val; i++) {
            result += Integer.parseInt(arr[i]);
        }
        System.out.println(result);
    }
}
