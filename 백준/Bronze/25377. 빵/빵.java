import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int minTime = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A <= B) {
                minTime = Math.min(minTime, B);
            }
        }


        if (minTime == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minTime);
        }

        sc.close();
    }
        

}