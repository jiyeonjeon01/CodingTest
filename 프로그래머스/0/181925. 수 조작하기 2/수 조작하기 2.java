class Solution {
  public String solution(int[] numLog) {
  
  	String sum = "";
  	
  	for(int i=1; i<numLog.length; i++) {
  		if(numLog[i] - numLog[i-1] == 1 ) {
  			sum += "w";
  		}else if (numLog[i] - numLog[i-1] == -1) {
  			sum += "s";
  		}else if (numLog[i] - numLog[i-1] == 10) {
  			sum += "d";
  		}else if (numLog[i] - numLog[i-1] == -10){
  			sum += "a";
  		}
  		
  	}

      return sum;
  }
}