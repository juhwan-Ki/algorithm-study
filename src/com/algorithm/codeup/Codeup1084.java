package com.example.javaproject.codeup;

import java.io.*;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        // System.out.println() or printf() 와 Scanner 함수가 입출력 받는 시간이 오래걸려 시간 초과가 나옴
        // BufferedReader 와 BufferedWriter를 사용하여 시간을 줄일 수 있다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");

        int red = Integer.parseInt(input[0]);
        int green = Integer.parseInt(input[1]);
        int blue = Integer.parseInt(input[2]);
        int cnt = 0;

        for(int i = 0; i < red; i++){
            for(int j = 0; j < green; j++){
                for(int k = 0; k < blue; k++){
                    bw.write(i + " " + + j +" " + k + "\n");
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt)); // write() String을 파라미터로 받기 때문에 형변환 해줘야함 형변환 하지 않으면 안나옴
        bw.flush(); // 버퍼에 남아 있는 데이터를 출력 스트림으로 모두 보내는 역할
        bw.close(); // 출력 스트림을 닫고, 해당 스트림에 대한 리소스를 해제
    }
}
