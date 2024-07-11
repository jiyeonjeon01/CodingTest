import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals(".")) {
				break;
			}
			
			sb.append(solve(s)).append('\n');
		}
		
		System.out.println(sb);

	}
	
	public static String solve(String s) {
		char[] stack = new char[s.length()];
		int size = 0;
		
		for(char val : s.toCharArray()) {
			
			if(val == '(' || val == '[') {
				stack[size] = val;
				size++;
			} else if(val == ')'){
				if(size == 0 || stack[size -1] != '(') {
					return "no";
				}else {
					size--;
				}
			} else if(val == ']') {
				if(size == 0 || stack[size - 1] != '[') {
					return "no";
				} else {
					size--;
				}
			}
		}
		
		if(size != 0) {
			return "no";
		}else {
			return "yes";
		}
	}

}