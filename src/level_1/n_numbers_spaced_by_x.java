package level_1;
// x��ŭ ������ �ִ� n���� ����
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