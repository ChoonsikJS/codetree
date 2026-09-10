import java.util.Scanner;

public class Main {
    public static void print5Stars(int r, int c) {
        int n = Math.max(r, c);
        int x = 0;
        for (int i = n; i > 0; i--) {
            if (r%i==c%i&& c%i==0){
                x= i;
                break;
            }           
        }
        System.out.print((r*c)/x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print5Stars(n,m); 
        // Please write your code here.
    }
}