import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> list = new LinkedList<>();

        // 입력받음
        String str = reader.readLine();
        int cNum = Integer.parseInt(reader.readLine());

        // 리스트 생성
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        // 명령어에 따라 변경 하도록 수정
        // 1. P이면 왼쪽에 추가
        // 2. L이면 왼쪽으로 이동 (맨 앞이면 무시)
        // 3. D이면 오른쪽으로 이동 (맨 뒤면 무시)
        // 4. B이면 왼쪽 커서 값 삭제

        ListIterator<Character> iter = list.listIterator();
        // 커서 초기화
        while(iter.hasNext()) {
            iter.next();
        }

        StringTokenizer st;
        for (int i = 0; i < cNum; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            String command = st.nextToken();
            // P이면 왼쪽 idx에 추가 
            if(command.equals("P")) {
                iter.add(st.nextToken().charAt(0));
            }
            // L이면 왼쪽으로 이동
            else if (command.equals("L")) {
                if(iter.hasPrevious()) iter.previous();
            }
            // D이면 오른쪽으로 이동
            else if(command.equals("D")) {
                if(iter.hasNext()) iter.next();
            }
            // B이면 왼쪽 커서 삭제
            else if (command.equals("B")) {
                if(iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();
                }
            }
        }

        // 출력
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        for(Character chr : list) {
            writer.write(chr);
        }
        
        writer.flush();
        writer.close();
    }
}