import java.util.Scanner;
public class Main {

    static int 재귀(int n){
        if(n == 1) return 0;
        if(n%2 == 0) return 재귀(n/2) + 1;
        if(n%2 == 1) return 재귀(n/3) + 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 재귀(n);
        System.out.print(ans);
    }
}