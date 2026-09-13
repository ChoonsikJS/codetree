import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int sum = Math.max(str1.length(), str2.length());
        sum = Math.max(sum, str3.length());
        int min = Math.min(str1.length(), str2.length());
        min = Math.min(min, str3.length());
        System.out.println(sum-min);
    }
}
