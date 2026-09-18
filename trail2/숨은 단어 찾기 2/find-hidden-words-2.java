import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 }; // 상하좌우 좌우 좌우
    static final int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        String str;
        for (int i = 0; i < n; i++) {
            str = sc.next();
            arr[i] = str.toCharArray();
        }

        int ans = 0;
        // L을 찾고 8방향 2칸 탐색
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    for (int d = 0; d < 8; d++) {
                        if (i + dr[d] >= 0 && j + dc[d] >= 0 &&
                                i + dr[d] < n && j + dc[d] < m &&
                                arr[i + dr[d]][j + dc[d]] == 'E') {
                            if (i + dr[d] + dr[d] >= 0 && j + dc[d] + dc[d] >= 0 &&
                                    i + dr[d] + dr[d] < n && j + dc[d] + dc[d] < m &&
                                    arr[i + dr[d] + dr[d]][j + dc[d] + dc[d]] == 'E') {
                                ans++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}