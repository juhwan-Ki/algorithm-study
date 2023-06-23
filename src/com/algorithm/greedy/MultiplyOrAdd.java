package com.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyOrAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int sum = input.charAt(0) - '0';

        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - '0';
            if(num != 0){
                sum *= num;
            } else {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
