import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;
        char a = sc.nextLine().charAt(0);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(2)==a||arr[i].charAt(3)==a){
                System.out.println(arr[i]);
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}