import java.util.Scanner;

public class Main {
    static int 재귀(int[] arr, int len){
        if(len==0) return arr[0];
        return 최소공배수(재귀(arr,len-1), arr[len]);
    }
    static int 최소공배수(int r, int c) {
        int n = Math.max(r, c);
        int x = 0;
        for (int i = n; i > 0; i--) {
            if (r%i == c%i && c%i == 0){
                x= i;
                break;
            }           
        }
        return (r*c)/x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print(재귀(arr,n-1));
        // Please write your code here.
    }
}