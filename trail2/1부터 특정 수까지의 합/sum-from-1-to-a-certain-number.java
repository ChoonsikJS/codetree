import java.util.Scanner;
public class Main {
    static int 곱하기(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return sum/10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = 곱하기(n);
        System.out.print(n);
        // Please write your code here.
    }
}
