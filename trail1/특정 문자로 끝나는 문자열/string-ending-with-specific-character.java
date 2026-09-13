import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();
        }
        char x = sc.next().charAt(0);
        boolean chk =true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(arr[i].length()-1)==x){
                System.out.println(arr[i]);
                chk =false;
            }
        }
        if(chk) System.out.print("None");
    }
}