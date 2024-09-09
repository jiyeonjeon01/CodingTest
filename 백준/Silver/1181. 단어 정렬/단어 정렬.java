import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            // arr배열에 N만큼 입력받은 값 넣기
            arr[i] = str;
        }

        // 내림차순 정렬, for문 안에 잇으면 오류남
        Arrays.sort(arr);

        Arrays.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                int lengthCompare = Integer.compare(s1.length(), s2.length());
                if(lengthCompare != 0){
                    return lengthCompare;
                }
                return s1.compareTo(s2);
            }
        });

        // 배열을 LinkedHashSet으로 변환
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));

        // Hashset을 배열로 변환
        String[] resultArr = linkedHashSet.toArray(new String[0]);

        // 정렬이 완료된 arr속 원소들 출력
        for(int j=0; j<resultArr.length; j++){
            // 없는 경우 출력
            System.out.println(resultArr[j]);
        }

    }
}
