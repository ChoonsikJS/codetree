import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int sum_a = 0;
        int sum = 0;

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            // System.out.println(arr[i]);
            sum += arr[i].length();
            if(arr[i].length()>=1 && arr[i].charAt(0)=='a') {sum_a++;}
        }
        System.out.print(sum+" "+sum_a);
    }
}