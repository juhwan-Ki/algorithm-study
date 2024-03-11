import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n + 1];

        // 수열 초기화
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        // 스택 생성
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        StringBuffer buffer = new StringBuffer();
        boolean result = true;

        for (int i = 0; i < n; i++) {
            // 수열의 값
            int su = arr[i];
            if(su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    buffer.append("+\n");
                }
                stack.pop();
                buffer.append("-\n");
            } else {
                int num2 = stack.pop();
                if(num2 > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    buffer.append("-\n");
                }
            }
        }
        if(result) System.out.println(buffer.toString());
    }
}