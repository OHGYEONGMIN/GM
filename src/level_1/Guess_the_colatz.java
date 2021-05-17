package level_1;

public class Guess_the_colatz {

	class Solution {
		public int solution(int num) {

			int n = 0;
			while (num != 1) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = num * 3 + 1;
				}

				if (n == 500 || num < 0) {
					n = -1;
					break;
				}
				n++;
			}
			int answer = n;
			return answer;
		}
	}

}
