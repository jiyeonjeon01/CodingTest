import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();


        for(int i=2; i<=N; i++){
            if(N % i == 0 ){
                while(N % i == 0){
                    N /= i;
                    list.add(i);
                }
            }
        }

    int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }
    }
}