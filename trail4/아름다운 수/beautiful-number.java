import java.util.Scanner;

public class Main {
    public static int n, sum = 0;
    public static int[] arr;

    public static boolean check() {
        for (int i = 0; i < n;) {
            // 현재 숫자가 arr[i]일 때, 앞으로 arr[i]개의 자리가 남아있지 않으면 false
            if (i + arr[i] > n)
                return false;
            // arr[i]부터 arr[i]개의 연속된 숫자가 모두 같은 숫자인지 확인
            for (int j = i; j < i + arr[i]; j++) {
                if (arr[i] != arr[j])
                    return false;
            }
            // 검사한 블록의 크기(arr[i])만큼 인덱스를 건너뜁니다.
            i += arr[i];
        }
        return true;
    }

    // 0번째 자리부터 n-1번째 자리까지 1~4를 채우는 중복순열 백트래킹
    public static void dfs(int curr) {
        if (curr == n) {
            if (check())
                sum++;
            return;
        }

        for (int i = 1; i <= 4; i++) {
            arr[curr] = i;
            dfs(curr + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        dfs(0);
        System.out.println(sum);
    }
}