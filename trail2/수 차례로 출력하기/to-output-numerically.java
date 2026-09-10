import java.util.Scanner;
public class Main {
    static void 재귀(int n) {
        if (n == 0) return;
        재귀(n - 1);
        System.out.print(n + " ");
        // 1 ~ 7
    }
    static void 재귀2(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        재귀2(n - 1);
        // 7 ~ 1
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        재귀(n);
        System.out.println();
        재귀2(n);
    }
}
