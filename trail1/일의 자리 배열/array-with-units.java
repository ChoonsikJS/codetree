import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        for(int i =2; i<10;i++){
            arr[i]=arr[i-2]+arr[i-1];
            if (arr[i]>=10){
                arr[i]%=10;
            }
        }
        for(int x:arr){
            System.out.print(x + " ");
        }
    }
}