package inoutput;

import java.util.Scanner;

public class Bk11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int val1 = Integer.parseInt(sc.next());
            int val2 = Integer.parseInt(sc.next());
            System.out.printf("Case #%s: %s + %s = %s\n", i + 1, val1, val2, val1 + val2);
            sc.nextLine();
        }
    }
}
