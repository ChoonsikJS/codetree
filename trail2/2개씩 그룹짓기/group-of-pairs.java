import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        // Please write your code here.
        int max = 0;
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            max = Math.max(max, nums[s++] + nums[e--]);
        }
        System.out.println(max);
    }
}
