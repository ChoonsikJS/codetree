import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            if((i+1)%2==1)
                System.out.println(arr[i]);
        }
    }
}