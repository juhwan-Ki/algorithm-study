package com.algorithm.programmers;


public class Pro12947 {
    public boolean solution(int x) {
        int sum = 0;
        // 자릿수를 구할 때 x의 값이 변하기 때문에
        // x의 값을 저장하는 변수를 선언
        int number = x;

        // 자릿수의 합을 구함
        while (x > 0){
            sum += x % 10;
            x /= 10;
        }

        // 결과값 확인
        return number % sum == 0? true : false;
    }
}
