import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt =0;

        for (int i = 1 ; i <= 10 ; i++){
            if(cnt==2)break;
            System.out.print(N*i + " ");
            if(((N*i) % 5) == 0) cnt++;
        }
    }
}