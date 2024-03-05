import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 재료 갯수
        int n = Integer.parseInt(reader.readLine());
        // 고유의 수
        int m = Integer.parseInt(reader.readLine());
        // 재료
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int[] materials = new int[n];

        for (int i = 0; i < n; i++) {
            materials[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬
        Arrays.sort(materials);

        // n이랑 같을 때 경우의 수를 미리 카운트
        int cnt = 0;
        int start = 0; // 시작
        int end = n - 1; // 끝
        int sum = 0;

        while (end > start) {
            sum = materials[start] + materials[end];
            if(sum == m) {
                cnt++;
                end--;
            } else if(sum > m) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(cnt);
    }
}