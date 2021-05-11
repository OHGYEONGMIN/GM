package level_1;
// x만큼 간격이 있는 n개의 숫자
public class n_numbers_spaced_by_x {
	
	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        for(int i = 0; i < n; i++){
	            if(i==0){
	                answer[i] = x;
	            }else{
	                answer[i] = answer[i-1] + x; 
	            }
	        }
	       
	        return answer;
	    }
	}

}
