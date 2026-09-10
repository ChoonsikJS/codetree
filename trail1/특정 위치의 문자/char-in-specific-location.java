import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        String[] arr = {"L","E","B","R","O","S"};
        Scanner sc = new Scanner(System.in);
        int ans = -1;
        String x = sc.next();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(x)){
                ans = i;
            }
        }
        if (ans!=-1) System.out.print(ans);
        else System.out.print("None");
    }
}