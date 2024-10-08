import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(map.getOrDefault(key, 0)).append(' ');
        }

        System.out.println(sb);
    }
}
