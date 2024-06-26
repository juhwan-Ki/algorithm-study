import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopNum = Integer.parseInt(br.readLine());

        StringTokenizer str;
        String command;
        int num;
        for (int i = 0; i < loopNum; i++) {
            str = new StringTokenizer(br.readLine());
            command = str.nextToken();
            num = str.hasMoreTokens() ? Integer.parseInt(str.nextToken()) : 0;
            switch (command){
                case "push":
                    stack.push(num);
                    break;
                case "pop" :
                    if(stack.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.pop());
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    if(stack.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                default:
                    if(stack.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.peek());
                    break;
            }
        }
    }
}
