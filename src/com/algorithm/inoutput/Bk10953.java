package com.algorithm.inoutput;

import java.util.*;

public class Bk10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringTokenizer st;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(sc.next(), ",");
            int val1 = Integer.parseInt(st.nextToken());
            int val2 = Integer.parseInt(st.nextToken());
            System.out.println(val1 + val2);
        }
    }
}
