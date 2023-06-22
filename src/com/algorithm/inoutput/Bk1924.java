package com.algorithm.inoutput;

import java.util.Scanner;

public class Bk1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int month = Integer.parseInt(input[0]);
        int day = Integer.parseInt(input[1]);

        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int index = 0;
        for (int i = 0; i < month; i++) {
            index += months[i];
        }
        index += day - 1;
        System.out.print(days[index % 7]);
    }
}
