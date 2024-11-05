import java.util.Scanner;

public class Main {
    //    입력
//    첫째 줄에 단어의 개수 N이 들어온다.
//    N은 100보다 작거나 같은 자연수이다.
//    둘째 줄부터 N개의 줄에 단어가 들어온다.
//    단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//    첫째 줄에 그룹 단어의 개수를 출력한다.
    // a~z: 97~122 (26)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 첫째줄 단어의 개수
        sc.nextLine();
        int count = 0; // 최종 출력할 단어의 개수 담는 변수

        for(int i=0; i<N; i++) {
            String str = sc.nextLine();

            if(isGroupWord(str)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isGroupWord(String str) {
        boolean[] alphabet = new boolean[26];
        char prev = 0;

        for(int i=0; i<str.length(); i++) {
            char cur = str.charAt(i); // 현재 알파벳 하나 저장

            if(cur!=prev && alphabet[cur-'a']) { //(이전 문자와 다름 && 등장한 적 있는 단어) 라면
                return false;
            }
            alphabet[cur-'a'] = true;
            prev = cur;
        }
        return true;
    }
}
