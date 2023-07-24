package com.algorithm.string;

import java.util.Scanner;

public class FindChar {

    public int solution(String str, char t) {
        int answer = 0;
        // 일반 for문 사용
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == t) answer++;
//        }

        // 향샹된 for문 사용
        for(char x : str.toCharArray()) {
            if(t == x) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindChar fc = new FindChar();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        char t = Character.toLowerCase(sc.next().charAt(0));
        System.out.println(fc.solution(str, t));
    }
}
