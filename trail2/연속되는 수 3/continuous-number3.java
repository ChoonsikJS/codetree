import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0;
        int pos = 0;
        int cnt = 0;
        int max = 1;
        for (int i = 0; i < n; i++) {
            pos = sc.nextInt();
            if (prev != 0 && (pos > 0 && prev > 0)) {
                cnt++;
                max = Math.max(max, cnt);
            } else if (prev != 0 && (pos < 0 && prev < 0)) {
                cnt++;
                max = Math.max(max, cnt);
            }else
                cnt = 1;
            prev = pos;
        }
        System.out.println(max);
        // Please write your code here.
    }
}