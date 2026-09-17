import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        int tot_T = 0;

        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            tot_T += a[i][1];
        }
        int[][] t = new int[tot_T][2]; // [시간][a,b의 이동한 거리]
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }
        // Please write your code here.

        int idx = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = a[i][1]; j > 0; j--) {
                sum += a[i][0];
                t[idx++][0] = sum;
            }
        }
        idx = 0;
        sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = b[i][1]; j > 0; j--) {
                sum += b[i][0];
                t[idx++][1] = sum;
            }
        }

        int leader = 0;
        int ans = 0;
        boolean same = false;

        for (int i = 0; i < t.length; i++) {
            int A = t[i][0];
            int B = t[i][1];
            if (A > B) {
                if (leader != 1)
                    ans++;
                leader = 1;
                same = false;
            } else if (B > A) {
                if (leader != 2)
                    ans++;
                leader = 2;
                same = false;
            } else if (A == B && !same) {
                leader = 0;
                same = true;
                ans++;
            }
        }

        System.out.println(ans);

    }
}