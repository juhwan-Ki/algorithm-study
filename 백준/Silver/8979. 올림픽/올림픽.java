import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int cer = Integer.parseInt(st.nextToken());
        int[][] arr = new int[num+1][4];
        int rank = 1;

        for(int i=1; i<=num; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            arr[idx][0] = Integer.parseInt(st.nextToken());
            arr[idx][1] = Integer.parseInt(st.nextToken());
            arr[idx][2] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<=num; i++) {
            if(arr[i][0] > arr[cer][0]) {
                rank++;
            }
            else if(arr[i][0] == arr[cer][0] && arr[i][1] > arr[cer][1]) {
                rank++;
            }
            else if(arr[i][0] == arr[cer][0] && arr[i][1] == arr[cer][1] && arr[i][2] > arr[cer][2]) {
                rank++;
            }
        }
        System.out.println(rank);
    }
}