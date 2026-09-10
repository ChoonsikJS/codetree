import java.util.Scanner;

public class Main {
    public static void print5Stars(int v) {
        for(int i = 0; i < v; i++)
            System.out.println("12345^&*()_");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        print5Stars(v); 
    }
}