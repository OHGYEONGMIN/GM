package level_1;
//Æò±Õ ±¸ÇÏ±â
public class Finding_the_average {
	
	class Solution {
	    public double solution(int[] arr) {
	        double sum = 0;
	        for(int i = 0; i<arr.length; i++){
	            sum += arr[i];
	        }
	        double answer = sum/arr.length;
	        return answer;
	    }
	}

}
