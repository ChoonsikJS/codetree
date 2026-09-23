import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max =Integer.MAX_VALUE;
        int dest = 1;
        while (dest<=n) {
            int tmp=0;
            for (int i = 0; i < n; i++) {
                tmp += a[i] * (Math.abs(dest-(i+1)));
            }
            max=Math.min(max, tmp);
            dest++;
        }
        System.out.print(max);
        // Please write your code here.
    }
}