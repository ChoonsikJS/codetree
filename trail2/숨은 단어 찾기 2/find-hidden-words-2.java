import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static final int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 }; // 상하좌우 좌우 좌우
    static final int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        char[][] arr = new char[n][m];
        String str;
        for (int i = 0; i < n; i++) {
            str = sc.next();
            arr[i] = str.toCharArray();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    for (int d = 0; d < 8; d++) {
                        int r1 = i + dr[d];
                        int r2 = i + (dr[d] * 2);
                        int c1 = j + dc[d];
                        int c2 = j + (dc[d] * 2);
                        if (range(r1, c1) && range(r2, c2) &&
                            arr[r1][c1] == 'E' && arr[r2][c2] == 'E') {
                            ans++;
                        }
                    }
                }
            }
        }
    System.out.println(ans);
}
    static boolean range(int r, int c) {
        return r >= 0 && c >= 0 && r < n && c < m;
    }
}