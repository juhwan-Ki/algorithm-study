import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<String> queue = null;
        boolean done = true;

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split("");
            queue = new LinkedList<>();
            for (String s : str) {
                if(s.equals("(")) {
                    queue.offer(s);
                } else if(s.equals(")")) {
                    if(queue.poll() == null) {
                        done = false;
                        break;
                    }
                }
            }

            if(queue.isEmpty() && done) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                done = true;
            }

        }
    }
}
