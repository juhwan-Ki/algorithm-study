import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        while(n != 0) {
            if(n - 3 > 3) {
                n -= 3;
            } else {
                n -= 1;
            }

            result++;
        }

        if(result % 2 != 0) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
