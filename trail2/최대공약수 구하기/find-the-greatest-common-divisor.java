import java.util.*;

public class Main {
    public static void print5Stars(int r, int c) {
        int n = Math.max(r, c);
        for (int i = n; i > 0; i--) {
            if (r%i==c%i&& c%i==0){
                System.out.print(i);
                return;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print5Stars(n,m);
        // Please write your code here.
    }
}