import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loopNum = Integer.parseInt(br.readLine());

        String command;
        int num = 0;

        for (int i = 0; i < loopNum; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            command = str.nextToken();

            switch (command){
                case "push":
                    num = Integer.parseInt(str.nextToken());
                    queue.offer(num);
                    break;
                case "pop" :
                    if(queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(queue.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    if(queue.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "front" :
                    if(queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(queue.peek()).append("\n");
                    break;
                case "back":
                    if(queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(num).append("\n");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid command");
            }
        }
        System.out.println(sb);
    }
}