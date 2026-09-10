import java.util.Scanner;
public class Main {
    static int three(int a, int b){
        int cnt =0;
        for (int i = a; i <= b; i++){
            if(ismul(i)||isthree(i)) cnt++;
        }
        return cnt;
    }
    static boolean isthree(int i){
        int tmp = i;
        while(i>0){
            if(i%10==3||i%10==6||i%10==9) {
                // System.out.print(tmp+" ");
                return true;}
            i /= 10;
        }
        return false;
    }
    static boolean ismul(int i){
        if(i%3==0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = three(A, B);

        System.out.print(ans);
    }
}