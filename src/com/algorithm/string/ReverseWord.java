package com.algorithm.string;

import java.util.Scanner;

public class ReverseWord {

    public String[] solution(String[] strArr, int cnt) {
        for (int i = 0; i < cnt; i++) {
            String reverse = "";
            for (int j = strArr[i].length() -1; j >= 0 ; j--) {
                reverse += strArr[i].charAt(j);
            }
            strArr[i] = reverse;
            reverse = "";
        }
        return strArr;
    }

    public static void main(String[] args) {
        ReverseWord rs = new ReverseWord();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String[] strArr = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            strArr[i] = sc.next();
        }

        for(String x : rs.solution(strArr, cnt)) {
            System.out.println(x);
        }
    }
}
