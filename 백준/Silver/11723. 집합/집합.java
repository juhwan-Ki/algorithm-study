import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    private static final Set<Integer> list = new HashSet<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder builder = new StringBuilder();
        StringTokenizer st = null;
        int num = 0;
        String command = null;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            command = st.nextToken();

            if(st.hasMoreTokens())
                num = Integer.parseInt(st.nextToken());

            switch (command) {
                case "add":
                    add(num);
                    break;
                case "remove":
                    remove(num);
                    break;
                case "check":
                    if(check(num))
                        builder.append("1");
                    else
                        builder.append("0");

                    builder.append("\n");
                    break;
                case "toggle":
                    if(check(num))
                        remove(num);
                    else
                        add(num);
                    break;
                case "all":
                    all();
                    break;
                case "empty":
                    list.clear();
                    break;
                default:
                    throw new IllegalArgumentException("invalid command");
            }
        }

        System.out.println(builder.toString());
    }

    static void add(int num) {
        list.add(num);
    }

    static void remove(int num) {
        list.remove(num);
    }

    static boolean check(int num) {
        return list.contains(num);
    }

    static void all() {
        list.clear();
        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }
    }
}
