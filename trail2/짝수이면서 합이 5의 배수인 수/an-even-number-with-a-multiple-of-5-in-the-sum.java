import java.util.Scanner;
public class Main {
    static String Yes = "Yes";
    static String No = "No";
    static void istarget(int n){
        int 십 = n/10;
        int 일 = n%10;
        if (n%2==0 && (십+일)%5==0){
            System.out.print(Yes);
        }else System.out.print(No);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        istarget(n);
        // Please write your code here.
    }
}