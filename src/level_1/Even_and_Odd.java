package level_1;

public class Even_and_Odd {

	class Solution {
		public String solution(int num) {
			String answer = "";

			if (num % 2 == 0) {
				answer = "Even";
			} else {
				answer = "Odd";
			}

			return answer;
		}
	}

}
