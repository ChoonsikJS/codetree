import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input= new int[2];
        for(int i=0; i<10; i++){
            input[i%2] = sc.nextInt();
            if (input[i%2]%3==0){
                if(i%2==0){
                    System.out.print(input[1]);
                    break;
                }
                if(i%2==1){
                    System.out.print(input[0]);
                    break;
                }
            }
        }
    }
}