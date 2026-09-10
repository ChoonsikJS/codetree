import java.util.Scanner;
public class Main {
    static int 재귀(int[] n, int len){
        if(len==0) return n[len];
        return Math.max(재귀(n,len-1), n[len]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(재귀(arr,n-1));
        // Please write your code here.
    }
}