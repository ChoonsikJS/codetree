import java.util.Scanner;

public class Main {
    static int 재귀(int n){
        if(n==1) return 1;
        return 재귀(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(재귀(n));
        // Please write your code here.
    }
}