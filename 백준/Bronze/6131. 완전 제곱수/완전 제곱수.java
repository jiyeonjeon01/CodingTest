import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double a, b;
        int sum = 0;
        int a1, b1;

        for(int i=1; i<=501; i++){
            for(int j=1; j<=501; j++){
                a = (int)(Math.pow(i, 2));
                b = (int)(Math.pow(j, 2));

                if(a == b + N){
                    sum++;
                }

            }

        }
        System.out.println(sum);
    }
}