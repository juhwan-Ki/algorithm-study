package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] twoNum = sc.nextLine().split(" ");
        if(Integer.parseInt(twoNum[0]) == 0 && Integer.parseInt(twoNum[1]) ==0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
