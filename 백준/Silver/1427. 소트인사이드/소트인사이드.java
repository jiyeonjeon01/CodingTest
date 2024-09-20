import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(String.valueOf(N).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}