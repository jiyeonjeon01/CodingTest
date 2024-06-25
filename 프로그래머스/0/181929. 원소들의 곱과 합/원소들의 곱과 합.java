class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 1;
        
        for(int i=0; i<num_list.length; i++) {
        	sum0 += num_list[i];
        	sum1 = sum0 * sum0;
        	sum2 *= num_list[i];
        }
        
        if(sum1 < sum2) {
        	answer = 0;
        } else {
        	answer = 1;
        } 
        return answer;
    }
}