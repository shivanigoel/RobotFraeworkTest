package practice;

public class plaindrome {
	
	public static void main(String[] args) {
		
		String s1="Shivani";
		String s2="inavihS";
		
		s1.toLowerCase();
		s2.toLowerCase();
		String rev="";
	
		
		for(int i=s2.length()-1;i>=0;i--) {
			
			char s3=s2.charAt(i);
			rev=rev+String.valueOf(s3);
			

		}
		
		
		
		System.out.println(rev);
		
		
		
		if(s1.equalsIgnoreCase(rev)) {
			
			System.out.println("String is palindrome");
		}
		
	}
	

}
