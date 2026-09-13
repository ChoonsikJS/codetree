import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();
        }
        char x = sc.next().charAt(0);
        double sum = 0;
        int cnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(0)==x){
                sum+=arr[i].length(); cnt+=1;
            }
        }
        double ans = sum/cnt;
        System.out.printf("%d %.2f", cnt, ans);
    }
}