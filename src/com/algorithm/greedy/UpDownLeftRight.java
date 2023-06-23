package com.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UpDownLeftRight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int volume = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int x = 1;
        int y = 1;

        // 이동하는 경로를 체크
       while (st.hasMoreTokens()){
           String move = st.nextToken();

           if(move.equals("R")){
               if(y != volume + 1){
                   y++;
               }
           } else if (move.equals("L")){
               if(y != 1){
                   y--;
               }
           } else if(move.equals("U")) {
               if (x != 1) {
                   x--;
               }
           } else if(move.equals("D")) {
               if (x != volume + 1) {
                   x++;
               }
           }
       }
        System.out.println(x + " " + y);
    }
}
