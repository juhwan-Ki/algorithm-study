package inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bk2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());

        for (int i = 0; i < val; i++) {
            for (int k = 1; k < i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = val - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
