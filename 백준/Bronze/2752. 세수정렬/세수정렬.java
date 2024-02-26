import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(reader.readLine());

       int[] numbers = new int[3];

       for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
       }

       Arrays.sort(numbers);

        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}