import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        int[][] numArrs = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            numArrs[i][0] = Integer.parseInt(st.nextToken());
            numArrs[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numArrs, (num1, num2) -> {
            return num1[0] != num2[0] ? num1[0] - num2[0] : num1[1] - num2[1];
        });

        StringBuilder sb = new StringBuilder();
        for (int[] numArr : numArrs) {
            for (int num : numArr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
