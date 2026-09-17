import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 개발자 수
        int K = sc.nextInt(); // 남은 전염 횟수
        int P = sc.nextInt(); // 최초 병원
        int T = sc.nextInt(); // 시간
        int[][] shakes = new int[T][3];
        boolean[] virus = new boolean[N]; // 감염확인
        int[] avail = new int[N]; // 남은 전염가능일수

        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); // 초
            shakes[i][1] = sc.nextInt(); // from
            shakes[i][2] = sc.nextInt(); // to
        }
        Arrays.sort(shakes, (a, b) -> Integer.compare(a[0], b[0]));
        // System.out.println(Arrays.deepToString(shakes));
        int idx = 0;
        virus[P - 1] = true;
        avail[P - 1] = K;
        while (idx < T) {
            int from = shakes[idx][1] - 1;
            int to = shakes[idx][2] - 1;

            boolean canFrom = (virus[from] && avail[from] > 0);
            boolean canTo = (virus[to] && avail[to] > 0);

            if (canFrom) { // 감염일수가 남으면 감염인 virus는 감염 여부확인 (한번 감염시 감염 불가)
                avail[from]--;
                if (!virus[to]) {
                    virus[to] = true;
                    avail[to] = K;
                }
            }
            if (canTo) {
                avail[to]--;
                if (!virus[from]) {
                    virus[from] = true;
                    avail[from] = K;
                }
            }

            idx++;
        }
        for (int i = 0; i < N; i++) {
            if (virus[i]) {
                System.out.print(1);
            } else
                System.out.print(0);
        }
        // Please write your code here.
    }
}