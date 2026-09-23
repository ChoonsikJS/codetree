import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-2; j++) {
                int tmp = grid[i][j]+grid[i][j+1]+grid[i][j+2];
                max = Math.max(max, tmp);
            }
            if(max==3){
                break;
            }
        }
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = grid[j][i]+grid[j][i+1]+grid[j][i+2];
                max = Math.max(max, tmp);
            }
            if(max==3){
                break;
            }
        }
        System.out.print(max);
    }
}