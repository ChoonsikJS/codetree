import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        int S = sc.nextInt();

        int[] eatPerson = new int[D];
        int[] eatCheese = new int[D];
        int[] eatTime = new int[D];
        for (int i = 0; i < D; i++) {
            eatPerson[i] = sc.nextInt();
            eatCheese[i] = sc.nextInt();
            eatTime[i] = sc.nextInt();
        }

        int[] sickPerson = new int[S];
        int[] sickTime = new int[S];
        for (int i = 0; i < S; i++) {
            sickPerson[i] = sc.nextInt();
            sickTime[i] = sc.nextInt();
        }

        int maxPill = 0;

        for (int i = 1; i < M + 1; i++) {
            boolean possible = true;
            for (int j = 0; j < S; j++) {
                boolean ateCheese = false;
                for (int k = 0; k < D; k++) {
                    if (eatCheese[k] == i && eatTime[k] < sickTime[j] && sickPerson[j] == eatPerson[k]) {
                        ateCheese = true;
                        break;
                    }
                } 
                if (!ateCheese) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                boolean[] ate = new boolean[N + 1];
                int count = 0;
                for (int j = 0; j < D; j++) {
                    if (eatCheese[j] == i) {
                        if (!ate[eatPerson[j]]) {
                            ate[eatPerson[j]] = true;
                            count++;
                        }
                    }
                }
                maxPill = Math.max(maxPill, count);
            }
        }
        System.out.println(maxPill);
    }
}