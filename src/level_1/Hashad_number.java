package level_1;

public class Hashad_number {
	//�ϻ��� ��
	class Solution {
	    public boolean solution(int x) {
	        String a = Integer.toString(x);
			String[] al = a.split("");
			int[] xl = new int[al.length];
			for (int i = 0; i < al.length; i++) {
				xl[i] = Integer.parseInt(al[i]);
			}
			int sum = 0;
			for (int i = 0; i < xl.length; i++) {
				sum += xl[i];
			}
	        boolean answer = true;
	        if(((int) x%sum) == 0) {
				answer = true;
			}else {
				answer = false;
			}
	        
	        return answer;
	    }
	}

}
