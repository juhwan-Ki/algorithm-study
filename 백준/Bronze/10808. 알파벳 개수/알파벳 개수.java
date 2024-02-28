import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] alphaArray = new int[26];

        // 알파벳 입력받아 char array로 변경
        char[] alphabet = reader.readLine().toCharArray();

        // 해당 알파벳이 있으면 해당하는 인덱스에 ++ 하기
        for (int i = 0; i < alphabet.length; i++) {
            alphaArray[alphabet[i] - 'a']++;
        }

        // 출력
        for (int i = 0; i < alphaArray.length; i++) {
            System.out.print(alphaArray[i] + " ");
        }
    }
}