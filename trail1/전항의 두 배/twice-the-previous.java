import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (2*a)+b;
        System.out.print(a+" "+b+" ");
        for (int i = 0; i < 8; i++) {
            System.out.print(c+" ");
            a = b;
            b = c;
            c = (2*a)+b;
        }
    }
}