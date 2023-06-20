package inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bk10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int val = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int max = -1000001;
        int min = 1000001;
        for (int i = 0; i < val; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(max < num){
                max = num;
            }

            if(min > num){
                min = num;
            }
        }
        System.out.print(max + " " + min);
    }
}
