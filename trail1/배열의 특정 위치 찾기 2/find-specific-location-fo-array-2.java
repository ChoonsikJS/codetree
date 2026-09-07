import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd=0;
        int even=0;
        for(int i=0; i<10; i++){
            if((i+1)%2==0){
                even+=sc.nextInt();
            }
            if((i+1)%2==1){
                odd+=sc.nextInt();
            }
        }
        if(odd>even){
            System.out.print(odd-even);
        }else{
            System.out.print(even-odd);
        }
    }
}