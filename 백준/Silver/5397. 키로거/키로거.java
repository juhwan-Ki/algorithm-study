import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> list;
        // 입력받음
        int n = Integer.parseInt(reader.readLine());

        // 반복돌며 비밀번호를 알아냄
        for (int i = 0; i < n; i++) {
            list = new LinkedList<>();
            ListIterator<Character> iterator = list.listIterator();
            String pwd = reader.readLine();

            int idx = 0;
            for (int j = 0; j < pwd.length(); j++) {
                char word = pwd.charAt(j);

                switch(word) {
                    case '<' :
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        break;
                    case '>' :
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                        break;
                    case '-' :
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                            iterator.remove();
                        }
                        break;
                    default :
                        iterator.add(word);
                }
            }
            
            // 출력
            StringBuilder sb = new StringBuilder();
            for(char s : list) {
                sb.append(s);
            }
            System.out.println(sb.toString());
        }

    }
}