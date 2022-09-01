package beginner;

import java.util.Scanner;

public class Problem_002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();//RTP 4 credits
            int y = scan.nextInt();//Audit 2 credits
            int z = scan.nextInt();//Non RTP No Credits
            System.out.println((x * 4) + (y * 2));
        }
    }
}
