package challenge;


public class left_right {

	public static void main(String[] args) {
			
			int left = 13;
			int right = 17;
			int[] a = new int[right-left+1];
			int sum = 0;
			
			for(int i = 0; i<=right-left; i++) {
				
				a[i] = left+i;
			}
			
			
			for (int i = 0; i < a.length; i++) {
				int temp = 0;
				for (int j = 1; j <= a[i]; j++) {
					if(a[i]%j == 0 ) {
						temp++;
					}
				}
				if(temp % 2 == 0) {
					sum += a[i];
				}else {
					sum -= a[i];
				}
				
			}
			
			
			
			
			
			
	}

}
