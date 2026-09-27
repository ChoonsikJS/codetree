import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class pair {
    int r, c;

    public pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

public class Main {
    public static List<pair> bombs;
    public static int[][][] bomb_type = {
            {},
            { { -2, 0 }, { -1, 0 }, { 0, 0 }, { 1, 0 }, { 2, 0 } },
            { { -1, 0 }, { 1, 0 }, { 0, 0 }, { 0, -1 }, { 0, 1 } },
            { { -1, -1 }, { -1, 1 }, { 0, 0 }, { 1, -1 }, { 1, 1 } },
    };

    public static int[] selected;
    public static int n, max = 0;

    public static void dfs(int curr) {
        if (curr == bombs.size()) {
            simulate();
            return;
        }

        for (int type = 1; type <= 3; type++) {
            selected[curr] = type;
            dfs(curr + 1);
        }
    }

    public static void simulate() {
        boolean[][] chk = new boolean[n][n];
        int cnt = 0;
        for (int i = 0; i < bombs.size(); i++) {
            pair bomb = bombs.get(i);
            int type = selected[i];
            for (int j = 0; j < 5; j++) {
                int r1 = bomb.r + (bomb_type[type][j][0]);
                int c1 = bomb.c + (bomb_type[type][j][1]);
                if (isRange(r1, c1)) {
                    chk[r1][c1] = true;
                }
            }
        }
        cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (chk[i][j]) {
                    cnt++;
                }
            }
        }
        max = Math.max(max, cnt);
    }

    public static boolean isRange(int r, int c) {
        return r < n && c < n && r >= 0 && c >= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[][] grid = new int[n][n];
        bombs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int isbomb = sc.nextInt();
                if (isbomb == 1) {
                    bombs.add(new pair(i, j));
                }
            }
        }
        selected = new int[bombs.size()];

        dfs(0);
        System.out.println(max);

        /// 1. 세로, 십자, X자 폭탄이 있다.
        /// 2. 1 로 표시된 구역에 세 가지 폭탄 중 하나를 설치 할 수 있다.
        /// 3. aaa ... ccc 까지 폭탄의 경우의 수를 확인하며 터트릴 수 있는 최대 칸 수를 센다.
        /// ? 반드시 모든 경우의 수를 확인해야 하는가?
        // 재귀 함수로 확인..?
    }
}