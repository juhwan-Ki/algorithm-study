import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int idx = 0;

        List<Integer> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            coins.add(Integer.parseInt(reader.readLine()));
        }
        coins.sort(Collections.reverseOrder());

        while (k > 0){
            if (k >= coins.get(idx)) {
                cnt += k / coins.get(idx);
                k %= coins.get(idx);
            }
            idx++;
        }
        System.out.println(cnt);
    }
}
