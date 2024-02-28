import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numberArray = new int[10];

        // 3개의 정수 입력 받음
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        // 곱한 값을 String으로 변경하여 문자 하나씩 자르기
        char[] chars = String.valueOf(num1 * num2 * num3).toCharArray();

        // 배열에 값 입력하기
        for (int i = 0; i < chars.length; i++) {
            numberArray[chars[i] - '0']++;
        }

        // 출력하기
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
    }
}