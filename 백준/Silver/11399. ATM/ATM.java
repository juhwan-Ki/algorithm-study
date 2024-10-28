import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[] strArr = reader.readLine().split(" ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(arr);
        int prev = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (arr[i] + prev);
            prev += arr[i];
        }

        System.out.println(sum);
    }
}