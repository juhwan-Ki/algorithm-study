package com.algorithm.dp;

public class Fibonacci {
    // n을 입력받고 n번째 피보니차 수열 출력
    public int fiboSimple(int n) {
        // k == 0, 1, 2
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        // f(k) = f(k-1) + f(k -2)
        return fiboSimple(n - 1) + fiboSimple(n - 2);
    }

    public int fiboMemo(int n){
        return finoMemoRe(n, new int[n + 1]);
    }

    // 피보나치를 사용하게 되면 지속적으로 재귀함수가 호출됨
    // 이미 계산된 값이 있어도 재귀호출을 하기 때문에 성능상의 손해를 봄
    // 이러한 부분을 개선하기 위해 이미 구한 값이 있으면 재귀함수를 호출하지 않고
    // 구해놓은 값을 넣어줌
    private int finoMemoRe(int n, int[] memo) {
        // k == 0, 1, 2
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        // f(k) = f(k-1) + f(k -2)
        // 이미 구해본 결과가 있다면 memo에 저장이 되어있을 것임
        else if(memo[n] == 0) {
            // 만약 아직 없다면 구함
            memo[n] = finoMemoRe(n - 1, memo) + finoMemoRe(n - 2, memo);
        }
        // meno[n]이 있다면 해당 값이 지금 구하고 있는 n번째 피보나치 수열 값을 리턴
        return memo[n];
    }

    // 재귀함수를 사용하지 않고 반복문을 사용하여 해결
    public int fiboTab(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        // 계산 결과 기록용 배열
        int[] fib = new int[n + 1];
        // 알고 있는 결과는 미리 기록
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i -2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 20;

        // fiboSimple 소요 시간 계산
        long start = System.nanoTime();
        System.out.println("simple");
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            resultBuilder.append(fibonacci.fiboSimple(i)).append(' ');
        }
        System.out.println(resultBuilder);
        System.out.println(System.nanoTime() - start);

        // fiboMemo 소요시간 계산
        start = System.nanoTime();
        System.out.println("memo");
        resultBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            resultBuilder.append(fibonacci.fiboMemo(i)).append(' ');
        }
        System.out.println(resultBuilder);
        System.out.println(System.nanoTime() - start);
        System.out.println();

        // fiboTab 소요시간 계산
        start = System.nanoTime();
        System.out.println("tab");
        resultBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            resultBuilder.append(fibonacci.fiboTab(i)).append(' ');
        }
        System.out.println(resultBuilder);
        System.out.println(System.nanoTime() - start);
        System.out.println();

    }
}
