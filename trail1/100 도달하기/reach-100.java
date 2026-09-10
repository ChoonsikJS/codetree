import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int pibo = 1;
        int pibo2 = N;
        int pibo3 = 1;

        System.out.print(pibo + " ");
        System.out.print(pibo2 + " ");
        
        while (pibo3 < 100){
            pibo3 = pibo + pibo2;
            System.out.print(pibo3 + " ");
            pibo = pibo2;
            pibo2= pibo3;
        }
    }
}