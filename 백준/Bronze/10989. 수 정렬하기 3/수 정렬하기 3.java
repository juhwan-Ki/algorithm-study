import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int num = Integer.parseInt(reader.readLine());
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arr);

        for(int i = 0; i < num; i++){
            builder.append(arr[i]).append('\n');
        }

        System.out.println(builder);

    }
}
