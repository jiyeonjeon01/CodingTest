
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        // h-y, y 둘비교
        // w-x, w 둘비교

        // 위 둘에서 왕중왕전

        int xchuk = Math.min(h-y, y);

        int ychuk = Math.min(w-x, x);

        System.out.println(Math.min(xchuk, ychuk));
    }
}