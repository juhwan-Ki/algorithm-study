package com.algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int wordCnt = Integer.parseInt(reader.readLine());
        int answer = wordCnt;
        String word;
        // 단어 수 만큼 반복
        for (int i = 0; i < wordCnt; i++) {
            word = reader.readLine();
            // 소문자 갯수만큼 배열 생성
            boolean[] checkAlphabet = new boolean[26];
            //이전 문자의 인덱스값을 저장하는 변수
            int prev = 0;
            // 그룹 단어인지 체크
            for (int j = 0; j < word.length(); j++) {
                // 현재 알파벳 체크
                int nowAlphabet = word.charAt(j);
                // 현재 알파벳과 기존 알파벳이 같이 않는 경우
                if(prev != nowAlphabet) {
                    // 처음 들어온 경우
                    if(!checkAlphabet[nowAlphabet - 'a']) {
                        checkAlphabet[nowAlphabet - 'a'] = true;
                        prev = nowAlphabet;
                    }
                    // 처음 들어온게 아닌 경우
                    else {
                        answer--;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        System.out.println(answer);
    }
}
