package inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bk2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());

        // 상단 역삼각형
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * val -1)-(i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 하단 삼각형
        for (int i = 0; i < val - 1; i++) {
            for (int j = 1; j < val - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3 + (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

