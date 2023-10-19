package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int val;
        int idx = 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                val = sc.nextInt();
                arr[i][j] = val;
            }
        }

        // 내가 작성한 코드는 if문이 너무 많이 들어가서 가독성이 많이 떨어짐
//        boolean stop = false;
//        for (int i = 1; i < arr.length; i++) {
//            System.out.println(stop);
//            if(arr[i][idx -1] == 2){
//                arr[i][idx -1] = 9;
//                break;
//            } else if (stop){
//                arr[i - 1][idx] = 9;
//                break;
//            } else if (i == arr.length -1) {
//                break;
//            } else {
//                arr[i][idx -1] = 9;
//            }
//            for (int j = idx; j < arr.length; j++) {
//                if (arr[i][j] == 1) {
//                    break;
//                } else if (arr[i][j] == 2) {
//                    stop = true;
//                    break;
//                } else {
//                    arr[i][j] = 9;
//                    idx++;
//                }
//            }
//        }
        // 내가 작성한 코드를 while을 써서 리팩토링해봄
        int x = 1;
        int y = 1;
        while(true){
            if(arr[x][y] == 2){
                arr[x][y] = 9;
                break;
            }
            if(arr[x][y] == 1){
                y--; // 오른쪽으로 못가니 오른쪽 -- 해주고
                x++; // 밑으로 내려가게 한다.
            }
            if(arr[x][y] == 0){
                arr[x][y] = 9;
                y++;
            }
            if (x == arr.length -1 || y == arr.length -1) {
                break;
            }
        }

        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}