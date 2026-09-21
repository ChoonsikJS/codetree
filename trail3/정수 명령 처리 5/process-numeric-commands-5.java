import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        ArrayList<Integer> v = new ArrayList<>();
        // Please write your code here.
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(st.hasMoreTokens()){
                x = Integer.parseInt(st.nextToken());
            }

            if(str.equals("push_back")){
                v.add(x);
            }
            if(str.equals("get")){
                System.out.println(v.get(x-1));
            }
            if(str.equals("pop_back")){
                v.remove(v.size()-1);
            }
            if(str.equals("size")){
                System.out.println(v.size());
            }
        }
    }
}
