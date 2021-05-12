package level_1;

import java.util.Arrays;

public class Matrix_addition {

	public static void main(String[] args) {
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		//1,2
		
		 int[][] answer = new int[arr1.length][arr1[0].length];
			
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2[0].length; j++) {
					answer[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
//	      return answer;
	      System.out.println(Arrays.deepToString(answer));

	}

}
