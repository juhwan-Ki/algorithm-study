import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        // 입력받음
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 합 배열 생성
        int[] sumArray = new int[n];
        st = new StringTokenizer(reader.readLine());

        for (int i = 0; i < n; i++) {
            if(i == 0) {
                sumArray[i] = Integer.parseInt(st.nextToken());
            } else {
                sumArray[i] = sumArray[i - 1] + Integer.parseInt(st.nextToken());
            }
        }

        // 구간합 구하기
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(reader.readLine());

            int start = Integer.parseInt(st.nextToken()) - 2;
            int end = Integer.parseInt(st.nextToken()) - 1;

            // 0보다 작으면
            if(start < 0) {
                System.out.println(sumArray[end]);
            } else {
                System.out.println(sumArray[end] - sumArray[start]);
            }
        }
    }
}