package level_1;
import java.util.Scanner;
// ���簢�� �����
public class Rectangle_star_drawing {
	

	public class Solution {
	    public void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	    	for (int i = 0; i < b; i++) {
				for (int j = 0; j < a; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	    	sc.close();
	    }
	}

}