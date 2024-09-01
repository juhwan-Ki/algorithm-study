import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder builder = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] titles = new String[n];
        int[] nums = new int[n];
        int num = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            titles[i] = st.nextToken();
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            num = Integer.parseInt(br.readLine());
            int start = 0;
            int end = n -1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if(nums[mid] < num) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            builder.append(titles[start]).append("\n");
        }
        System.out.println(builder.toString());
    }
}