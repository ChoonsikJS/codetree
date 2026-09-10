import java.util.Scanner;

public class Main {
    static int min(int a,int b, int c){
        int d = Math.min(a, b);
        return Math.min(d, c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = min(a, b, c);
        System.out.print(min);        // Please write your code here.
    }
}