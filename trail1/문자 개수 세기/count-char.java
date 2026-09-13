import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String x = sc.next();
        int sum = str.length();
        int cnt = 0;
        for (int i =0;i<sum;i++) {
            if(x.charAt(0)==str.charAt(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
