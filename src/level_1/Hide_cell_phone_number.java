package level_1;
//핸드폰 번호 가리기
public class Hide_cell_phone_number {
	
	class Solution {
	    public String solution(String phone_number) {
	        
	        
	        String[] A = phone_number.split("");
			for (int i = 0; i < A.length-4; i++) {
				A[i] = "*";
			}
			StringBuilder B = new StringBuilder();
			for (int i = 0; i < A.length; i++) {
				B.append(A[i]);
			}
	        
	        String answer = B.toString();
	        return answer;
	    }
	}

}
