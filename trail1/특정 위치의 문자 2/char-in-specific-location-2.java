import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        for(int i=0; i<10; i++){
            x = sc.next();
            if((i+1)==2) System.out.print(x+" ");
            if((i+1)==5) System.out.print(x+" ");
            if((i+1)==8) System.out.print(x);
        }
    }
}