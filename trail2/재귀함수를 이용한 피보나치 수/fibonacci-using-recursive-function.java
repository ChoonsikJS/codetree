import java.util.Scanner;

public class Main {
    static int 재귀(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        return 재귀(n-1)+재귀(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibo = 재귀(n);
        System.out.print(fibo);
    }
}