class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int len1 = overwrite_string.length();
        int len2 = my_string.length();
        
        String sub1 = my_string.substring(0, s);
        String sub2 = my_string.substring((s+len1), len2);
        
        answer += sub1 + overwrite_string + sub2;
    
        return answer;
        
    }
}