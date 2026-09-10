import java.util.Scanner;

public class Main {
    public static void print5Stars(int r) {
        int num=1;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < r; j++){
                System.out.print((num++) + " ");
                if(num==10) num=1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        print5Stars(rowNum); 
        // Please write your code here.
    }
}