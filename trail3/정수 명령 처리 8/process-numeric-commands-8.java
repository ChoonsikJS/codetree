import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> l = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int x = 0 ;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (st.hasMoreTokens()){
                x = Integer.parseInt(st.nextToken());
            }

            if (command.equals("push_back"))
                l.addLast(x);
            if (command.equals("push_front"))
                l.addFirst(x);
            if (command.equals("pop_front"))
                sb.append(l.pollFirst()).append("\n");
            if (command.equals("pop_back"))
                sb.append(l.pollLast()).append("\n");
            if (command.equals("front"))
                sb.append(l.peekFirst()).append("\n");
            if (command.equals("back"))
                sb.append(l.peekLast()).append("\n");
            if (command.equals("empty")){
                if(l.isEmpty())
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }
            if (command.equals("size"))
                sb.append(l.size()).append("\n");
        }
        System.out.print(sb);
    }
}