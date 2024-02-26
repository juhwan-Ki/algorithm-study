import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        String answer = "";
        int val = 0;

        StringTokenizer st2 = new StringTokenizer(reader.readLine());

        for (int i = 0; i < N; i++) {
            val = Integer.parseInt(st2.nextToken());

            if(X > val) {
                answer += val + " ";
            }
        }

        System.out.println(answer);
    }
}