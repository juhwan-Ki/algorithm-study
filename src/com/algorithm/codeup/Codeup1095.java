package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        // 해당 코드는 반복문을 사용해서 코드가 길고 실행 시간이 많이 걸린다.
//        int[] arr = new int[val1];
//        for(int i = 0; i < val1; i++){
//            int val2 = sc.nextInt();
//            arr[i] = val2;
//        }
//
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(arr[0]);

        // 위 코드를 리팩토링한 코드
        int min = 24;
        for (int i = 0; i < val1; i++) {
            int val2 = sc.nextInt();
            if(min > val2){
                min = val2;
            }
        }
        System.out.println(min);
    }
}