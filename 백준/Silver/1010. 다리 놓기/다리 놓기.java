import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N, M;
        int a;

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            N=0;
            M=0;
            boolean validInput = false;

            while(!validInput) {

                StringTokenizer st = new StringTokenizer(br.readLine());
                N = Integer.parseInt(st.nextToken());
                M = Integer.parseInt(st.nextToken());

                if(N >= 1 && N<= 30 && M >= 1 && M<= 30){
                    validInput = true;
                }
            }
            int result = comb(M, N);
            System.out.println(result);
        }
    }

    // nCm 조합 공식 구현하기
    public static int comb(int n, int m){
        if(m == 0 || n == m){
            return 1;
        }
        int r = Math.min(m, n-m);
        int result = 1;

        for(int i = 1; i <= r; i++){
            result *= n--;
            result /= i;
        }
        return result;
    }
}
