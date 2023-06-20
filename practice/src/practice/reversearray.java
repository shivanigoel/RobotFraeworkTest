package practice;

public class reversearray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,5,7,3,4};
		
		int left=0;
		int right =a.length-1;
		
		while(left<right) {
			
			int c=a[left];
			a[left]=a[right];
			a[right]=c;
			
			left++;
			right--;
			
		}
		
		for (int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
				
	}
}
