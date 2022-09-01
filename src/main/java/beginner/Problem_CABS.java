package beginner;

import java.util.Scanner;

public class Problem_CABS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x == y) System.out.println("ANY");
            else if (x < y) System.out.println("FIRST");
            else System.out.println("SECOND");
        }
    }
}
