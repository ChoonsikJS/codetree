import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Shake implements Comparable<Shake> {
        int time;
        int from;
        int to;

        public Shake(int time, int from, int to) {
            this.time = time;
            this.from = from;
            this.to = to;
        }

        @Override
        public int compareTo(Shake o) {
            return Integer.compare(this.time, o.time);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 개발자 수
        int K = sc.nextInt(); // 남은 전염 횟수
        int P = sc.nextInt(); // 최초 병원
        int T = sc.nextInt(); // 시간

        Shake[] shakes = new Shake[T];
        for (int i = 0; i < shakes.length; i++) {
            shakes[i] = new Shake(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(shakes);
        boolean[] virus = new boolean[N]; // 감염확인
        int[] avail = new int[N]; // 남은 전염가능일수
        virus[P - 1] = true;
        avail[P - 1] = K;
        int idx = 0;

        while (idx < T) {
            int from = shakes[idx].from - 1;
            int to = shakes[idx].to - 1;

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
    }
}