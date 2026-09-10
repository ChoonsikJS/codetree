import java.util.Scanner;
public class Main {
    static int 재귀(int n){
        if(n<10) return n*n;
        return 재귀(n/10) + (n%10)*(n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(재귀(n));
        // Please write your code here.
    }
}