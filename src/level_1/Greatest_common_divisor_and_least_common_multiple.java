package level_1;

public class Greatest_common_divisor_and_least_common_multiple {
	//최소 공배수, 최대 공약수
	class Solution {
		public int[] solution(int n, int m) {

			int a = n;
			int b = m;
			int[] answer = new int[2];

			while (b != 0) {
				int r = a % b;
				a = b;
				b = r;
			}
			answer[0] = a;
			int c = (n * m) / a;
			answer[1] = c;

			return answer;
		}
	}

}
