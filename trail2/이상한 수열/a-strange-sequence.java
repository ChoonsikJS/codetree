import java.util.Scanner;
public class Main {
    static int 재귀(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return 재귀(n/3)+재귀(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(재귀(n));
        // Please write your code here.
    }
}