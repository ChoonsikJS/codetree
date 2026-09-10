import java.util.Scanner;
public class Main {
    static int ten(int n){
        if(n<10) return n;
        return n%10 + ten(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(ten(a*b*c));
    }
}