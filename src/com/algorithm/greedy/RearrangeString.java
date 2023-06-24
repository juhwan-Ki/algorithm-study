package com.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RearrangeString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        List<Character> list = new ArrayList<>();
        int num = 0;
        // 알파벳과 숫자를 분리
        for (int i = 0; i < input.length(); i++) {
            char chars = input.charAt(i);
            if(chars >= 'A'){
                list.add(chars);
            } else {
                num += chars - '0';
            }
        }
        // 알파벳 오름차순 정렬
        Collections.sort(list);
        // 알파벳을 출력
        for (Character character : list) {
            System.out.print(character);
        }
        // 숫자 출력
        if(num != 0) System.out.print(num);
    }
}
