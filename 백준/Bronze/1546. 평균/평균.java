import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 과목 수 입력받기
        int subjectnum = Integer.parseInt(reader.readLine());

        // 점수 입력받기
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int[] scores = new int[subjectnum];

        for (int i = 0; i < subjectnum; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        // 최대값 찾고 합 구하기
        int sum = 0;
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > max) max = scores[i];
            sum += scores[i];
        }

        // 평균 구하기
        System.out.println(sum * 100.0 / max / subjectnum);
    }

}