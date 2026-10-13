import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] dr = { -1, 1, 0, 0 };
    public static int[] dc = { 0, 0, -1, 1 };

    public static boolean[][] visited;
    public static int[][] grid;

    public static boolean inRange(int r, int c) {
        return r >= 0 && c >= 0 && r < n && c < n;
    }

    public static boolean canGo(int r, int c) {
        return inRange(r, c) && grid[r][c] == 0 && !visited[r][c];
    }

    public static void go(int r, int c, Queue<int[]> q) {
        visited[r][c] = true;
        q.offer(new int[] { r, c });
    }

    public static void bfs(Queue<int[]> q) {
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (canGo(nr, nc)) {
                    go(nr, nc, q);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        Queue<int[]> q = new ArrayDeque<>();
        grid = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int ans = 0;

        for (int k = 0; k < m; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (canGo(x - 1, y - 1))
                go(x - 1, y - 1, q);
        }
        bfs(q);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 && visited[i][j])
                    ans++;
            }
        }
        System.out.println(ans);
    }
}