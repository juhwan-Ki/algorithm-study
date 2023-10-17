package com.algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1463 {
    
    public int solution(int val) {
        int[] dp = new int[val + 1];

        for (int i = 2; i <= val; i++) {

        }

        return dp[val];
    } 
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(reader.readLine());
        System.out.println(new Boj1463().solution(val));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(st.nextToken());
        
    }
}
