import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abil = new int[6];
        for (int i = 0; i < abil.length; i++) {
            abil[i]=sc.nextInt();
        }
        Arrays.sort(abil);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int tmp = abil[i]+abil[abil.length-1-i];
            max = Math.max(max, tmp);
            min = Math.min(min, tmp);
        }
        System.out.println(max-min);
    }   
}

