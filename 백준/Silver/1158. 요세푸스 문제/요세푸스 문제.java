import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 순열 생성
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        // 리스트가 1개가 남을 때 까지 순열을 반복하여 제거
        sb.append("<");
        while (list.size() != 1) {
            // k 값이 아니면 뒤로 이동
            for (int i = 0; i < k - 1; i++) {
                list.add(list.remove());
            }
            sb.append(list.remove() + ", ");
        }
        sb.append(list.remove() + ">");

        writer.write(sb.toString());
        writer.flush();
        writer.close();
        reader.close();
    }
}