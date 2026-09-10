import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp=sc.nextInt();
        while(tmp!=0){
            if(tmp%2==0) System.out.print(tmp/2+" ");
            if(tmp%2==1) System.out.print((tmp+3)+" ");
            tmp=sc.nextInt();
        }
    }
}