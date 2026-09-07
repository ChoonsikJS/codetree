import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[3];
        int input=0;
        for(int i=0; i<100; i++){
            input=sc.nextInt();
            if (input ==0) break;
            arr[i%3]=input;
        }
        for(int i=0;i<arr.length;i++){
            input+=arr[i];
        }
        System.out.print(input);
    }
}