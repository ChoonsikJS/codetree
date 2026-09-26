import java.util.Scanner;

public class Main {
    public static int k, n;
    public static int[] sel;

    public static void dfs(int curr) {
        if (curr == n) {
            for (int i = 0; i < sel.length; i++) {
                System.out.print(sel[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            sel[curr] = i;
            dfs(curr + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        sel = new int[n];
        // Please write your code here.
        dfs(0);
    }
}