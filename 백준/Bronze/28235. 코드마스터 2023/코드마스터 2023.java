import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

       String s = st.nextToken();

       if(s.equals("SONGDO")){
           System.out.println("HIGHSCHOOL");
       } else if(s.equals("CODE")){
            System.out.println("MASTER");
        } else if(s.equals("2023")){
           System.out.println("0611");
       } else if(s.equals("ALGORITHM")){
           System.out.println("CONTEST");
       }

    }
}