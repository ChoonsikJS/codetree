import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum1 = 0;
        double sum2 = 0;
        int cnt = 0;
        
        for(int i=0; i<10; i++){
            arr[i]=sc.nextInt();
            if((i+1)%2==0){
                sum1+=arr[i];
            }
            if((i+1)%3==0){
                sum2+=arr[i];
                cnt++;
            }
        }

        System.out.print(sum1+" ");
        System.out.print(String.format("%.1f", sum2/cnt));
    }
}