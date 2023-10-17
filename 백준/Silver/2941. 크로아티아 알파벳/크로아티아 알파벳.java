import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 글자 넣기
        String input = reader.readLine();
        // 바뀐 문자들
        String[] alphabetArray ={"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        //
        for (String alphabet : alphabetArray) {
            input = input.replace(alphabet, "A");
        }

        System.out.println(input.length());
    }
}
